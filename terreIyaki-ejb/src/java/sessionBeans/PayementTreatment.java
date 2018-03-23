/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.MyOrder;
import tools.ConnexionBDD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.Document;
import tools.Mail;


/**
 *
 * @author jeanno
 */
@Stateless
public class PayementTreatment implements PayementTreatmentLocal {
    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;


//    public void persist(Object object) {
//        em.persist(object);
//    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
 
    @Override
    public void envoyerMail(String mailDestinataire) throws NamingException, SQLException, EJBException {



        //on utilise une méthode d'un pojo pour récupérer identifiant de connexion à la boite mail
        Mail mail01 = getMail();

        String from = mail01.getMail();//mettre adresse mail
        final String username = mail01.getMail();//mettre adresse mail
        final String password = mail01.getMdp();//mettre mot de passe

        String host = "smtp.gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // Get the Session object.
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mailDestinataire));

            // Set Subject: header field
            message.setSubject("Restaurant Iyaki - Facture");

            // Now set the actual message
            message.setText("Votre Restaurant Iyaki vous remercie de votre visite\nVous trouverez ci-joint votre facture\nEn espérant vous retrouver prochainement");

            // Send message
            Transport.send(message);

            System.out.println("Sent message successfully....");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Mail getMail() throws NamingException, SQLException {

        ConnexionBDD b01 = new ConnexionBDD();

        Mail mail01 = new Mail("", "");
        try (Connection cnt = b01.getConnetion();
                java.sql.Statement stm = cnt.createStatement();) {
            String req = "SELECT * FROM mail";
            ResultSet rs = stm.executeQuery(req);
            while (rs.next()) {
                String email = rs.getString("email");
                String mdp = rs.getString("mdp");
                mail01.setMail(email);
                mail01.setMdp(mdp);
            }

        }
        return mail01;
    }

//    public void persist(Object object) {
//        em.persist(object);
//    }
    
    
    
    
//    public void createPdf(){
//        Document document = new Document(PageSize.A4);
//try {
//PdfWriter.getInstance(document,
//new FileOutputStream("c:/test.pdf"));
//document.open();
//document.add(new Paragraph("Hello World"));
//} catch (DocumentException de) {
//de.printStackTrace();
//} catch (IOException ioe) {
//ioe.printStackTrace();
//}
//document.close();
//}
//        
//        

    
    
    
    
    
    
}




