package entityBeans;

import entityBeans.Category;
import entityBeans.Combo;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T09:42:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T22:38:32")
>>>>>>> jeannoBranch
=======
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T09:20:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-22T17:02:16")
>>>>>>> Auto stash before rebase of "origin/master"
>>>>>>> Auto stash before rebase of "origin/master"
@StaticMetamodel(ComboCategory.class)
public class ComboCategory_ { 

    public static volatile SingularAttribute<ComboCategory, Integer> number;
    public static volatile SingularAttribute<ComboCategory, String> name;
    public static volatile SingularAttribute<ComboCategory, Combo> combo;
    public static volatile SingularAttribute<ComboCategory, Long> id;
    public static volatile SingularAttribute<ComboCategory, Category> category;
    public static volatile CollectionAttribute<ComboCategory, Product> products;

}