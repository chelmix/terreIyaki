
package sessionBeans;

import entityBeans.Ingredient;
import entityBeans.Option;
import entityBeans.Payment;
import entityBeans.PaymentOption;
import entityBeans.Status;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author samira
 */
@Stateless
public class GenerateData implements GenerateDataLocal {

    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
    
    
    
Status s01 = new Status (1,	"Prise de commande en cours", 	"Order Item"); 
Status s02 = new Status (2,	"En cours de préparation ", 	"Order Item"); 
Status s03 = new Status (3,	"Prêt à être servi ", 	"Order Item"); 
Status s04 = new Status (4,	"Annulé", "Order Item"); 
Status s05 = new Status (5,	"A payer", 	"Payment "); 
Status s06 = new Status (6,	"Payé", 	"Payment "); 
Status s07 = new Status (7,	"Actif", 	"Account"); 
Status s08 = new Status (8,	"Inactif", 	" Account "); 
Status s09 = new Status (9,	"En cours", 	"My Order "); 
Status s10 = new Status (10,	"Terminé ", 	" My Order"); 
Status s11 = new Status (11,	"Annulé", 	" My Order ");
Status s12 = new Status (12,	"Actif", 	"Combo "); 
Status s13= new Status (13,	"Inactif ", 	 "Combo"); 
Status s14 = new Status (14,	"Actif", 	"My Table "); 
Status s15= new Status (15,	"Inactif ", 	 "My Table"); 
Status s16 = new Status (16,	"Actif", 	"Payment Option  "); 
Status s17= new Status (17,	"Inactif ", 	 "Payment Option "); 
Status s18 = new Status (18,	"Actif", 	"VAT  "); 
Status s19= new Status (19,	"Inactif ", 	 "VAT "); 
Status s20 = new Status (18,	"Disponible", 	"Product  "); 
Status s21= new Status (19,	"Indisponible ", "Product "); 


PaymentOption po01 = new PaymentOption ("CB", 39.90f); 
PaymentOption po02 = new PaymentOption ("Espece", 29.90f); 
PaymentOption po03 = new PaymentOption ("CB", 35.90f); 
PaymentOption po04 = new PaymentOption ("Chèque", 19.90f); 
PaymentOption po05 = new PaymentOption ("Ticket Restaurant", 15.90f); 

Date d01 = new GregorianCalendar(2018, 1, 22, 12, 30).getTime();
Date d02 = new GregorianCalendar(2018, 1, 22, 12, 45).getTime(); 
Date d03 = new GregorianCalendar(2018, 1, 22, 12, 15).getTime(); 
Date d04 = new GregorianCalendar(2018, 1, 22, 13, 00).getTime(); 
Date d05 = new GregorianCalendar(2018, 1, 22, 13, 15).getTime(); 

Payment p01 = new Payment (d01, po01); 
Payment p02 = new Payment (d02, po02); 
Payment p03 = new Payment (d03, po03); 
Payment p04 = new Payment (d04, po04); 
Payment p05 = new Payment (d05, po05); 


Option op01 = new Option ("Salée", "Sauce soja salée") ; 
Option op02 = new Option ("Sucrée", "Sauce soja sucrée") ; 
Option op03 = new Option ("Epicé", "Sauce épicé") ; 
Option op04 = new Option ("Non épicé", "Sauce non épicé") ; 


Ingredient ing01 = new Ingredient("riz", "Made in China"); 
Ingredient ing02 = new Ingredient("nouille", "Made in China"); 
Ingredient ing03 = new Ingredient("saumon", "Made in France"); 
Ingredient ing04 = new Ingredient("thon", "Made in France"); 
Ingredient ing05 = new Ingredient("crevette", "Made in France"); 




 
    
    
}
