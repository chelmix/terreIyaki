/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBeans;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author jeanno
 */
@Entity
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private int code;
    private String firstName;
    private String lastName;
    private int status;
    
    
    @ManyToMany
    private Collection<MyGrant> myGrants;    
    
    @OneToMany(mappedBy = "account")
    private Collection<MyOrder>myOrders;

    public Account() {
    }

    public Account(int code, String firstName, String lastName, int status) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBeans.Account[ id=" + id + " ]";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Collection<MyGrant> getMyGrants() {
        return myGrants;
    }

    public void setMyGrants(Collection<MyGrant> myGrants) {
        this.myGrants = myGrants;
    }

    public Collection<MyOrder> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(Collection<MyOrder> myOrders) {
        this.myOrders = myOrders;
    }
    
}
