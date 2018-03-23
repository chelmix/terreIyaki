
package subControllers;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionBeans.CatalogTreatmentLocal;

public class OverviewCtrl implements ControllerInterface, Serializable {
    CatalogTreatmentLocal catalogTreatment = lookupCatalogTreatmentLocal();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String productId = request.getParameter("productid");
        String categoryId = request.getParameter("categoryid");
        if (productId != null) {
            request.setAttribute("product", catalogTreatment.getProductById(productId));
            return "product-overview";
        } else if (categoryId != null) {
            request.setAttribute("category", catalogTreatment.getCategoryById(categoryId));
            //request.setAttribute("products", catalogTreatment.getProductsById(categoryId).getProducts());
            return "category-overview";
        } else {
            request.setAttribute("categories", catalogTreatment.getAllCategories());
            return "overview";
        }
    }

    private CatalogTreatmentLocal lookupCatalogTreatmentLocal() {
        try {
            Context c = new InitialContext();
            return (CatalogTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/CatalogTreatment!sessionBeans.CatalogTreatmentLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
