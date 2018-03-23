package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
    @NamedQuery(name = "entityBeans.Product.selectAll", 
            query = "select p from Product p"),
    @NamedQuery(name = "entityBeans.Product.selectProductById", 
            query = "select p from Product p where p.id = :paramId")
})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Float price;
    private String picture;
    private String description;
    
    @ManyToMany
    private Collection<Property> properties;
    @ManyToOne
    private VAT vat; 
    @ManyToMany
    private Collection<Product> mainCourses;
    @ManyToMany(mappedBy = "mainCourses")
    private Collection<Product> sides;
    @ManyToOne
    private Category category;
    @ManyToMany
    private Collection<ComboCategory> comboCategories;
    @OneToMany(mappedBy = "product")
    private Collection<OrderItem> orderItems;
    @ManyToMany(mappedBy = "products")
    private Collection<Option> options;
    @ManyToMany(mappedBy = "products")
    private Collection<Ingredient> ingredients;
    @ManyToOne
    private Status status;

    public Product() {
        properties = new ArrayList();
        sides = new ArrayList();
        mainCourses = new ArrayList();
        comboCategories = new ArrayList();
        orderItems = new ArrayList();
        options = new ArrayList();
        ingredients = new ArrayList();
    }

    public Product(String name, Float price, String picture, String description) {
        this();
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.description = description;
    }

    public Collection<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Collection<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Collection<Option> getOptions() {
        return options;
    }

    public void setOptions(Collection<Option> options) {
        this.options = options;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }   

    public Collection<ComboCategory> getComboCategories() {
        return comboCategories;
    }

    public void setComboCategories(Collection<ComboCategory> comboCategories) {
        this.comboCategories = comboCategories;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    } 

    public Collection<Product> getSides() {
        return sides;
    }

    public void setSides(Collection<Product> sides) {
        this.sides = sides;
    }

    public Collection<Product> getMainCourses() {
        return mainCourses;
    }

    public void setMainCourses(Collection<Product> mainCourses) {
        this.mainCourses = mainCourses;
    }

    public VAT getVat() {
        return vat;
    }

    public void setVat(VAT vat) {
        this.vat = vat;
    }

    public Collection<Property> getProperties() {
        return properties;
    }

    public void setProperties(Collection<Property> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name +" "+description ;
    }
    
}
