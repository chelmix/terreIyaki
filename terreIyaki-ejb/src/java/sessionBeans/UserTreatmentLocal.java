/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Account;
import javax.ejb.Local;
import tools.CustomException;
import tools.MyLog;

/**
 *
 * @author jeanno
 */
@Local
public interface UserTreatmentLocal {

    public Account toLogOn(MyLog myLog) throws CustomException;
    
}
