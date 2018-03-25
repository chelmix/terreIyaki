package entityBeans;

import entityBeans.ComboCategory;
import entityBeans.Menu;
import entityBeans.OrderItem;
import entityBeans.Status;
import entityBeans.VAT;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-26T09:42:01")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T22:38:32")
>>>>>>> jeannoBranch
=======
=======
>>>>>>> Corrections sur table
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T09:20:51")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-22T17:02:16")
>>>>>>> Auto stash before rebase of "origin/master"
<<<<<<< refs/remotes/origin/master
>>>>>>> Auto stash before rebase of "origin/master"
=======
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T11:50:33")
>>>>>>> Corrections sur table
>>>>>>> Corrections sur table
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T14:38:37")
>>>>>>> modif sam
@StaticMetamodel(Combo.class)
public class Combo_ { 

    public static volatile SingularAttribute<Combo, Float> price;
    public static volatile SingularAttribute<Combo, String> name;
    public static volatile SingularAttribute<Combo, VAT> vat;
    public static volatile CollectionAttribute<Combo, ComboCategory> comboCategories;
    public static volatile SingularAttribute<Combo, String> description;
    public static volatile SingularAttribute<Combo, Menu> menu;
    public static volatile CollectionAttribute<Combo, OrderItem> ordreItems;
    public static volatile SingularAttribute<Combo, String> urlImage;
    public static volatile SingularAttribute<Combo, Status> status;

}