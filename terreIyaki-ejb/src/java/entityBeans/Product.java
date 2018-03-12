package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
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

    public Product() {
        properties = new ArrayList();
        sides = new ArrayList();
        mainCourses = new ArrayList();
    }

    public Product(String name, Float price, String picture, String description) {
        this();
        this.name = name;
        this.price = price;
        this.picture = picture;
        this.description = description;
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
        return name+" : "+price+" €";
    }
    
}
