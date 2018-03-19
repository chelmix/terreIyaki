
package sessionBeans;

import entityBeans.Category;
import entityBeans.Property;
import entityBeans.VAT;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CatalogTreatmentLocal {

    public void createProduct(String name, String price, String picture, String description, String categoryName, String vatId, String[] pproperties, String[] poptions, String[] pingredients);

    public List<Category> getAllCategories();

    public List<VAT> getAllVATs();

    public List<Property> getAllProperties();
    
}
