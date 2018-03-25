package entityBeans;

import entityBeans.Category;
import entityBeans.ComboCategory;
import entityBeans.Ingredient;
import entityBeans.Option;
import entityBeans.OrderItem;
import entityBeans.Product;
import entityBeans.Property;
import entityBeans.Status;
import entityBeans.VAT;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T09:42:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T22:38:32")
>>>>>>> jeannoBranch
=======
=======
>>>>>>> Corrections sur table
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T09:20:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-22T17:02:16")
>>>>>>> Auto stash before rebase of "origin/master"
<<<<<<< refs/remotes/origin/master
>>>>>>> Auto stash before rebase of "origin/master"
=======
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T11:50:33")
>>>>>>> Corrections sur table
>>>>>>> Corrections sur table
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T14:38:37")
>>>>>>> modif sam
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile CollectionAttribute<Product, Product> mainCourses;
    public static volatile SingularAttribute<Product, VAT> vat;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile CollectionAttribute<Product, OrderItem> orderItems;
    public static volatile SingularAttribute<Product, String> picture;
    public static volatile SingularAttribute<Product, Float> price;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile CollectionAttribute<Product, ComboCategory> comboCategories;
    public static volatile CollectionAttribute<Product, Option> options;
    public static volatile CollectionAttribute<Product, Product> sides;
    public static volatile CollectionAttribute<Product, Ingredient> ingredients;
    public static volatile SingularAttribute<Product, Long> id;
    public static volatile SingularAttribute<Product, Category> category;
    public static volatile CollectionAttribute<Product, Property> properties;
    public static volatile SingularAttribute<Product, Status> status;

}