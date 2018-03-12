package entityBeans;

import entityBeans.MyGrant;
import entityBeans.MyOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-12T13:18:31")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, String> firstName;
    public static volatile SingularAttribute<Account, String> lastName;
    public static volatile SingularAttribute<Account, Integer> code;
    public static volatile CollectionAttribute<Account, MyOrder> myOrders;
    public static volatile SingularAttribute<Account, Long> id;
    public static volatile CollectionAttribute<Account, MyGrant> myGrants;
    public static volatile SingularAttribute<Account, Integer> status;

}