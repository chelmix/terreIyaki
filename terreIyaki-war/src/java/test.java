
import java.io.FileOutputStream;
import java.io.IOException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
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
document.add(new Paragraph("Hello World"));
} catch (DocumentException de) {
de.printStackTrace();
} catch (IOException ioe) {
ioe.printStackTrace();
}
document.close();  
    }
  
    
}
