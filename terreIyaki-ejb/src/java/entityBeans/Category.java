
package entityBeans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String name;
    
    @OneToMany(mappedBy = "category")
    private Collection<ComboCategory> comboCategories;

    @ManyToOne
    private Category menu;
    
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

    public Collection<ComboCategory> getComboCategories() {
        return comboCategories;
    }

    public void setComboCategories(Collection<ComboCategory> comboCategories) {
        this.comboCategories = comboCategories;
    }
    

    
    @Override
    public String toString() {
        return "Category " + name + " ]";
    }
    
}
