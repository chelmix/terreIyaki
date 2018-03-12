package entityBeans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String type; // client ou serveur
    
    @OneToMany(mappedBy = "menu")
    private Collection<Category> categories;
    
    @OneToMany(mappedBy = "menu")
    private Collection<Category> combos;

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

    public Collection<Category> getCategories() {
        return categories;
    }

    public void setCategories(Collection<Category> categories) {
        this.categories = categories;
    }
    
    

    @Override
    public String toString() {
        return "Menu" + type + " ]";
    }
    
}
