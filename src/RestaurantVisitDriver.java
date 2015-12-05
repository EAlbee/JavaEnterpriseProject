
import java.sql.Date;
import com.enterprise.java.Project.RestaurantVisit;
import com.enterprise.java.Project.persistence.RestaurantVisitDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by Student on 11/7/2015.
 */
public class RestaurantVisitDriver {
    public static void main(String[] args) {
        RestaurantVisitDao dao = new RestaurantVisitDao();
        RestaurantVisit restaurantVisit = new RestaurantVisit(0, "The Tornado Room", "Madison", "WI",
                null, "Steak", "Desc", 20.00, 5.00, 25.00, 5);
        //UserRole userRole = new UserRole(0, "admin", "admin");
        dao.addRestaurantVisit(restaurantVisit);
    }

}
