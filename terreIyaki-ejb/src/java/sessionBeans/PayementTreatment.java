/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;


import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import entityBeans.MyOrder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;

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

import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import javax.mail.internet.MimeMessage;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.Document;

import tools.ConnexionBDD;


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


            
 //***********************PJ****************************************************           
//A changer            
//DataSource source = new FileDataSource("/home/jeanno/Files/test.pdf");
DataSource source = new FileDataSource("/home/jeannory/Files/test.pdf");
message.setDataHandler(new DataHandler(source));

//A changer  
//message.setFileName("/home/jeanno/Files/test.pdf");
message.setFileName("/home/jeannory/Files/test.pdf");

 //***********************PJ****************************************************                               
           

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
    
    
    
    

    @Override
    public void getBillPdf(String nomMenu){
        com.lowagie.text.Document document = new com.lowagie.text.Document(PageSize.A4);
try{
//en local    
//PdfWriter.getInstance(document,new FileOutputStream("/home/jeanno/Files/test.pdf"));

//sur serveur distant
PdfWriter.getInstance(document,new FileOutputStream("/home/jeannory/Files/test.pdf"));
document.open();

//en local
//Image image = Image.getInstance("/home/jeanno/Files/logo.png");

//sur serveur distant
Image image = Image.getInstance("/home/jeannory/Files/logo.png");
document.add(image);
SimpleDateFormat formater = null;
Date aujourdhui = new Date();
        
formater = new SimpleDateFormat("EEEE d MMM yyyy");      
 
Paragraph paragraph = new Paragraph("\n\n\n");
document.add(paragraph);
        
paragraph = new Paragraph("Facture du "+formater.format(aujourdhui));
paragraph.setIndentationLeft(30f);
document.add(paragraph);

 paragraph = new Paragraph("\n\n");
document.add(paragraph);

paragraph = new Paragraph("Produits commandés :");
document.add(paragraph);

paragraph = new Paragraph("\n");
document.add(paragraph);

paragraph = new Paragraph(nomMenu +" - quantité : 1");
paragraph.setIndentationLeft(15f);
document.add(paragraph);


paragraph = new Paragraph("Plat du jour : 50€ (fictif)");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Coca cola : 20€ (fictif)");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Montant HT : 70€ (fictif)");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("TVA : 20% (fictif)");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Net à payer : 84€ (fictif)");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("\n\n\n");
document.add(paragraph);

paragraph = new Paragraph("Terre Iyaki Restaurant vous remercie de votre visite et vous dit à bientôt");
document.add(paragraph);


} catch (DocumentException de) {
de.printStackTrace();
} catch (IOException ioe) {
ioe.printStackTrace();
}
document.close();
}
        
        

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




