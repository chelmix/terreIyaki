
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

    public Combo() {
    }

    public Combo(String name, String price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
   
    @Override
    public String toString() {
        return "Combo " + name + " ";
    }
    
}
