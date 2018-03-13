/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author jeanno
 */
@Entity
public class MyOrder implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date orderDate;
    private Status status;
    
    @ManyToOne
    private Account account;
    
    @ManyToMany
    private Collection<MyTable> myTables;   
    
    
    @OneToMany(mappedBy="myOrder")
    private Collection<OrderItem>orderItems;

    public MyOrder() {
        myTables = new ArrayList();
        orderItems = new ArrayList();
    }

    public MyOrder(Date orderDate, Status status) {
        this();
        this.orderDate = orderDate;
        this.status = status;
    } 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "entityBeans.MyOrder[ id=" + id + " ]";
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Collection<MyTable> getMyTables() {
        return myTables;
    }

    public void setMyTables(Collection<MyTable> myTables) {
        this.myTables = myTables;
    }

    public Collection<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Collection<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
}