package com.enterprise.java.Project.persistence;

import com.enterprise.java.Project.RestaurantVisit;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 * Created by Student on 11/7/2015.
 */
public class RestaurantVisitDao {

    /* Method to CREATE a new RestaurantVisit in the database */
    public Integer addRestaurantVisit(RestaurantVisit restaurantVisit) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer restaurantVisitID = null;
        try {
            tx = session.beginTransaction();
            restaurantVisitID = (Integer) session.save(restaurantVisit);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return restaurantVisitID;
    }
}