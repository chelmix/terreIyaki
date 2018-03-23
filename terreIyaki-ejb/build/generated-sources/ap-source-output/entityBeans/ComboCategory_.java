package entityBeans;

import entityBeans.Category;
import entityBeans.Combo;
import entityBeans.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

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
@StaticMetamodel(ComboCategory.class)
public class ComboCategory_ { 

    public static volatile SingularAttribute<ComboCategory, Integer> number;
    public static volatile SingularAttribute<ComboCategory, String> name;
    public static volatile SingularAttribute<ComboCategory, Combo> combo;
    public static volatile SingularAttribute<ComboCategory, Long> id;
    public static volatile SingularAttribute<ComboCategory, Category> category;
    public static volatile CollectionAttribute<ComboCategory, Product> products;

}