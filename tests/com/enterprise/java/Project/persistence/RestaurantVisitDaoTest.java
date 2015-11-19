package com.enterprise.java.Project.persistence;

import com.enterprise.java.Project.RestaurantVisit;
import com.enterprise.java.Project.RestaurantVisitSearch;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by Student on 11/18/2015.
 */
public class RestaurantVisitDaoTest {

    @Test
    public void instatiateRestaurantVisit() {
        RestaurantVisit restaurantVisit = new RestaurantVisit();
        assertTrue(restaurantVisit.getVisitRestaurantName(),true);
    }

    @Test
    public void instatiateRestaurantVisitSearch() {
        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
    }

    @Test
    public void testAddRestaurantVisit() throws Exception {

    }

    @Test
    public void testSearchRestaurantVisit() throws Exception {
        //RestaurantVisitDao dao = new RestaurantVisitDao();
        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
        //dao.searchRestaurantVisit(restaurantVisitSearch);
        int resultsSize = restaurantVisitSearch.getResults().size();
        assertTrue(resultsSize >= 2);

    }
}