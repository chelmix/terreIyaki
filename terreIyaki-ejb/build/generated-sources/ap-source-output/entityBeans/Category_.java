package entityBeans;

import entityBeans.ComboCategory;
import entityBeans.Menu;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:51:13")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:41:48")
>>>>>>> jeannoV02Branch
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> name;
    public static volatile CollectionAttribute<Category, ComboCategory> comboCategories;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, Menu> menu;
    public static volatile CollectionAttribute<Category, Product> products;

}