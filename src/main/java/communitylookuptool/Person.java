/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitylookuptool;

import java.util.Scanner;

/**
 *
 * @author bryce
 */
public class Person {
    private String firstName;
    private String lastName;
    private String campus; 
    protected String fullName;
    protected String affiliation;
    
    public Person(String firstName, String lastName, String campus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.campus = campus;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCampus() {
        return campus;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void setFullName() {
        this.fullName = firstName + " " + lastName;
    }

    public void setAffiliation() {
        this.affiliation = "COMMUNITY";
    }
    
    public String getAffiliation() {
        return affiliation;
    }
    
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", campus=" + campus + '}';
    }
}