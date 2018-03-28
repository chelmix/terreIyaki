package entityBeans;

import entityBeans.OrderItem;
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
@StaticMetamodel(Ingredient.class)
public class Ingredient_ { 

    public static volatile SingularAttribute<Ingredient, String> Description;
    public static volatile SingularAttribute<Ingredient, Long> id;
    public static volatile CollectionAttribute<Ingredient, OrderItem> orderItems;
    public static volatile SingularAttribute<Ingredient, String> Name;
    public static volatile CollectionAttribute<Ingredient, Product> products;

}