<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.beans.*;
=======

package tools;

>>>>>>> jeannoBranch
import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

<<<<<<< HEAD
/**
 *
 * @author jeanno
 */
=======

>>>>>>> jeannoBranch
public class ConnexionBDD implements Serializable {
    

    private DataSource ds;
    
    
    public ConnexionBDD()throws NamingException{
        InitialContext itc = new InitialContext();
//        ds = (DataSource) itc.lookup("jdbc/RestaurantPostgresJeanno");
        ds = (DataSource) itc.lookup("jdbc/restaurant");
        
        
        
    }

public Connection getConnetion() throws SQLException{
    return ds.getConnection();
}
    
<<<<<<< HEAD
=======
    
    
>>>>>>> jeannoBranch
}
