/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Account;
import entityBeans.MyGrant;
import entityBeans.MyOrder;
import entityBeans.MyTable;
import entityBeans.OrderItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jeanno
 */
@Stateless
public class JeannoryDataTest implements JeannoryDataTestLocal {
    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
    
    
    @Override
    public void dataTest(){
        
        MyGrant myGrant01 = new MyGrant("serveur");
        MyGrant myGrant02 = new MyGrant("cuisinier");
        
        Account account01 = new Account(1234, "Jean", "Dupond", 1);
        Account account02 = new Account(4444, "Jeanne", "Durand", 1);
        
        Date date01 = new GregorianCalendar(2018, 2, 11, 12, 15, 45).getTime();
        Date date02 = new GregorianCalendar(2018, 2, 11, 12, 20, 38).getTime();
        
        MyOrder myOrder01 = new MyOrder(date01, 8);
        MyOrder myOrder02 = new MyOrder(date02, 9);
        
        MyTable myTable01 = new MyTable(3, 1);
        MyTable myTable02 = new MyTable(2, 1);
        
        OrderItem orderItem01 = new OrderItem(20f, 4f);
        
        OrderItem orderItem02 = new OrderItem(20f, 4f);
        OrderItem orderItem03 = new OrderItem(20f, 4f);
        OrderItem orderItem04 = new OrderItem(20f, 4f);
        OrderItem orderItem05 = new OrderItem(20f, 4f);
        OrderItem orderItem06 = new OrderItem(20f, 4f);
        
        OrderItem comboOrderItem01 = new OrderItem(100f, 20f);
        
        List<MyGrant> listMyGrant01 = new ArrayList();
        List<MyGrant> listMyGrant02 = new ArrayList();
        
        List<MyTable> listMyTable01 = new ArrayList();
        List<MyTable> listMyTable02 = new ArrayList();
        
        listMyGrant01.add(myGrant01);
        listMyGrant01.add(myGrant02);        
        listMyGrant02.add(myGrant01);
        
        listMyTable01.add(myTable01);
        listMyTable02.add(myTable02);
        
        
        
        account01.setMyGrants(listMyGrant01);
        account02.setMyGrants(listMyGrant02);
        
        myOrder01.setAccount(account01);
        myOrder02.setAccount(account02);
        
        myOrder01.setMyTables(listMyTable01);
        myOrder02.setMyTables(listMyTable02);  
        
        orderItem01.setMyOrder(myOrder01);
        
        orderItem02.setMyOrder(myOrder02);
        orderItem03.setMyOrder(myOrder02);
        orderItem04.setMyOrder(myOrder02);
        orderItem05.setMyOrder(myOrder02);
        orderItem06.setMyOrder(myOrder02);
        
        orderItem02.setComboOrderItem(comboOrderItem01);
        orderItem03.setComboOrderItem(comboOrderItem01);
        orderItem04.setComboOrderItem(comboOrderItem01);
        orderItem05.setComboOrderItem(comboOrderItem01);
        orderItem06.setComboOrderItem(comboOrderItem01);
        
        
        comboOrderItem01.setMyOrder(myOrder02);
        
        em.persist(myGrant01);
        em.persist(myGrant02);
        
        em.persist(account01);
        em.persist(account02);
        
        em.persist(myOrder01);
        em.persist(myOrder02);
        
        em.persist(orderItem01);
        em.persist(orderItem02);
        em.persist(orderItem03);
        em.persist(orderItem04);
        em.persist(orderItem05);
        em.persist(orderItem06);
        
        em.persist(myTable01);
        em.persist(myTable02);
        
        em.persist(comboOrderItem01);
         
        em.flush();
        
        
    }
    
    
//
//    public void persist(Object object) {
//        em.persist(object);
//    }

    
    
    
    
}
