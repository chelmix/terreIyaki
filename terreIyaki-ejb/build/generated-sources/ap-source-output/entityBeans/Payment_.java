package entityBeans;

import entityBeans.MyOrder;
import entityBeans.PaymentOption;
import entityBeans.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T10:37:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T20:58:57")
>>>>>>> dernier week end
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, MyOrder> myOrder;
    public static volatile SingularAttribute<Payment, Float> Amount;
    public static volatile SingularAttribute<Payment, PaymentOption> PaymentOption;
    public static volatile SingularAttribute<Payment, Long> id;
    public static volatile SingularAttribute<Payment, Date> Date;
    public static volatile SingularAttribute<Payment, Status> status;

}