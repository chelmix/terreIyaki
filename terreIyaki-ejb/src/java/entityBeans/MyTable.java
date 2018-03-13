/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author jeanno
 */
@Entity
public class MyTable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int tableNumber;
    
    @ManyToOne
    private Status status; 
    
    
    
    @ManyToMany(mappedBy="myTables")
    private Collection<MyOrder>myOrders;

    public MyTable() {
        myOrders = new ArrayList();
    }

    public MyTable(int tableNumber) {
        this();
        this.tableNumber = tableNumber;
       
    }  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "entityBeans.MyTable[ id=" + id + " ]";
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    

    public Collection<MyOrder> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(Collection<MyOrder> myOrders) {
        this.myOrders = myOrders;
    }
    
}
