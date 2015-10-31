package com.enterprise.java.Project;

import java.util.*;

/**
 * Created by Student on 10/31/2015.
 * Restaraunt Search Bean
 * @author    EAlbee
 */
public class RestaurantVisitSearch extends java.lang.Object{
    private String searchType;
    private String searchTerm;
    private ArrayList<RestaurantVisit> results;
    private Boolean foundResults;

    /**
     * Returns the value of searchType.
     */
    public String getSearchType() {
        return searchType;
    }


    /**
     * Sets the value of searchType.
     * @param searchType The value to assign searchType.
     */
    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }


    /**
     * Returns the value of searchTerm.
     */
    public String getSearchTerm() {
        return searchTerm;
    }


    /**
     * Sets the value of searchTerm.
     * @param searchTerm The value to assign searchTerm.
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }


    /**
     * Returns the value of results.
     */
    public ArrayList<RestaurantVisit> getResults() {
        return results;
    }


    /**
     * Sets the value of results.
     * @param results The value to assign results.
     */
    public void setResults(ArrayList<RestaurantVisit> results) {
        //public void setResults(results) {
        this.results = results;
        //this.results = this.results.add(results);
        //this.results.add(results);
    }


    /**
     * Returns the value of foundResults.
     */
    public Boolean getFoundResults() {
        return foundResults;
    }


    /**
     * Sets the value of foundResults.
     * @param foundResults The value to assign foundResults.
     */
    public void setFoundResults(Boolean foundResults) {
        this.foundResults = foundResults;
    }

    /**
     * empty constructor
     */
    public RestaurantVisitSearch() {

    }

    /**
     * add Found employee
     *
     */
    public void addFoundRestarauntVisit(RestaurantVisit restaurantVisit) {
        results.add(restaurantVisit);
    }
}
