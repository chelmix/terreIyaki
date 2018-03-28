/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entityBeans.Combo;
import entityBeans.ComboCategory;
import entityBeans.MyOrder;
import entityBeans.OrderItem;
import entityBeans.Product;
import java.util.HashMap;
import java.util.List;
import javax.ejb.Local;
import tools.CustomException;

/**
 *
 * @author jeanno
 */
@Local
public interface OrderTreatmentLocal {

    public List<Product> getProduct() throws CustomException, SecurityException;

    public List<Combo> getCombo() throws CustomException, SecurityException;

    public List<ComboCategory> getComboCat(String nomMenu) throws CustomException, SecurityException;

    public List<Product> getComboProduct(String nomCategorie, String nomMenu) throws CustomException, SecurityException;

    public List<Product> getComboProductAll(String nomMenu) throws CustomException, SecurityException;

    public HashMap<String, List<Product>> getHashProduct(String nomMenu) throws CustomException, SecurityException;

    public HashMap<String,Long> getPanier(String nomComboCat,String nomProduit)throws CustomException;

//    public void init();

    public HashMap<Long, Integer> getMenuProductCommande(HashMap<String, Long> getPanier);

    public void comboPersist(HashMap<String,Long>  hashPanier, String nameComboChoice, MyOrder myOrderPersist) throws CustomException;

//    public void mergeComboWithMyOrder(List<OrderItem> listOrderItem, MyOrder myOrder);

//    public MyOrder getLastOrderByTable(int numeroTable) throws CustomException;

//    public MyOrder getLastOrderByTable(int numeroTable) throws CustomException;




    
}
