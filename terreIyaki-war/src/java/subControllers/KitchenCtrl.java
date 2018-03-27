
package subControllers;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sessionBeans.KitchenTreatmentLocal;

public class KitchenCtrl implements ControllerInterface, Serializable {
    KitchenTreatmentLocal kitchenTreatment = lookupKitchenTreatmentLocal();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("orderItems", kitchenTreatment.getToCookItems());
        return "kitchen";
    }

    private KitchenTreatmentLocal lookupKitchenTreatmentLocal() {
        try {
            Context c = new InitialContext();
            return (KitchenTreatmentLocal) c.lookup("java:global/terreIyaki/terreIyaki-ejb/KitchenTreatment!sessionBeans.KitchenTreatmentLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
