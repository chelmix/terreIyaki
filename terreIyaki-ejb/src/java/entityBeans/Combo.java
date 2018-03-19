
package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Combo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String name; // de type A2 B6 etc
    private float price;
    private String description;
    
    @ManyToOne
    private Status status;
    
    @ManyToOne
    private Menu menu;
    
    @ManyToOne
    private VAT vat;
    
    @OneToMany(mappedBy = "combo")
    private Collection<ComboCategory> comboCategories;

    public Combo() {
        comboCategories = new ArrayList();
    }

    public Combo(String name, float price, String description) {
        this();
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Collection<ComboCategory> getComboCategories() {
        return comboCategories;
    }

    public void setComboCategories(Collection<ComboCategory> comboCategories) {
        this.comboCategories = comboCategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VAT getVat() {
        return vat;
    }

    public void setVat(VAT vat) {
        this.vat = vat;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
        return "Combo " + name + " ";
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
