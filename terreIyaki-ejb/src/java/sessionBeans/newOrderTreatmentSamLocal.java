/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.MyTable;
import entityBeans.Status;
import javax.ejb.Local;
import tools.CustomException;

/**
 *
 * @author samira
 */
@Local
public interface newOrderTreatmentSamLocal {

    public MyTable getSeletedTableNumber(int numeroTable) throws CustomException;

    public void newOrder(MyTable table) throws CustomException;
    
}
