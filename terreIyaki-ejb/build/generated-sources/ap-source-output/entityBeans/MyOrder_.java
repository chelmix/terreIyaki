package entityBeans;

import entityBeans.Account;
import entityBeans.MyTable;
import entityBeans.OrderItem;
import entityBeans.Payment;
import entityBeans.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T15:27:19")
@StaticMetamodel(MyOrder.class)
public class MyOrder_ { 

    public static volatile CollectionAttribute<MyOrder, Payment> payments;
    public static volatile SingularAttribute<MyOrder, Long> id;
    public static volatile SingularAttribute<MyOrder, Date> orderDate;
    public static volatile CollectionAttribute<MyOrder, OrderItem> orderItems;
    public static volatile SingularAttribute<MyOrder, Account> account;
    public static volatile SingularAttribute<MyOrder, Status> status;
    public static volatile CollectionAttribute<MyOrder, MyTable> myTables;

}