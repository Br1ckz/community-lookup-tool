/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.communitylookuptool;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author bzc5373
 */
public class Search {
    private String[] results;
    private int numResults;
    private Date searchDate;
    private Time searchTime;

    public Search(String[] results, int numResults, Date searchDate, Time searchTime) {
        this.results = results;
        this.numResults = numResults;
        this.searchDate = searchDate;
        this.searchTime = searchTime;
    }

    public String[] getResults() {
        return results;
    }

    public int getNumResults() {
        return numResults;
    }

    public Date getSearchDate() {
        return searchDate;
    }

    public Time getSearchTime() {
        return searchTime;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    public void setNumResults(int numResults) {
        this.numResults = numResults;
    }

    public void setSearchDate(Date searchDate) {
        this.searchDate = searchDate;
    }

    public void setSearchTime(Time searchTime) {
        this.searchTime = searchTime;
    }

    @Override
    public String toString() {
        return "Search{" + "results=" + results + ", numResults=" + numResults + ", searchDate=" + searchDate + ", searchTime=" + searchTime + '}';
    }
    
}
