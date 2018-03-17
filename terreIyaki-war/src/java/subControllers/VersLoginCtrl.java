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

/**
 *
 * @author jeanno
 */
public class VersLoginCtrl implements ControllerInterface, Serializable {

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response )  {
      //je créé l 'ArrayList
      return "login";
      
  } 
    
}
