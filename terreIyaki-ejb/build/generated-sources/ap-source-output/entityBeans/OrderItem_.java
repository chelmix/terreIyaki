package entityBeans;

import entityBeans.MyOrder;
import entityBeans.OrderItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-12T13:18:31")
@StaticMetamodel(OrderItem.class)
public class OrderItem_ { 

    public static volatile SingularAttribute<OrderItem, OrderItem> comboOrderItem;
    public static volatile SingularAttribute<OrderItem, MyOrder> myOrder;
    public static volatile SingularAttribute<OrderItem, Float> price;
    public static volatile SingularAttribute<OrderItem, Float> tax;
    public static volatile SingularAttribute<OrderItem, Long> id;
    public static volatile CollectionAttribute<OrderItem, OrderItem> orderItems;

}