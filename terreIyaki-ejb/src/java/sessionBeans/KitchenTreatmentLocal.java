/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.OrderItem;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cdi117
 */
@Local
public interface KitchenTreatmentLocal {

    public List<OrderItem> getToCookItems();
    
}
