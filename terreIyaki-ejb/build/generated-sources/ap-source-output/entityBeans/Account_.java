package entityBeans;

import entityBeans.Menu;
import entityBeans.MyGrant;
import entityBeans.MyOrder;
import entityBeans.MyTable;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T17:14:22")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T17:47:15")
>>>>>>> product choice 1
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> firstName;
    public static volatile SingularAttribute<Account, String> lastName;
    public static volatile SingularAttribute<Account, Integer> code;
    public static volatile CollectionAttribute<Account, MyOrder> myOrders;
    public static volatile SingularAttribute<Account, Menu> menu;
    public static volatile SingularAttribute<Account, MyTable> myTable;
    public static volatile CollectionAttribute<Account, MyGrant> myGrants;
    public static volatile SingularAttribute<Account, Status> status;

}