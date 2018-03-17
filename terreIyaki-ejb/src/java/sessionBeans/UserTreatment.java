/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Account;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import tools.CustomException;
import tools.MyLog;

/**
 *
 * @author jeanno
 */
@Stateless
public class UserTreatment implements UserTreatmentLocal {
    @PersistenceContext(unitName = "terreIyaki-ejbPU")
    private EntityManager em;
    
    


    @Override
    public Account toLogOn (MyLog myLog) throws CustomException  {
int code = (myLog.getFirstNumber()*1000)+(myLog.getSecondNumber()*100)+(myLog.getThirdNumber()*10)+(myLog.getFourthNumber());
String req01 = "select a from Account a where a.code = :paramCode";
 Query qr01 = em.createQuery(req01);
 qr01.setParameter("paramCode", code);
 
 try{
 Account account01=(Account) qr01.getSingleResult();
 return   account01;
 
 }catch (NoResultException ex){
            CustomException ce = new CustomException(CustomException.USER_ERR, "login invalid");
            throw ce;     
     
 }
  
}

//    public void persist(Object object) {
//        em.persist(object);
//    }
    
    
    
}
