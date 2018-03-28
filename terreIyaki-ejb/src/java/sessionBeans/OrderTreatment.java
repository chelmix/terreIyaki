/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Combo;
import entityBeans.ComboCategory;
import entityBeans.MyOrder;
import entityBeans.OrderItem;
import entityBeans.Payment;
import entityBeans.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import tools.CustomException;
import tools.TriParComboCategory;
//import tools.TriParComboCategory;



/**
 *
 * @author jeanno
 */
@Stateless
public class OrderTreatment implements OrderTreatmentLocal {

    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
    
CatalogTreatmentLocal catalogTreatment = lookupCatalogTreatmentLocal();
//    private HashMap<String,Long> panier ;
//    
//    @PostConstruct
//    @Override
//    public void init(){
//      HashMap<String,Long>   panier = new HashMap<>();
//    }
//    
    
    
    
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
     public List<Product> getComboProduct(String nomCategorie, String nomMenu) throws CustomException, SecurityException{
       
         
         
     List<Product> po04 = new ArrayList();
     String req04 = "Select c.products from  ComboCategory c where c.name= :paramComboCategoryName and c.combo.name =:paramComboName";   
        Query qr04 = em.createQuery(req04);
qr04.setParameter("paramComboCategoryName", nomCategorie);
qr04.setParameter("paramComboName",nomMenu);
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
//*********************************************************  
//*********************************************************  
//il faut trier la c03 en fonction de number
 //*********************************************************  
 //*********************************************************   
         List<ComboCategory>c05 = new ArrayList();
         TriParComboCategory c04 = new TriParComboCategory();
       Collections.sort(c03, c04);        
 System.out.println("triiiiiiiiiiiiiiiiiiiiiiiiiii\n"+c03.toString());

 for(int i=0;i<c03.size();i++){
     System.out.println(i+" "+c03.get(i).getNumber()+"*******************************");
     
 }
  //**********insertion hashmap**********début
         for(int i=0;i<c03.size();i++){
       List<Product> po04 = new ArrayList(); 
     String req04 = "Select c.products from  ComboCategory c where c.name= :paramComboCategoryName and c.combo.name =:paramComboName";   
        Query qr04 = em.createQuery(req04);
qr04.setParameter("paramComboCategoryName", c03.get(i).getName());
qr04.setParameter("paramComboName", nomMenu);
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
     
     
     //a chaque clique on ajoute 1 produit
    @Override
    public HashMap<String,Long> getPanier(String nomComboCat,String nomProduit) throws CustomException {
  //  Product p01 = new Product();
     HashMap<String,Long> panier = new HashMap();
     String req01 = "select p from Product p where  p.name =:paramNameProduct";   
        Query qr01 = em.createQuery(req01);
qr01.setParameter("paramNameProduct", nomProduit);
         try{
             
             
             Product p01 = (Product) qr01.getSingleResult();

panier.put(nomComboCat, p01.getId());
return panier;
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "aucun produit");
            throw ce;         
 }       
        
      //  HashMap<Long,Integer> panier = new HashMap();
    }
    
    
    
    //on récupère toutes les id produits des menus commandés, ainsi que leur nombre
    @Override
 public HashMap<Long,Integer> getMenuProductCommande (HashMap<String,Long> getPanier) {
    HashMap<Long,Integer> menuProductPaid = new HashMap();
    for(HashMap.Entry<String,Long>entry : getPanier.entrySet()){
       Long idProduct = (Long) entry.getValue();
 
       menuProductPaid.put(idProduct, 1);
       
       
    }
    
    return menuProductPaid;
   
}
 

 public Combo getComboByName(String nameComboChoice) throws CustomException{
     Combo co01;
   TypedQuery<Combo> qr = em.createNamedQuery("entityBeans.Combo.getComboByName",Combo.class);  
     qr.setParameter("paramComboName", nameComboChoice);
     try{
         co01=qr.getSingleResult();
         
     }catch(NoResultException ex) {
            CustomException ce = new CustomException(CustomException.USER_ERR,"pas de combo");
         throw ce;
     }       
     return co01;
 }
 
 //dans cette méthode je créé l'objet orderItem et je fais un set avec le combo
 //je créé orderItem et je fais un set avec l'objet product 
    @Override
    public void comboPersist(HashMap<String,Long>  hashPanier, String nameComboChoice, MyOrder myOrderPersist) throws CustomException{
 
     //   List <OrderItem> listOrderItem = new ArrayList (); 
        
    try{
    Combo co01 =  getComboByName(nameComboChoice);
    OrderItem oi = new OrderItem (0f, 0f);
  //  listOrderItem.add(oi); 
oi.setCombo(co01);
em.persist(oi);
oi.setMyOrder(myOrderPersist);
  }catch(NoResultException ex) {
            CustomException ce = new CustomException(CustomException.USER_ERR,"pas de produit");
         throw ce;
         
     }  



Product po01;

List<Product>li01=new ArrayList();

for(HashMap.Entry<String,Long>entry : hashPanier.entrySet()){
    try{
    String idString= String.valueOf(entry.getValue());
       po01= catalogTreatment.getProductById(idString);
        li01.add(po01);
        System.out.println("*************Object *************   "+ po01.toString());
        
       System.out.println("*************Object Prix*************   "+ po01.getPrice());
       System.out.println("*************Object Tax*************   "+  po01.getVat().getRate());
       OrderItem oi = new OrderItem (po01.getPrice(), po01.getVat().getRate());
    //    listOrderItem.add(oi);
       oi.setProduct(po01);
       oi.setMyOrder(myOrderPersist);
       em.persist(oi);
//       em.flush();
    }catch(NoResultException ex) {
            CustomException ce = new CustomException(CustomException.USER_ERR,"pas de produit");
         throw ce;
     }       
        
    }
//              HashMap<String,Long>  hashPanier =(HashMap<String,Long>)session.getAttribute("hashPanier");
//            String  nameComboChoice = (String) session.getAttribute("nameComboChoice");
//     List<OrderItem>  listOrderItem = gestionCommande.comboPersist(hashPanier, nameComboChoice);
//     MyOrder myOrder = (MyOrder) session.getAttribute("myOrder"); 
//     myOrder.setOrderItems(listOrderItem);
//     em.merge(myOrder);  

//listOrderItem
//myOrderPersist

//return  listOrderItem;
  

}
    
//    //ca marche pas
//    @Override
//    public void mergeComboWithMyOrder( List<OrderItem>  listOrderItem, MyOrder myOrder){
//        
//    myOrder.setOrderItems(listOrderItem);
//        System.out.println("test samira"+ listOrderItem.toString());
//    em.merge(myOrder);
//    
//        
//        
//    }
    
    
//    @Override
//    public MyOrder getLastOrderByTable(int numeroTable) throws CustomException{
//        
// 
//    TypedQuery<MyOrder> qr = em.createNamedQuery("entityBeans.MyOrder.getLastOrderByTableNumber",MyOrder.class);  
//        qr.setParameter("paramTableNumber", numeroTable);
//        
//    try{
//    MyOrder maCommande  =  qr.getSingleResult();
// return maCommande;
//    }catch(NoResultException ex) {
//            CustomException ce = new CustomException(CustomException.USER_ERR,"pas de combo");
//         throw ce;
//
//    
//    
//    }
//        
//    }
    
    
    
    
    
    
    
    //méthode en private pour utiliser un autre métier
         private CatalogTreatmentLocal lookupCatalogTreatmentLocal() {
        try {
            Context c = new InitialContext();
            return (CatalogTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/CatalogTreatment!sessionBeans.CatalogTreatmentLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    

    
    
    
    

 
  }    

    

 
 
    //on récupère tous les menus commandés

    
    

//    public void persist(Object object) {
//        em.persist(object);
//    }


//    public int compareTo(ComboCategory obj, ComboCategory cible) {
//        int d01 = obj.getNumber();
//        int d02 = cible.getNumber();
//        int delta = d01 - d02;
//        if(delta < 0){
//            return -1;
//        }else if(delta > 0){
//            return 1;
//        }else{
//            return 0;
//        }
//    } 
    
//        public int compareTo(Ville cible) {
//        String nom01 = this.getNom();
//        if(nom01 == null){
//            return -1;
//        }
//        String nom02 = cible.getNom();
//        if(nom02 == null){
//            return 1;
//        }
   //    public int compare(ComboCategory obj, ComboCategory cible) {
//        int d01 = obj.getNumber();
//        int d02 = cible.getNumber();
//        int delta = d01 - d02;
//        if(delta < 0){
//            return -1;
//        }else if(delta > 0){
//            return 1;
//        }else{
//            return 0;
//        }
//    } 

