/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import entityBeans.MyOrder;
import entityBeans.OrderItem;
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
import javax.servlet.http.HttpSession;
import sessionBeans.PayementTreatmentLocal;
import tools.CustomException;
import tools.ProductAmount;

/**
 *
 * @author jeanno
 */
public class PaymentCtrl implements ControllerInterface, Serializable {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        PayementTreatmentLocal traiterPaiement = lookupPayementTreatmentLocal();
        
try{
        if(request.getParameter("action").equals("enCours")){
            
            try{
                //on récupère la liste des commabdes non réglés
            List<MyOrder> my01 = traiterPaiement.getOrderToPay();
            request.setAttribute("commandeToPay", my01);
        //   HashMap<Long,ProductAmount>ha01=new HashMap();
           HashMap<Long,ProductAmount>ha02=new HashMap();
            //pour chaque commande on récupère le montant
           //code pas très joli mais je suis fatigué ...
            for (int i=0;i<my01.size();i++){
                traiterPaiement.getMontant(my01.get(i).getId(), ha02);
            }
            request.setAttribute("commandeToPayHash", ha02);
            
            //test

            
                    
            }catch (CustomException ex){
                String text = ex.getMessage();
                request.setAttribute("message",text);
            }
            
            
        }
}catch(NullPointerException ex){
    
    
}




//**************on sélectionne une facture à payer Début *******************
//  section=payment&action=enCours
// &section=payment&action=versPayer&id=7
try{
if(request.getParameter("action").equals("versPayer")){
Long id = Long.valueOf(request.getParameter("id"));

       
             try{
           List<OrderItem> or01= traiterPaiement.getItemsFromOrder(id);
          
            request.setAttribute("listItem", or01);
            
            HashMap<Long,ProductAmount> ha01 = new HashMap();
            traiterPaiement.getMontant(id, ha01);
            request.setAttribute("price", ha01);
            
            
            }catch (CustomException ex){
                String text = ex.getMessage();
                request.setAttribute("message",text);
            }
}
}catch(NullPointerException ex){
    
}

//**************on sélectionne une facture à payer Fin *******************

        
        return "payment";
    }
    
    
    
private PayementTreatmentLocal lookupPayementTreatmentLocal(){
    try{
      Context c = new InitialContext();
      return (PayementTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/PayementTreatment!sessionBeans.PayementTreatmentLocal");
    }catch(NamingException ne){
        Logger.getLogger(getClass().getName()).log(Level.SEVERE,"exception caught", ne);
        throw new RuntimeException(ne);
    }
    
}
    
}
