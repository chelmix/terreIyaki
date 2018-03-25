package entityBeans;

import entityBeans.OrderItem;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T10:37:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T20:58:57")
>>>>>>> dernier week end
@StaticMetamodel(Option.class)
public class Option_ { 

    public static volatile SingularAttribute<Option, String> Value;
    public static volatile SingularAttribute<Option, Long> id;
    public static volatile CollectionAttribute<Option, OrderItem> orderItems;
    public static volatile SingularAttribute<Option, String> Name;
    public static volatile CollectionAttribute<Option, Product> products;

}