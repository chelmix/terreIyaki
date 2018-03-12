
package entityBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    @Override
    public String toString() {
        return "Category " + name + " ]";
    }
    
}
