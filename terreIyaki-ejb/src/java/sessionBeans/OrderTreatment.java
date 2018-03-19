/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Account;
import entityBeans.Combo;
import entityBeans.Product;
import java.util.ArrayList;
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

    public void persist(Object object) {
        em.persist(object);
    }
    
    
    
}
