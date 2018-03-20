/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Combo;
import entityBeans.ComboCategory;
import entityBeans.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import tools.CustomException;

/**
 *
 * @author jeanno
 */
@Stateless
public class OrderTreatment implements OrderTreatmentLocal {
    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;

    
    
//méthode pour afficher produit
    
  
    
    @Override
    public List<Product> getProduct() throws CustomException, SecurityException{
     List<Product> p01 = new ArrayList();
     String req01 = "select p from Product p";   
        Query qr01 = em.createQuery(req01);

         try{
 p01= (List<Product>) qr01.getResultList();
 return   p01;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun produit");
            throw ce;         
 }
         
    }
       //méthode pour afficher menu    
    @Override
    public List<Combo> getCombo() throws CustomException, SecurityException{
     List<Combo> c01 = new ArrayList();
     String req02 = "select c from Combo c";   
        Query qr02 = em.createQuery(req02);

         try{
 c01= (List<Combo>)  qr02.getResultList();
 return   c01;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun menu");
            throw ce;         
 }         
        
        
    }
    
//afficher comboCategorie
    @Override
    public List<ComboCategory> getComboCat(String nomMenu) throws CustomException, SecurityException{
        
     List<ComboCategory> c03 = new ArrayList();
     String req03 = "Select c from ComboCategory c where c.combo.name =:paramComboName order by c.number";   
        Query qr03 = em.createQuery(req03);
qr03.setParameter("paramComboName", nomMenu);
         try{
 c03= (List<ComboCategory>)  qr03.getResultList();
 return   c03;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun sous menu");
            throw ce;         
 }         
               
    }    
    
 //afficher produit du sous categorie menus
    @Override
     public List<Product> getComboProduct(String nomCategorie) throws CustomException, SecurityException{
       
         
         
     List<Product> po04 = new ArrayList();
     String req04 = "Select c.products from  ComboCategory c where c.name= :paramComboCategoryName";   
        Query qr04 = em.createQuery(req04);
qr04.setParameter("paramComboCategoryName", nomCategorie);
         try{
 po04= (List<Product>)  qr04.getResultList();
 return   po04;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun produit dans sous menu");
            throw ce;         
 }         
        
        
    }    
     
     
     //*********************************************************************************
     //on insert un Combo, on index les combo item et en valeur on recupère les products

    /**
     *
     * @param nomMenu
     * @return on récupère une hashMap contenant en clef le sous menu et en valeure la list de produit du sous menu
     * @throws CustomException
     */
        @Override
     public HashMap<String, List<Product>> getHashProduct(String nomMenu) throws CustomException, SecurityException{
         
         HashMap <String, List<Product>> ha01 = new HashMap();
         
          List<ComboCategory> c03 = new ArrayList();
     String req03 = "Select c from ComboCategory c where c.combo.name =:paramComboName order by c.number";   
        Query qr03 = em.createQuery(req03);
qr03.setParameter("paramComboName", nomMenu);
         try{
 c03= (List<ComboCategory>)  qr03.getResultList();
 //return   c03;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun sous menu");
            throw ce;         
 }      
 // List<Product> po04 = new ArrayList();
  
  //**********insertion hashmap**********début
         for(int i=0;i<c03.size();i++){
       List<Product> po04 = new ArrayList(); 
     String req04 = "Select c.products from  ComboCategory c where c.name= :paramComboCategoryName order by c.number";   
        Query qr04 = em.createQuery(req04);
qr04.setParameter("paramComboCategoryName", c03.get(i).getName());
         try{
          
 po04= (List<Product>)  qr04.getResultList();
 ha01.put(c03.get(i).getName(), po04);
 System.out.println("+++++++++++++++produit de la hashMap "+po04.toString());
 //return   po04;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun produit dans sous menu");
            throw ce;         
 }
         }
   //**********insertion hashmap**********fin      
       return ha01;  
     }
     //**************************************************************************
     
     
     
     
    
    
    //besoin de tous les produits d'un menu ==> inutile
    @Override
      public List<Product> getComboProductAll (String nomMenu) throws CustomException, SecurityException{
        
     List<Product> po05 = new ArrayList();
     String req05 = "Select c.products from  ComboCategory c where c.combo.name= :paramComboName";   
        Query qr05 = em.createQuery(req05);
qr05.setParameter("paramComboName", nomMenu);
         try{
 po05= (List<Product>)  qr05.getResultList();
 return   po05;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun produit dans menu");
            throw ce;         
 }         
        
        
    }     
     
     
     
     

//    public void persist(Object object) {
//        em.persist(object);
//    }
    
    
    
}
