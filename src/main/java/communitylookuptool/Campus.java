/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

/**
 *
 * @author Bryce Ciemiewicz
 */
public class Campus implements Location{
    private String name;
    private int numStudents;
    private String location;
    private int numFaculty;
    
    public Campus(String name, int numStudents, int numFaculty) {
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

    public int getNumFaculty() {
        return numFaculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setNumFaculty(int numFaculty) {
        this.numFaculty = numFaculty;
    }

    @Override
    public String toString() {
        return "Campus{" + "name=" + name + ", numStudents=" + numStudents + ", location=" + location + ", numFaculty=" + numFaculty + '}';
    }

    @Override
    public void setLocation(String inLocation) {
        location = inLocation;
    }
    
    @Override
    public void updateLocation(String oldLocation, String newLocation) {
        location = location.replace(oldLocation, newLocation);
    }

    @Override
    public void addLocation(String inLocation) {
        location += ", " + inLocation;
    }
    
    public String getLocation() {
        return location;
    }
}