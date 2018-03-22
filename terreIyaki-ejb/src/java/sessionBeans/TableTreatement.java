/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;


import entityBeans.MyTable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author samira
 */
@Stateless
public class TableTreatement implements TableTreatementLocal {

    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
    
    
    @Override
    public List <MyTable> selectAll () {
    
        Query qr = em.createNamedQuery("entityBeans.MyTable.selectAll");
        List<MyTable> mt = qr.getResultList();
        return mt;
    
    
    }
        
    
    
    
}
