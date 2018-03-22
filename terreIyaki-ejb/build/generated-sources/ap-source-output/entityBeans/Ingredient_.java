package entityBeans;

import entityBeans.OrderItem;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T09:20:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-22T14:25:22")
>>>>>>> Creation afichage carte
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile SingularAttribute<Ingredient, String> Description;
    public static volatile SingularAttribute<Ingredient, Long> id;
    public static volatile CollectionAttribute<Ingredient, OrderItem> orderItems;
    public static volatile SingularAttribute<Ingredient, String> Name;
    public static volatile CollectionAttribute<Ingredient, Product> products;

}