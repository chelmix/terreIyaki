/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.MyOrder;
import java.sql.SQLException;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.naming.NamingException;
import tools.Mail;

/**
 *
 * @author jeanno
 */
@Local
public interface PayementTreatmentLocal {

    public void envoyerMail(String mailDestinataire) throws NamingException, SQLException, EJBException;

    public Mail getMail() throws NamingException, SQLException;

    
}
