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