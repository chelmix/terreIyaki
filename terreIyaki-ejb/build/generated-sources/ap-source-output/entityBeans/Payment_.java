package entityBeans;

import entityBeans.MyOrder;
import entityBeans.PaymentOption;
import entityBeans.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

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
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, MyOrder> myOrder;
    public static volatile SingularAttribute<Payment, Float> Amount;
    public static volatile SingularAttribute<Payment, PaymentOption> PaymentOption;
    public static volatile SingularAttribute<Payment, Long> id;
    public static volatile SingularAttribute<Payment, Date> Date;
    public static volatile SingularAttribute<Payment, Status> status;

}