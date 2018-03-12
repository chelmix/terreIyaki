/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityBeans;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author jeanno
 */
@Entity
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private float price;
    private float tax;
    
//    @ManyToOne
//    OrderItem comboOrderItem;
    
    
    @ManyToOne
    private MyOrder myOrder;
    
    @ManyToOne
    private OrderItem comboOrderItem;    
    
@OneToMany(mappedBy="comboOrderItem")    
private Collection<OrderItem>orderItems;    
    
//    @ManyToOne
//    private ComboOrderItem comboOrderItem;

    public OrderItem() {
    }

    public OrderItem(float price, float tax) {
        this.price = price;
        this.tax = tax;
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
        if (!(object instanceof OrderItem)) {
            return false;
        }
        OrderItem other = (OrderItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityBeans.OrderItem[ id=" + id + " ]";
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public MyOrder getMyOrder() {
        return myOrder;
    }

    public void setMyOrder(MyOrder myOrder) {
        this.myOrder = myOrder;
    }

    public OrderItem getComboOrderItem() {
        return comboOrderItem;
    }

    public void setComboOrderItem(OrderItem comboOrderItem) {
        this.comboOrderItem = comboOrderItem;
    }

    public Collection<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Collection<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }


    
}
