package com.enterprise.java.Project;

import java.io.*;
import java.sql.*;

/**
 * Created by Student on 10/31/2015.
 * Restaurant Visit
 * @author EAlbee
 */
public class RestaurantVisit {

    private String visitRestaurantName;
    private String visitLocation;
    private Date visitDate;
    private String visitItem;
    private String visitDescription;
    private Double visitBillAmount;
    private Double visitTipAmount;
    private Double visitTotalCost;
    private int visitRating;

    /**
     * Returns the value of visitRestaurantName.
     */
    public String getVisitRestaurantName() {
        return visitRestaurantName;
    }


    /**
     * Sets the value of visitRestaurantName.
     * @param visitRestaurantName The value to assign visitRestaurantName.
     */
    public void setVisitRestaurantName(String visitRestaurantName) {
        this.visitRestaurantName = visitRestaurantName;
    }


    /**
     * Returns the value of visitLocation.
     */
    public String getVisitLocation() {
        return visitLocation;
    }


    /**
     * Sets the value of visitLocation.
     * @param visitLocation The value to assign visitLocation.
     */
    public void setVisitLocation(String visitLocation) {
        this.visitLocation = visitLocation;
    }



    /**
     * Returns the value of visitDate.
     */
    public Date getVisitDate() {
        return visitDate;
    }


    /**
     * Sets the value of visitDate.
     * @param visitDate The value to assign visitDate.
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }


    /**
     * Returns the value of visitItem.
     */
    public String getVisitItem() {
        return visitItem;
    }


    /**
     * Sets the value of visitItem.
     * @param visitItem The value to assign visitItem.
     */
    public void setVisitItem(String visitItem) {
        this.visitItem = visitItem;
    }


    /**
     * Returns the value of visitDescription.
     */
    public String getVisitDescription() {
        return visitDescription;
    }


    /**
     * Sets the value of visitDescription.
     * @param visitDescription The value to assign visitDescription.
     */
    public void setVisitDescription(String visitDescription) {
        this.visitDescription = visitDescription;
    }


    /**
     * Returns the value of visitBillAmount.
     */
    public Double getVisitBillAmount() {
        return visitBillAmount;
    }


    /**
     * Sets the value of visitBillAmount.
     * @param visitBillAmount The value to assign visitBillAmount.
     */
    public void setVisitBillAmount(Double visitBillAmount) {
        this.visitBillAmount = visitBillAmount;
    }


    /**
     * Returns the value of visitTipAmount.
     */
    public Double getVisitTipAmount() {
        return visitTipAmount;
    }


    /**
     * Sets the value of visitTipAmount.
     * @param visitTipAmount The value to assign visitTipAmount.
     */
    public void setVisitTipAmount(Double visitTipAmount) {
        this.visitTipAmount = visitTipAmount;
    }


    /**
     * Returns the value of visitTotalCost.
     */
    public Double getVisitTotalCost() {
        return visitTotalCost;
    }


    /**
     * Sets the value of visitTotalCost.
     * @param visitTotalCost The value to assign visitTotalCost.
     */
    public void setVisitTotalCost(Double visitTotalCost) {
        this.visitTotalCost = visitTotalCost;
    }


    /**
     * Returns the value of visitRating.
     */
    public int getVisitRating() {
        return visitRating;
    }


    /**
     * Sets the value of visitRating.
     * @param visitRating The value to assign visitRating.
     */
    public void setVisitRating(int visitRating) {
        this.visitRating = visitRating;
    }

}
