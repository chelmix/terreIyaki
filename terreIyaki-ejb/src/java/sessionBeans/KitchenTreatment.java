
package sessionBeans;

import entityBeans.OrderItem;
import entityBeans.Product;
import entityBeans.Status;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Stateless
public class KitchenTreatment implements KitchenTreatmentLocal {
    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
  
    @Override
    public List<OrderItem> getToCookItems(){
        List<OrderItem> lcr01 = new ArrayList();
        TypedQuery<OrderItem> qr = em.createNamedQuery("entityBeans.OrderItem.selectReadyToCook", OrderItem.class);
        qr.setParameter("paramStatus", getStatusByNum(22));
        try {
            lcr01 = qr.getResultList();
        } catch(NoResultException ex){
            // todo
            return null;
        }
        return lcr01;
    }
    
    public Status getStatusByNum(int statusNum) {
        Status sta;
        TypedQuery<Status> qr = em.createNamedQuery("entityBeans.Status.getStatusByNum", Status.class);
        qr.setParameter("paramNumStatus", statusNum);
        try {
            sta = qr.getSingleResult();
        } catch(NoResultException ex){
            // todo
            return null;
        }
        return sta;
    }
}
