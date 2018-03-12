
package entityBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Combo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String name; // de type A2 B6 etc
    private String price;
    private String description;
    
   
    @Override
    public String toString() {
        return "Combo " + name + " ";
    }
    
}
