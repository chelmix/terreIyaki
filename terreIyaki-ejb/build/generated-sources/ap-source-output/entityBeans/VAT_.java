package entityBeans;

import entityBeans.Combo;
import entityBeans.Product;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:41:48")
@StaticMetamodel(VAT.class)
public class VAT_ { 

    public static volatile SingularAttribute<VAT, Float> rate;
    public static volatile CollectionAttribute<VAT, Combo> combos;
    public static volatile SingularAttribute<VAT, Long> id;
    public static volatile SingularAttribute<VAT, String> label;
    public static volatile CollectionAttribute<VAT, Product> products;
    public static volatile SingularAttribute<VAT, Status> status;

}