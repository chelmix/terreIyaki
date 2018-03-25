package entityBeans;

import entityBeans.Category;
import entityBeans.Combo;
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
@StaticMetamodel(ComboCategory.class)
public class ComboCategory_ { 

    public static volatile SingularAttribute<ComboCategory, Integer> number;
    public static volatile SingularAttribute<ComboCategory, String> name;
    public static volatile SingularAttribute<ComboCategory, Combo> combo;
    public static volatile SingularAttribute<ComboCategory, Long> id;
    public static volatile SingularAttribute<ComboCategory, Category> category;
    public static volatile CollectionAttribute<ComboCategory, Product> products;

}