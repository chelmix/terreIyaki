package entityBeans;

import entityBeans.Combo;
import entityBeans.Ingredient;
import entityBeans.MyOrder;
import entityBeans.Option;
import entityBeans.OrderItem;
import entityBeans.Product;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T09:42:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T22:38:32")
>>>>>>> jeannoBranch
@StaticMetamodel(OrderItem.class)
public class OrderItem_ { 

    public static volatile SingularAttribute<OrderItem, OrderItem> comboOrderItem;
    public static volatile SingularAttribute<OrderItem, MyOrder> myOrder;
    public static volatile SingularAttribute<OrderItem, Product> product;
    public static volatile SingularAttribute<OrderItem, Float> price;
    public static volatile CollectionAttribute<OrderItem, Option> options;
    public static volatile SingularAttribute<OrderItem, Combo> combo;
    public static volatile CollectionAttribute<OrderItem, Ingredient> ingredients;
    public static volatile SingularAttribute<OrderItem, Float> tax;
    public static volatile SingularAttribute<OrderItem, Long> id;
    public static volatile CollectionAttribute<OrderItem, OrderItem> orderItems;
    public static volatile SingularAttribute<OrderItem, Status> status;

}