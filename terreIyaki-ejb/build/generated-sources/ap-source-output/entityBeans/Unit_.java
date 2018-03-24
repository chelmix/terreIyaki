package entityBeans;

import entityBeans.Property;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T19:46:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T22:26:49")
>>>>>>> avant recevoir master
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, String> name;
    public static volatile SingularAttribute<Unit, Long> id;
    public static volatile SingularAttribute<Unit, String> abbreviation;
    public static volatile CollectionAttribute<Unit, Property> properties;

}