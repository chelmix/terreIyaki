package entityBeans;

import entityBeans.ComboCategory;
import entityBeans.Menu;
import entityBeans.Status;
import entityBeans.VAT;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-19T07:47:54")
@StaticMetamodel(Combo.class)
public class Combo_ { 

    public static volatile SingularAttribute<Combo, String> price;
    public static volatile SingularAttribute<Combo, String> name;
    public static volatile SingularAttribute<Combo, VAT> vat;
    public static volatile CollectionAttribute<Combo, ComboCategory> comboCategories;
    public static volatile SingularAttribute<Combo, String> description;
    public static volatile SingularAttribute<Combo, Menu> menu;
    public static volatile SingularAttribute<Combo, Status> status;

}