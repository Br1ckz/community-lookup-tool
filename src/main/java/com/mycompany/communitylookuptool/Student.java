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
public class Student {
    private String firstName;
    private String lastName;
    private String classYear;
    private String campus;

    public Student(String firstName, String lastName, String classYear, 
                    String campus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classYear = classYear;
        this.campus = campus;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClassYear() {
        return classYear;
    }

    public String getCampus() {
        return campus;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", classYear=" + classYear + ", campus=" + campus + '}';
    }
}
