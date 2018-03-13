
package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
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
    
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;

    @ManyToOne
    private Menu menu;
    
    public Category() {
        comboCategories = new ArrayList();
        products = new ArrayList();
    }
    

    public Category(String name) {
        this();
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

    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
    
    
    @Override
    public String toString() {
        return "Category " + name + " ]";
    }
    
}
