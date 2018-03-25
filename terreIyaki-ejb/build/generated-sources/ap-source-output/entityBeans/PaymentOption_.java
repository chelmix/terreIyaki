package entityBeans;

import entityBeans.Payment;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< refs/remotes/origin/master
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T10:37:52")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-25T20:58:57")
>>>>>>> dernier week end
@StaticMetamodel(PaymentOption.class)
public class PaymentOption_ { 

    public static volatile CollectionAttribute<PaymentOption, Payment> payment;
    public static volatile SingularAttribute<PaymentOption, Long> id;
    public static volatile SingularAttribute<PaymentOption, String> Name;
    public static volatile SingularAttribute<PaymentOption, Status> status;

}