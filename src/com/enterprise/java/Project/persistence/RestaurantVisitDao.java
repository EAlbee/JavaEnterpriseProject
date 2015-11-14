package com.enterprise.java.Project.persistence;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.enterprise.java.Project.RestaurantVisit;
import com.enterprise.java.Project.RestaurantVisitSearch;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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

    public void searchRestaurantVisit(RestaurantVisitSearch restaurantVisitSearch) {
        //TODO update to return a list
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        String hql = "FROM com.enterprise.java.Project.RestaurantVisit";
        //List restaurantVisits = null;

        try {
            tx = session.beginTransaction();
            List<RestaurantVisit> restaurantVisits = session.createQuery("FROM com.enterprise.java.Project.RestaurantVisit").list();
            //ArrayList<RestaurantVisit> restaurantVisits = new ArrayList<RestaurantVisit>();
            Query query = session.createQuery(hql);
            restaurantVisits = query.list();
            for (Iterator iterator =
                    restaurantVisits.iterator(); iterator.hasNext();){
                RestaurantVisit restaurantVisit = (RestaurantVisit) iterator.next();

            }
            restaurantVisitSearch.setResults((ArrayList<RestaurantVisit>) restaurantVisits);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();

        }

    }
}
