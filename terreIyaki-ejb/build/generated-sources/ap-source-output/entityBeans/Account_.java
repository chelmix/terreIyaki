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
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T14:38:37")
>>>>>>> modif sam
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