package entityBeans;

import entityBeans.Payment;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T23:01:53")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T23:56:48")
>>>>>>> reparation
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-28T09:41:48")
>>>>>>> test
@StaticMetamodel(PaymentOption.class)
public class PaymentOption_ { 

    public static volatile CollectionAttribute<PaymentOption, Payment> payment;
    public static volatile SingularAttribute<PaymentOption, Long> id;
    public static volatile SingularAttribute<PaymentOption, String> Name;
    public static volatile SingularAttribute<PaymentOption, Status> status;

}