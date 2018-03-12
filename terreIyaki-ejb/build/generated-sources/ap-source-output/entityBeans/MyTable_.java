package entityBeans;

import entityBeans.MyOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-12T13:18:31")
@StaticMetamodel(MyTable.class)
public class MyTable_ { 

    public static volatile CollectionAttribute<MyTable, MyOrder> myOrders;
    public static volatile SingularAttribute<MyTable, Long> id;
    public static volatile SingularAttribute<MyTable, Integer> tableNumber;
    public static volatile SingularAttribute<MyTable, Integer> status;

}