/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import entityBeans.Combo;
import entityBeans.Product;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionBeans.OrderTreatmentLocal;
import sessionBeans.UserTreatmentLocal;
import tools.CustomException;

/**
 *
 * @author jeanno
 */
@Stateless
public class versCarteJeannoryCtrl implements ControllerInterface, versCarteJeannoryCtrlLocal {

@Override
public String execute(HttpServletRequest request, HttpServletResponse response) {
    if (request.getParameter("action").equals("produit")){
        OrderTreatmentLocal gestionCommande = lookupOrderTreatmentLocal();
        
        try{
        List<Product> p01=  (List<Product>) gestionCommande.getProduct();
        request.setAttribute("product", p01);
        
                 } catch (CustomException ex) {
                    String texte = ex.getMessage();
                    request.setAttribute("message", texte);
                }       
    }
    
    if (request.getParameter("action").equals("formule")){
        OrderTreatmentLocal gestionCommande = lookupOrderTreatmentLocal();
        
        try{
        List<Combo> c01=  (List<Combo>) gestionCommande.getCombo();
        request.setAttribute("combo", c01);
        
                 } catch (CustomException ex) {
                    String texte = ex.getMessage();
                    request.setAttribute("message", texte);
                }       
    }
    
    
    return "carteJeanno";

    
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
