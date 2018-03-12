package entityBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String type; // client ou serveur

    public Menu() {
    }

    public Menu(String type) {
        this.type = type;
    }
    
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        return "Menu" + type + " ]";
    }
    
}
