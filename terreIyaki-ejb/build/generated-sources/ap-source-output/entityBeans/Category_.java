package entityBeans;

import entityBeans.ComboCategory;
import entityBeans.Menu;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T23:01:34")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T09:58:38")
>>>>>>> avant de recevoir master
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> name;
    public static volatile CollectionAttribute<Category, ComboCategory> comboCategories;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, Menu> menu;
    public static volatile CollectionAttribute<Category, Product> products;

}