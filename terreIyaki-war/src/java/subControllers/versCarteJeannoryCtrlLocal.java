/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subControllers;

import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jeanno
 */
@Local
public interface versCarteJeannoryCtrlLocal {

    public String execute(HttpServletRequest request, HttpServletResponse response);
    
}
