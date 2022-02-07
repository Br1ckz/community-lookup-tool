/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.communitylookuptool;

/**
 *
 * @author Bryce Ciemiewicz
 */
public class Campus {
    private String name;
    private int numStudents;
    private String location;
    private int numFaculty;
    
    public Campus(String name, int numStudents, String location,
            int numFaculty) {
        this.name = name;
        this.numStudents = numStudents;
        this.location = location;
        this.numFaculty = numFaculty;
    }

    public String getName() {
        return name;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getLocation() {
        return location;
    }

    public int getNumFaculty() {
        return numFaculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumFaculty(int numFaculty) {
        this.numFaculty = numFaculty;
    }

    @Override
    public String toString() {
        return "Campus{" + "name=" + name + ", numStudents=" + numStudents + ", location=" + location + ", numFaculty=" + numFaculty + '}';
    }
}