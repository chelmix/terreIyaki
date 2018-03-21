
package subControllers;

import entityBeans.Combo;
import entityBeans.ComboCategory;
import entityBeans.Product;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
 try{
 HashMap<String,List<Product>> ha01 = gestionCommande.getHashProduct(comboName01);
 request.setAttribute("HashProduct", ha01);
  }catch(CustomException ex){
 String texte = ex.getMessage();
 request.setAttribute("message", texte);
  }
     
 }
// }catch(NullPointerException ne){
//     //on ne fait rien
// }
 //***************************Afficher le menu choisi****************Fin****************  
 
 
 
 
 
 
 


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
