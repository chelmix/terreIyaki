
package tools;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnexionBDD implements Serializable {
    

    private DataSource ds;
    
    
    public ConnexionBDD()throws NamingException{
        InitialContext itc = new InitialContext();
        ds = (DataSource) itc.lookup("jdbc/RestaurantPostgresJeanno");
    //    ds = (DataSource) itc.lookup("jdbc/restaurant");
        
        
        
    }

public Connection getConnetion() throws SQLException{
    return ds.getConnection();
}
    
    
    
}
