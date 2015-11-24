package com.enterprise.java.Project.persistence;

import com.enterprise.java.Project.RestaurantVisit;
import com.enterprise.java.Project.RestaurantVisitSearch;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;


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

//    @Test
//    public void testSearchRestaurantVisit() throws Exception {
//        //RestaurantVisitDao dao = new RestaurantVisitDao();
//        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
//        //dao.searchRestaurantVisit(restaurantVisitSearch);
//        int resultsSize = restaurantVisitSearch.getResults().size();
//        assertTrue(resultsSize >= 2);
//
//    }
    @Test
    public void testSearchRestaurantName() throws Exception {
        RestaurantVisitSearch restaurantVisitSearch = new RestaurantVisitSearch();
        RestaurantVisitDao dao = new RestaurantVisitDao();

        restaurantVisitSearch.setSearchTerm("steak");
        restaurantVisitSearch.setSearchType("searchFoodItem");

        dao.searchFoodItem(restaurantVisitSearch);

        List <RestaurantVisit> results = restaurantVisitSearch.getResults();
        RestaurantVisit visit = results.get(0);
        String name = visit.getVisitRestaurantName();
        assertEquals(name, "The Tornado Room");

    }
}