package entityBeans;

import entityBeans.Combo;
import entityBeans.Product;
import entityBeans.Status;
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
@StaticMetamodel(VAT.class)
public class VAT_ { 

    public static volatile SingularAttribute<VAT, Float> rate;
    public static volatile CollectionAttribute<VAT, Combo> combos;
    public static volatile SingularAttribute<VAT, Long> id;
    public static volatile SingularAttribute<VAT, String> label;
    public static volatile CollectionAttribute<VAT, Product> products;
    public static volatile SingularAttribute<VAT, Status> status;

}