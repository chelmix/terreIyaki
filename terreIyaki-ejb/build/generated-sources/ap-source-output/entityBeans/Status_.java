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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T14:33:23")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T14:11:32")
>>>>>>> Ajout changement Tables
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T14:08:06")
>>>>>>> Commit de cuisine
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