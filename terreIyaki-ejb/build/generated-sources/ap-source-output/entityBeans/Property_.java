package entityBeans;

import entityBeans.Product;
import entityBeans.Unit;
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
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, Unit> unit;
    public static volatile SingularAttribute<Property, String> name;
    public static volatile SingularAttribute<Property, Long> id;
    public static volatile SingularAttribute<Property, String> value;
    public static volatile CollectionAttribute<Property, Product> products;

}