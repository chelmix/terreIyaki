/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import entityBeans.MyOrder;
import entityBeans.MyTable;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionBeans.TableTreatmentLocal;
import sessionBeans.newOrderTreatmentSamLocal;
import tools.CustomException;

/**
 *
 * @author samira
 */
public class versNewOrder implements ControllerInterface, Serializable {

        // test if sur création d'une nouvelle commande 
    // ou creation d'un nouveau controleur verscontroleurs 
    // submit vers le nouveau controleur 
    // FrontController?section=table&action=valide
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)  {
        HttpSession session = request.getSession();
        newOrderTreatmentSamLocal gestionTable = lookupNewOrderTreatmentSamLocal();

        if (request.getParameter("action").equals("valide")) {

            int numeroTable = Integer.valueOf(request.getParameter("table"));

            try {
                
                MyTable mytable = gestionTable.getSeletedTableNumber(numeroTable);
                MyOrder newOrder = gestionTable.newOrder(mytable);
                session.setAttribute("newOrder", newOrder);
                
               
              

            } catch (CustomException ex) {
                CustomException ce = new CustomException(CustomException.USER_ERR, "Pas de Table");
                try {
                    throw ce;
                } catch (CustomException ex1) {
                    Logger.getLogger(versNewOrder.class.getName()).log(Level.SEVERE, null, ex1);
                }

            }

        }
        return "newOrder";
    }
    
    

    

    private newOrderTreatmentSamLocal lookupNewOrderTreatmentSamLocal() {
        try {
            Context c = new InitialContext();
            return (newOrderTreatmentSamLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/newOrderTreatmentSam!sessionBeans.newOrderTreatmentSamLocal");

        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);

        }
    }

}
