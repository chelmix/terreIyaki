
package subControllers;

import entityBeans.Combo;
import entityBeans.ComboCategory;
import entityBeans.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionBeans.OrderTreatmentLocal;
import tools.CustomException;


public class ComboCtrl implements ControllerInterface, Serializable {
    
    /**
     *
     * @param request
     * @param response
     * @return renvoy vers la page des combos
     */
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response){
        OrderTreatmentLocal gestionCommande = lookupOrderTreatmentLocal();  
        HttpSession session = request.getSession();
        
        //***************************Afficher tous les menus****************Début****************
 if(request.getParameter("action").equals("allCombo")){
   
     
     try{
     List<Combo> c01 = (List<Combo>) gestionCommande.getCombo();
     request.setAttribute("combo", c01);
     
//     //je test l affichage d'une HashMap en jstl
//      HashMap<Integer, Combo> ha01 = new HashMap();
//      for(int i=0;i<c01.size();i++){
//      ha01.put(i, c01.get(i));
//      }
// request.setAttribute("map", ha01);
// System.out.println("********************* hashMap"+ha01.get(1).getName());
     
     
     
     
     }catch(CustomException ex){
                        String texte = ex.getMessage();
                        request.setAttribute("message", texte);         
     }
 }
 
 
 
 
 //***************************Afficher tous les menus****************Fin****************
 
 
 
 //***************************Afficher le menu choisi****************début**************** 
// try{
        
 if(request.getParameter("action").equals("monCombo")){
//     String comboName01 = request.getParameter("comboName");
//     try{
//     List<ComboCategory> c03 = (List<ComboCategory> ) gestionCommande.getComboCat(comboName01);
//     request.setAttribute("comboCategorieAll", c03);
//     request.setAttribute("comboName02",comboName01);
//          }catch(CustomException ex){
//                        String texte = ex.getMessage();
//                        request.setAttribute("message", texte);  
//                        
// }
//     try{
//     List<Product>p01 = gestionCommande.getComboProductAll(comboName01);
//     request.setAttribute("productCombo", p01);
//             }catch(CustomException ex){
//                        String texte = ex.getMessage();
//                        request.setAttribute("message", texte);  
//                        
// }  
//     
 String comboName01 = request.getParameter("comboName");
 request.setAttribute("comboName02",comboName01);
//********************************************** 
 
 //try{
 

     //on vide la liste
 try{
 request.removeAttribute("HashProduct");
 }catch(NullPointerException ex){
     
 }
 
 
 try{
 HashMap<String,List<Product>> ha01 = gestionCommande.getHashProduct(comboName01);
 //on compte le nombre de clef dans la HashMap

int nb=0; 
for (HashMap.Entry<String,List<Product>> entry : ha01.entrySet())
{
   if(!entry.getKey().isEmpty()){
       nb=nb+1;
   }
   
} 
//System.out.println("le nombre***************    :"+nb);
session.setAttribute("nombre", nb);
 
 HashMap<String,List<Product>> ha02 =new HashMap(); 
 List<Product>lp01 = new ArrayList();
 String myKey="";
 //***************************************tri de la hashMap à l'aide de TreeMap*******début 
      Set set = ha01.entrySet();
      Iterator iterator = set.iterator();
      System.out.println("Avant le tri: ");
      while(iterator.hasNext()) {
         Map.Entry me = (Map.Entry)iterator.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }

      Map sortedMap = new TreeMap(ha01);

      Set set2 = sortedMap.entrySet();
      Iterator iterator2 = set2.iterator();
      System.out.println("Après le tri: ");
      while(iterator2.hasNext()) {
         Map.Entry me2 = (Map.Entry)iterator2.next();
//         System.out.print(me2.getKey() + ": ");
//         System.out.println(me2.getValue());
         myKey = String.valueOf(me2.getKey());
         lp01 = (List<Product>) me2.getValue();
         ha02.put(myKey , lp01);
          System.out.print(myKey + ": ");
         System.out.println(lp01.toString());        
      } 
      
  
 
 //***************************************tri de la hashMap à l'aide de TreeMap*******fin 
 request.setAttribute("HashProduct", ha02);
  }catch(CustomException ex){
 String texte = ex.getMessage();
 request.setAttribute("message", texte);
  
   
 
 }
 
 
 
 
 
 //*********************************************
 }
// }catch(NullPointerException ne){
//     //on ne fait rien
// }
 //***************************Afficher le menu choisi****************Fin****************  
 
 
 //**************************le menu a été choisi************************* début ****************
 
try{ 
 if(request.getParameter("action").equals("comboChoice")){
String nomMenuChoisi = request.getParameter("comboName");
request.setAttribute("nameComboChoice", nomMenuChoisi); 

//inutil le menu a déjà été choisi
//                  try {
//                        List<Combo> c01 = (List<Combo>) gestionCommande.getCombo();
//                        request.setAttribute("combo", c01); 
//                                            } catch (CustomException ex) {
//                        String texte = ex.getMessage();
//                        request.setAttribute("message", texte);
//                    }

//****************************************************************************
               try{
                if (request.getParameter("detection").equals("itemFormul")) {
                    
                    


 
                        try {
                            List<ComboCategory> c02 = (List<ComboCategory>) gestionCommande.getComboCat(nomMenuChoisi);
                            request.setAttribute("comboCategory", c02);

                        } catch (CustomException ex) {
                            String texte = ex.getMessage();
                            request.setAttribute("message", texte);
                        }
 //****************************************************************************                
           
                        
                        try {
                            String nomCategorie ="";
                    if (request.getParameter("faction").equals("produitFormul")) {
                        
                        
                        nomCategorie = request.getParameter("comboCategory");
                      request.setAttribute("nomCategorie", nomCategorie);
                        
                   //     List<Product> po01 = new ArrayList();//déclarer en dehors de la boucle pour le récupérer plus bas
                        try {
                            List<Product> po01  = (List<Product>) gestionCommande.getComboProduct(nomCategorie, nomMenuChoisi);
                            request.setAttribute("comboProduct", po01);
                            System.out.println("testnom categorie *********************"+nomCategorie);
                            
                            request.setAttribute("nameComboChoice02",nomCategorie);
                            
                            //        System.out.println("********************produits du menu"+po01.toString());
                        } catch (CustomException ex) {
                            String texte = ex.getMessage();
                            request.setAttribute("message", texte);
                        }
 //************On ajoute le produit *************************début*************************                          
                
    try {                      
                        
                        
       if (request.getParameter("vaction").equals("choix"))      {
       String choixDuProduit = request.getParameter("productChoose");
System.out.println("******************test panier ");       
   //on ajoute au panier    
// HashMap<Long,Integer> panier = new HashMap();
       try{
HashMap<String,Long> panier = gestionCommande.getPanier(nomCategorie, choixDuProduit);
session.setAttribute("hashPanier", panier);
System.out.println("******************test panier "+panier.toString());
   //************Si la formule est rempli on propose de valider *************************début*************************    
 
int nb=0;
for (HashMap.Entry<String,Long> entry : panier.entrySet())
{
   if(entry.getKey()!=null){
       nb=nb+1;
   }
   
}
System.out.println("le nombre calculé a la fin +++++++++++++++      "+nb);
int nbCat = (Integer) session.getAttribute("nombre");
System.out.println("int nbCat +++++++++++++++      "+nbCat);



//request.setAttribute("nameComboChoice02",nomCategorie);  

if(nbCat==nb){
request.setAttribute("menuRempli", "valider menu");
}


       
   //************Si la formule est rempli on propose de valider *************************fin*************************       
       







                        } catch (CustomException ex) {
                            String texte = ex.getMessage();
                            request.setAttribute("message", texte);
                        }
       

   }                    
                        
                              } catch (NullPointerException ex01) {

}                  
                        
                        
                        
  //************On ajoute le produit *************************fin*************************  
                    }
                
                
                
 //****************************************************************************                
                } catch (NullPointerException ex01) {
                    //nada
                }
 //****************************************************************************
             
                        
                        
                }
                 } catch (NullPointerException ex01) {
                    //nada
                }       

 }
 
 
                  } catch (NullPointerException ex01) {
                    //nada
                }       
//**************************le menu a été choisi************************* fin **************** 

    return "combo";
    } 

    
    private OrderTreatmentLocal lookupOrderTreatmentLocal() {
        try {
            Context c = new InitialContext();
            return (OrderTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/OrderTreatment!sessionBeans.OrderTreatmentLocal");

        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);

        }

    }    
    
}
