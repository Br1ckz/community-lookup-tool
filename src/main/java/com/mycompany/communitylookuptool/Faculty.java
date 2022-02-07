/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.communitylookuptool;

/**
 *
 * @author bzc5373
 */
public class Faculty {
    private String firstName;
    private String lastName;
    private String campus;
    private String department;
    private String research;

    public Faculty(String firstName, String lastName, String campus, String department, String research) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.campus = campus;
        this.department = department;
        this.research = research;
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

    public String getDepartment() {
        return department;
    }

    public String getResearch() {
        return research;
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

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public String toString() {
        return "Faculty{" + "firstName=" + firstName + ", lastName=" + lastName + ", campus=" + campus + ", department=" + department + ", research=" + research + '}';
    }
}