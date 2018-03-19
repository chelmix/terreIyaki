/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Stateless
public class OrderCtrl implements ControllerInterface, OrderCtrlLocal {

public String execute(HttpServletRequest request, HttpServletResponse response) {
    
    
   return "jeanno" ;
    
}    
    
}
