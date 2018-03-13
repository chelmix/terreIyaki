
package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author samira
 */
@Entity
public class PaymentOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @Column(nullable = false)
    private String Name; 
    @Column(nullable = false)
    private float Amount; 
    
    
    // associations
    @OneToMany(mappedBy = "PaymentOption")
    private Collection<Payment> payment;

    public PaymentOption() {
        payment = new ArrayList(); 
    }

    public PaymentOption(String Name, float Amount) {
        this();
        this.Name = Name;
        this.Amount = Amount;
    }

    public Collection<Payment> getPayment() {
        return payment;
    }

    public void setPayment(Collection<Payment> payment) {
        this.payment = payment;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getAmount() {
        return Amount;
    }

    public void setAmount(float Amount) {
        this.Amount = Amount;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PaymentOption[ Name= " + Name +" Amount= "+Amount  +" ]";
    }
    
}
