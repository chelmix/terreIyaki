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

<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T20:03:25")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T15:46:05")
>>>>>>> test
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T15:46:05")
>>>>>>> test
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T18:11:59")
>>>>>>> Auto stash before merge of "jeannoBranch" and "origin/jeannoBranch"
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T19:31:15")
>>>>>>> jeanno test
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