package entityBeans;

import entityBeans.Category;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T17:14:22")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-24T17:47:15")
>>>>>>> product choice 1
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile CollectionAttribute<Menu, Category> combos;
    public static volatile CollectionAttribute<Menu, Category> categories;
    public static volatile CollectionAttribute<Menu, Category> accounts;
    public static volatile SingularAttribute<Menu, String> type;

}