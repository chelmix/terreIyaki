package entityBeans;

import entityBeans.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-19T20:46:26")
@StaticMetamodel(MyGrant.class)
public class MyGrant_ { 

    public static volatile SingularAttribute<MyGrant, String> name;
    public static volatile SingularAttribute<MyGrant, Long> id;
    public static volatile CollectionAttribute<MyGrant, Account> accounts;

}