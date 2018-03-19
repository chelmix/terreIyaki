package sessionBeans;

import entityBeans.Category;
import entityBeans.Ingredient;
import entityBeans.Option;
import entityBeans.Product;
import entityBeans.Property;
import entityBeans.VAT;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class CatalogTreatment implements CatalogTreatmentLocal {

    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;

    @Override
    public void createProduct(String name, String price, String picture, String description, String categoryName,
            String vatId, String[] pproperties, String[] poptions, String[] pingredients) {

        Product prod = new Product(name, Float.valueOf(price), picture, description);

        Category cat = em.find(Category.class, categoryName);
        prod.setCategory(cat);
        VAT vat = em.find(VAT.class, Long.valueOf(vatId));
        prod.setVat(vat);
        if (pproperties != null) {
            for (String propId : pproperties) {
                Property prop = em.find(Property.class, Long.valueOf(propId));
                prod.getProperties().add(prop);
            }
        }
        if (poptions != null) {
            for (String optId : poptions) {
                Option opt = em.find(Option.class, Long.valueOf(optId));
                prod.getOptions().add(opt);
            }
        }
        if (pingredients != null) {
            for (String ingId : pingredients) {
                Ingredient ing = em.find(Ingredient.class, Long.valueOf(ingId));
                prod.getIngredients().add(ing);
            }
        }

        em.persist(prod);
    }

    @Override
    public List<Category> getAllCategories() {
        Query qr = em.createNamedQuery("entityBeans.Category.selectAll");
        List<Category> lc = qr.getResultList();
        return lc;
    }

    @Override
    public List<VAT> getAllVATs() {
        Query qr = em.createNamedQuery("entityBeans.VAT.selectAll");
        List<VAT> lv = qr.getResultList();
        return lv;
    }
    
    @Override
    public List<Property> getAllProperties() {
        Query qr = em.createNamedQuery("entityBeans.Property.selectAll");
        List<Property> lp = qr.getResultList();
        return lp;
    }
    
    @Override
    public List<Option> getAllOptions() {
        Query qr = em.createNamedQuery("entityBeans.Option.selectAll");
        List<Option> lo = qr.getResultList();
        return lo;
    }
    
    @Override
    public List<Ingredient> getAllIngredients() {
        Query qr = em.createNamedQuery("entityBeans.Ingredient.selectAll");
        List<Ingredient> li = qr.getResultList();
        return li;
    }

}
