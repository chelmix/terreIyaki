package entityBeans;

import entityBeans.Account;
import entityBeans.MyOrder;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T16:16:15")
@StaticMetamodel(MyTable.class)
public class MyTable_ { 

    public static volatile CollectionAttribute<MyTable, MyOrder> myOrders;
    public static volatile SingularAttribute<MyTable, Integer> tableNumber;
    public static volatile SingularAttribute<MyTable, Account> account;
    public static volatile SingularAttribute<MyTable, Status> status;

}