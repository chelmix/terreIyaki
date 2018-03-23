package entityBeans;

import entityBeans.MyOrder;
import entityBeans.PaymentOption;
import entityBeans.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-23T20:03:25")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, MyOrder> myOrder;
    public static volatile SingularAttribute<Payment, Float> Amount;
    public static volatile SingularAttribute<Payment, PaymentOption> PaymentOption;
    public static volatile SingularAttribute<Payment, Long> id;
    public static volatile SingularAttribute<Payment, Date> Date;
    public static volatile SingularAttribute<Payment, Status> status;

}