/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.MyOrder;
import entityBeans.OrderItem;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.naming.NamingException;
import tools.CustomException;
import tools.Mail;
import tools.ProductAmount;

/**
 *
 * @author jeanno
 */
@Local
public interface PayementTreatmentLocal {

    public void envoyerMail(String mailDestinataire) throws NamingException, SQLException, EJBException;


//    public Mail getMail() throws NamingException, SQLException;

    public void getBillPdf(String nomMenu);

    public Mail getMail() throws NamingException, SQLException;

    public List<MyOrder> getOrderToPay() throws CustomException;

    public HashMap<Long,ProductAmount> getMontant(Long MyOrderId, HashMap<Long,ProductAmount> ha01) throws CustomException;

    public List<OrderItem> getItemsFromOrder(Long idCommande) throws CustomException;



    
}
