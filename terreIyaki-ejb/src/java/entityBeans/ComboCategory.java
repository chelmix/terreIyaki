
package entityBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class ComboCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int number;
    private String name;
    
    @ManyToOne
    private Category category;
    
    @ManyToOne
    private Category combo;

    public ComboCategory() {
    }

    public ComboCategory(Long id, int number) {
        this.id = id;
        this.number = number;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    

    @Override
    public String toString() {
        return "ComboNumber category" + number + " ]";
    }
    
}
