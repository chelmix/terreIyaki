package entityBeans;

import entityBeans.Property;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T23:01:53")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T23:56:48")
>>>>>>> reparation
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:41:48")
>>>>>>> test
@StaticMetamodel(Unit.class)
public class Unit_ { 

    public static volatile SingularAttribute<Unit, String> name;
    public static volatile SingularAttribute<Unit, Long> id;
    public static volatile SingularAttribute<Unit, String> abbreviation;
    public static volatile CollectionAttribute<Unit, Property> properties;

}