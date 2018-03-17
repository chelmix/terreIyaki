/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import entityBeans.Account;
import java.beans.*;
import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sessionBeans.JeannoryDataTestLocal;
import sessionBeans.UserTreatment;
import sessionBeans.UserTreatmentLocal;
import tools.CustomException;
import tools.MyLog;

/**
 *
 * @author jeanno
 */
public class LoginCtrl implements ControllerInterface, Serializable {

  public String execute(HttpServletRequest request, HttpServletResponse response )  {
     HttpSession session = request.getSession();
     
      try{      
      if(request.getParameter("bottom").equals("correction")){
          request.removeAttribute("code");
          session.removeAttribute("firstNumber");
          session.removeAttribute("secondNumber");
          session.removeAttribute("thirdNumber");
          session.removeAttribute("fourthNumber");
      }
     }catch(NullPointerException ne){
         //on fait rien
           
     }     

     
     
try{
      if(request.getParameter("bottom1").equals("01")){
//          firstNumber=1;
          session.setAttribute("firstNumber", 1);
//          String test =String.valueOf(request.getAttribute("firstNumber"));
//          System.out.println("le test *******************"+test);
  } 
      else if(request.getParameter("bottom1").equals("02")){

          session.setAttribute("firstNumber", 2);
  }     
      else if(request.getParameter("bottom1").equals("03")){

          session.setAttribute("firstNumber", 3);
  }
      else if(request.getParameter("bottom1").equals("04")){

          session.setAttribute("firstNumber", 4);
  }
      else if(request.getParameter("bottom1").equals("05")){
;
          session.setAttribute("firstNumber", 5);
  }     
      else if(request.getParameter("bottom1").equals("06")){
;
          session.setAttribute("firstNumber", 6);
  }
      else if(request.getParameter("bottom1").equals("07")){

          session.setAttribute("firstNumber", 7);
  }
      else if(request.getParameter("bottom1").equals("08")){

          session.setAttribute("firstNumber", 8);
  }     
      else if(request.getParameter("bottom1").equals("09")){

          session.setAttribute("firstNumber", 9);
  }
      else if(request.getParameter("bottom1").equals("00")){

          session.setAttribute("firstNumber", 0);
  }  
     }catch(NullPointerException ne){
         //on fait rien
           
     }        


try{


      if(request.getParameter("bottom2").equals("01")){
session.setAttribute("secondNumber", 1);
  } 
      else if(request.getParameter("bottom2").equals("02")){
session.setAttribute("secondNumber", 2);
  }     
      else if(request.getParameter("bottom2").equals("03")){
session.setAttribute("secondNumber", 3);
  }
      else if(request.getParameter("bottom2").equals("04")){
session.setAttribute("secondNumber", 4);
  }
      else if(request.getParameter("bottom2").equals("05")){
session.setAttribute("secondNumber", 5);
  }     
      else if(request.getParameter("bottom2").equals("06")){
session.setAttribute("secondNumber", 6);
  }
      else if(request.getParameter("bottom2").equals("07")){
session.setAttribute("secondNumber", 7);
  }
      else if(request.getParameter("bottom2").equals("08")){
session.setAttribute("secondNumber", 8);
  }     
      else if(request.getParameter("bottom2").equals("09")){
session.setAttribute("secondNumber", 9);
  }
      else if(request.getParameter("bottom2").equals("00")){
session.setAttribute("secondNumber", 0);
  } 
      
      
           }catch(NullPointerException ne03){
         //on fait rien
     }
      
try{


      if(request.getParameter("bottom3").equals("01")){
session.setAttribute("thirdNumber", 1);
  } 
      else if(request.getParameter("bottom3").equals("02")){
session.setAttribute("thirdNumber", 2);
  }     
      else if(request.getParameter("bottom3").equals("03")){
session.setAttribute("thirdNumber", 3);
  }
      else if(request.getParameter("bottom3").equals("04")){
session.setAttribute("thirdNumber", 4);
  }
      else if(request.getParameter("bottom3").equals("05")){
session.setAttribute("thirdNumber", 5);
  }     
      else if(request.getParameter("bottom3").equals("06")){
session.setAttribute("thirdNumber", 6);
  }
      else if(request.getParameter("bottom3").equals("07")){
session.setAttribute("thirdNumber", 7);
  }
      else if(request.getParameter("bottom3").equals("08")){
session.setAttribute("thirdNumber", 8);
  }     
      else if(request.getParameter("bottom3").equals("09")){
session.setAttribute("thirdNumber", 9);
  }
      else if(request.getParameter("bottom3").equals("00")){
session.setAttribute("thirdNumber", 0);
  }  
      
           }catch(NullPointerException ne04){
         //on fait rien
     }
      

try{
    

//int fourthNumber =-1;
      if(request.getParameter("bottom4").equals("01")){
session.setAttribute("fourthNumber", 1);
  } 
      else if(request.getParameter("bottom4").equals("02")){
session.setAttribute("fourthNumber", 2);
  }     
      else if(request.getParameter("bottom4").equals("03")){
session.setAttribute("fourthNumber", 3);
  }
      else if(request.getParameter("bottom4").equals("04")){
session.setAttribute("fourthNumber", 4);
  }
      else if(request.getParameter("bottom4").equals("05")){
session.setAttribute("fourthNumber", 5);
  }     
      else if(request.getParameter("bottom4").equals("06")){
session.setAttribute("fourthNumber", 6);
  }
      else if(request.getParameter("bottom4").equals("07")){
session.setAttribute("fourthNumber", 7);
  }
      else if(request.getParameter("bottom4").equals("08")){
session.setAttribute("fourthNumber", 8);
  }     
      else if(request.getParameter("bottom4").equals("09")){
session.setAttribute("fourthNumber", 9);
  }
      else if(request.getParameter("bottom4").equals("00")){
session.setAttribute("fourthNumber", 0);
  }
      
           }catch(NullPointerException ne05){
         //on fait rien
     }

      try{
      if ((session.getAttribute("firstNumber")!=null)){
          request.setAttribute("code", "*");
          String test =String.valueOf(request.getAttribute("code"));
          System.out.println("le test v02 ++++++   :"+test);          
          
      }
      if ((session.getAttribute("secondNumber")!=null)){
          request.setAttribute("code", "**");
      }
      if ((session.getAttribute("thirdNumber")!=null)){
          request.setAttribute("code", "***");
      }
      if ((session.getAttribute("fourthNumber")!=null)){
          request.setAttribute("code", "****");
      }      
     }catch(NullPointerException ne02){
         //on fait rien
     }     
      
      
   try{   
      if(request.getParameter("bottom").equals("valider")){
         //on fait la méthode de test 
//String firstNumber =(String) request.getAttribute("firstNumber");          
//String secondNumber =(String) request.getAttribute("secondNumber");   
//String thirdNumber =(String) request.getAttribute("thirdNumber");
//String fourthNumber =(String) request.getAttribute("fourthNumber");

 int  firstNumber = (Integer) session.getAttribute("firstNumber");
 int  secondNumber = (Integer) session.getAttribute("secondNumber");
 int  thirdNumber = (Integer) session.getAttribute("thirdNumber");
 int  fourthNumber = (Integer) session.getAttribute("fourthNumber");;
   
   System.out.println("+++++bimzzz   : "+firstNumber);
//    Integer  firstNumber = Integer.parseInt(firstNumber00);
//     Integer  secondNumber = Integer.parseInt(secondNumber00);
// Integer  thirdNumber = Integer.parseInt(thirdNumber00);
//Integer  fourthNumber = Integer.parseInt(fourthNumber00);
//    
// int  secondNumber = Integer.parseInt(request.getAttribute("secondNumber"));
//  int  thirdNumber = Integer.parseInt(request.getAttribute("thirdNumber"));
//   int  fourthNumber = Integer.parseInt(request.getAttribute("fourthNumber")
 
 
//  int  secondNumber = Integer.parseInt(String.valueOf(request.getAttribute("secondNumber")));  
//   int  thirdNumber = Integer.parseInt(String.valueOf(request.getAttribute("thirdNumber")));  
//    int  fourthNumber = Integer.parseInt(String.valueOf(request.getAttribute("fourthNumber")));  
// Integer  secondNumber = (Integer) request.getAttribute("secondNumber");  
// Integer  thirdNumber = (Integer) request.getAttribute("thirdNumber");  
// Integer  fourthNumber = (Integer) request.getAttribute("fourthNumber");  
 
          
//      MyLog mylog = new MyLog(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber), Integer.parseInt(thirdNumber), Integer.parseInt(fourthNumber));
    MyLog mylog = new MyLog(firstNumber, secondNumber,thirdNumber,fourthNumber);  
 //    MyLog mylog = new MyLog(0,0,0,0); 
    
    //l267 à 285
     
     System.out.println(mylog.toString());
      UserTreatmentLocal testUserTreatment = lookupUserTreatmentLocal();
      try{
      
  //    testUserTreatment.toLogOn(mylog);
      Account a = testUserTreatment.toLogOn(mylog);
      
      request.setAttribute("message", "Connecté");
      
      System.out.println("Connecté");
      
      } catch (CustomException ex) {
            String texte = ex.getMessage();
            request.setAttribute("message", texte);
          
      }
      }
     }catch(NullPointerException ne02){
         //on fait rien
     }       
         
        
   return "login";  
}
  
  
  
private UserTreatmentLocal lookupUserTreatmentLocal(){
        try{
            Context c = new InitialContext();
            return (UserTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/UserTreatment!sessionBeans.UserTreatmentLocal");
            
        }catch (NamingException ne){
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
            
        }    
    
}
  
}
