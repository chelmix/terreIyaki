package entityBeans;

import entityBeans.Account;
import entityBeans.Combo;
import entityBeans.MyOrder;
import entityBeans.MyTable;
import entityBeans.OrderItem;
import entityBeans.Payment;
import entityBeans.PaymentOption;
import entityBeans.Product;
import entityBeans.VAT;
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
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile CollectionAttribute<Status, PaymentOption> paymentOptions;
    public static volatile SingularAttribute<Status, Integer> num;
    public static volatile CollectionAttribute<Status, MyOrder> myOrders;
    public static volatile CollectionAttribute<Status, Payment> payments;
    public static volatile SingularAttribute<Status, String> Label;
    public static volatile CollectionAttribute<Status, Combo> combos;
    public static volatile CollectionAttribute<Status, Account> accounts;
    public static volatile CollectionAttribute<Status, OrderItem> orderItems;
    public static volatile CollectionAttribute<Status, VAT> vats;
    public static volatile SingularAttribute<Status, String> Name;
    public static volatile CollectionAttribute<Status, Product> products;
    public static volatile CollectionAttribute<Status, MyTable> myTables;

}