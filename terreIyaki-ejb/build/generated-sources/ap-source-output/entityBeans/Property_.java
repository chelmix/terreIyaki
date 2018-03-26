package entityBeans;

import entityBeans.Product;
import entityBeans.Unit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T09:42:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T22:38:32")
>>>>>>> jeannoBranch
@StaticMetamodel(Property.class)
public class Property_ { 

    public static volatile SingularAttribute<Property, Unit> unit;
    public static volatile SingularAttribute<Property, String> name;
    public static volatile SingularAttribute<Property, Long> id;
    public static volatile SingularAttribute<Property, String> value;
    public static volatile CollectionAttribute<Property, Product> products;

}