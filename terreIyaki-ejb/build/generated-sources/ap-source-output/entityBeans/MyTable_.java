package entityBeans;

import entityBeans.Account;
import entityBeans.MyOrder;
import entityBeans.Status;
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
@StaticMetamodel(MyTable.class)
public class MyTable_ { 

    public static volatile CollectionAttribute<MyTable, MyOrder> myOrders;
    public static volatile SingularAttribute<MyTable, Integer> tableNumber;
    public static volatile SingularAttribute<MyTable, Account> account;
    public static volatile SingularAttribute<MyTable, Status> status;

}