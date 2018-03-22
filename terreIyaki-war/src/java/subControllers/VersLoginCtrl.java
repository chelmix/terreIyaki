/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import java.beans.*;
import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jeanno
 */
public class VersLoginCtrl implements ControllerInterface, Serializable {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response )  {
 HttpSession session = request.getSession();
       //**************achat dun menu **********début ****************      
 try{
 if(request.getParameter("action").equals("validerMenu")){
     String message = "merci pour avoir commandé ce menu";
     request.setAttribute("message", message);
     session.removeAttribute("hashPanier");
     session.removeAttribute("nombre");
     
   
     
 }        
  //**************achat dun menu **********fin ****************       
 }catch(NullPointerException ne) {
     
     
 }
      
      
      
      return "login";
      
  } 
    
}
