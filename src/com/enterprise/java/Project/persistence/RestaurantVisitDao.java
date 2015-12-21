package com.enterprise.java.Project.persistence;

import java.lang.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
//import java.util.logging.Logger;
import org.apache.log4j.Logger;

import com.enterprise.java.Project.model.RestaurantVisit;
import com.enterprise.java.Project.model.RestaurantVisitSearch;
import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;


/**
 * Created by Student on 11/7/2015.
 */
public class RestaurantVisitDao {
    //LOGGER logger
    private final Logger logger = Logger.getLogger(RestaurantVisitDao.class);

    //ADD
    /* Method to CREATE a new RestaurantVisit in the database */
    public Integer addRestaurantVisit(RestaurantVisit restaurantVisit) {
        logger.info("addRestaurantVisit in Dao");

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer restaurantVisitID = null;
        try {
            tx = session.beginTransaction();
            restaurantVisitID = (Integer) session.save(restaurantVisit);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            //e.printStackTrace();
            logger.error("!!! addRestaurantVisit error", e);
        } finally {
            session.close();
        }
        return restaurantVisitID;
    }

    //SEARCH Name
    public void searchRestaurantName(RestaurantVisitSearch restaurantVisitSearch) {
        logger.info("searchRestaurantName in dao");
        logger.debug("test DEBUG log");
        //TODO update to return a list
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        //Transaction tx = null;
        //String hql = "FROM com.enterprise.java.Project.model.RestaurantVisit R " +
        //         " WHERE R.visitRestaurantName like :restaurantName";
        //String hql = "FROM RestaurantVisit r where r.restaurant_name like :restaurantName";
        //List restaurantVisits = null;     com.enterprise.java.Project.
        Criteria criteria = session.createCriteria(RestaurantVisit.class);
        criteria.add(Restrictions.like("visitRestaurantName", restaurantVisitSearch.getSearchTerm(), MatchMode.ANYWHERE));
        try {
            //tx = session.beginTransaction();
            //List<RestaurantVisit> restaurantVisits = session.createQuery("FROM com.enterprise.java.Project.model.RestaurantVisit").list();
            //ArrayList<RestaurantVisit> restaurantVisits = new ArrayList<RestaurantVisit>();

            List<RestaurantVisit> restaurantVisits = null;
            //query = session.createQuery("FROM com.enterprise.java.Project.model.RestaurantVisit WHERE restaurant_name =:name").list();
            //Query query = session.createQuery(hql);
            //query.setParameter("restaurantName", restaurantVisitSearch.getSearchTerm());
            restaurantVisits = criteria.list();
            //restaurantVisits = query.list();
            //for (Iterator iterator =
            //        restaurantVisits.iterator(); iterator.hasNext();){
            //    RestaurantVisit restaurantVisit = (RestaurantVisit) iterator.next();

            //}
            restaurantVisitSearch.setResults((ArrayList<RestaurantVisit>) restaurantVisits);
            //tx.commit();
        } catch (HibernateException e) {
            logger.error("!!! searchRestaurantName error",e);
        } finally {
            session.close();

        }
        /*Try block complete */
    }

    //SEARCH Food
    public void searchFoodItem(RestaurantVisitSearch restaurantVisitSearch) {
        logger.info("searchFoodItem in dao");

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Criteria criteria = session.createCriteria(RestaurantVisit.class);
        criteria.add(Restrictions.like("visitItem", restaurantVisitSearch.getSearchTerm(), MatchMode.ANYWHERE));
        try {

            List<RestaurantVisit> restaurantVisits = null;
            restaurantVisits = criteria.list();
            restaurantVisitSearch.setResults((ArrayList<RestaurantVisit>) restaurantVisits);

        } catch (HibernateException e) {
            logger.error("!!! searchRestaurantName error",e);
        } finally {
            session.close();

        }
        /*Try block complete */
    }


    //SEARCH Recent
    public void searchRecent(RestaurantVisitSearch restaurantVisitSearch) {
        logger.info("searchRecent in dao");

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        int numberOfRecent = 10;

        Criteria criteria = session.createCriteria(RestaurantVisit.class);
        criteria.setMaxResults(numberOfRecent);
        //Calendar cal = Calendar.getInstance();
        //cal.setTime(restaurantVisitSearch.getSearchTerm());
        //cal.isSet()
        //criteria.add(Restrictions.between("visitDate", restaurantVisitSearch.getSearchTerm()), );
        try {

            List<RestaurantVisit> restaurantVisits = null;
            restaurantVisits = criteria.list();
            restaurantVisitSearch.setResults((ArrayList<RestaurantVisit>) restaurantVisits);

        } catch (HibernateException e) {
            logger.error("!!! searchRestaurantName error",e);
        } finally {
            session.close();

        }
        /*Try block complete */
    }

    //UPDATE

}
