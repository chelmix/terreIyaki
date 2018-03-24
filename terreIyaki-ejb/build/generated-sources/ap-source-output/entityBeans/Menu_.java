package entityBeans;

import entityBeans.Category;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T19:46:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T22:26:49")
>>>>>>> avant recevoir master
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile CollectionAttribute<Menu, Category> combos;
    public static volatile CollectionAttribute<Menu, Category> categories;
    public static volatile CollectionAttribute<Menu, Category> accounts;
    public static volatile SingularAttribute<Menu, String> type;

}