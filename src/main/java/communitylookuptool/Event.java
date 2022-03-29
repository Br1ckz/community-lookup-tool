/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

import java.util.ArrayList;

/**
 *
 * @author bzc5373
 */
public class Event implements Location {
    private String name;
    private String date;
    private String time;
    private ArrayList location;

    public Event(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", date=" + date + ", time=" + time + '}';
    }

    @Override
    public void setLocation(String inLocation) {
        location = new ArrayList<>();
        location.add(inLocation);
    }

    @Override
    public void updateLocation(String oldLocation, String newLocation) {
        location.remove(oldLocation);
        location.add(newLocation);
    }

    @Override
    public void addLocation(String inLocation) {
        location.add(inLocation);
    }
    
    public ArrayList getLocation() {
        return location;
    }
    
    
}