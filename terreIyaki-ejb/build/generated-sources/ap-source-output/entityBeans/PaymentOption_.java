package entityBeans;

import entityBeans.Payment;
import entityBeans.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T14:08:06")
@StaticMetamodel(PaymentOption.class)
public class PaymentOption_ { 

    public static volatile CollectionAttribute<PaymentOption, Payment> payment;
    public static volatile SingularAttribute<PaymentOption, Long> id;
    public static volatile SingularAttribute<PaymentOption, String> Name;
    public static volatile SingularAttribute<PaymentOption, Status> status;

}