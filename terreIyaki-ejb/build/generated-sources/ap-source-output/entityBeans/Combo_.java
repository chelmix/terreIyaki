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

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:51:13")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:41:48")
>>>>>>> jeannoV02Branch
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