/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Combo;
import entityBeans.Product;
import java.util.List;
import javax.ejb.Local;
import tools.CustomException;

/**
 *
 * @author jeanno
 */
@Local
public interface OrderTreatmentLocal {

    public List<Product> getProduct() throws CustomException, SecurityException;

    public List<Combo> getCombo() throws CustomException, SecurityException;


    
}
