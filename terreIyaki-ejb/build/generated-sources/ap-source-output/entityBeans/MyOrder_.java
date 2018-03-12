package entityBeans;

import entityBeans.Account;
import entityBeans.MyTable;
import entityBeans.OrderItem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-12T13:18:31")
@StaticMetamodel(MyOrder.class)
public class MyOrder_ { 

    public static volatile SingularAttribute<MyOrder, Long> id;
    public static volatile SingularAttribute<MyOrder, Date> orderDate;
    public static volatile CollectionAttribute<MyOrder, OrderItem> orderItems;
    public static volatile SingularAttribute<MyOrder, Account> account;
    public static volatile SingularAttribute<MyOrder, Integer> status;
    public static volatile CollectionAttribute<MyOrder, MyTable> myTables;

}