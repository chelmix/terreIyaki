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