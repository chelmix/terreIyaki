
import com.lowagie.text.Chapter;
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeanno
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document = new Document(PageSize.A4);
try{
PdfWriter.getInstance(document,new FileOutputStream("/home/jeanno/test.pdf"));
document.open();


Image image = Image.getInstance("/home/jeanno/logo.png");
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

paragraph = new Paragraph("Plat du jour : 50€");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Coca cola : 20€");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Montant HT : 70€");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("TVA : 20%");
paragraph.setIndentationLeft(15f);
document.add(paragraph);

paragraph = new Paragraph("Net à payer : 84€");
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
  
    
}
