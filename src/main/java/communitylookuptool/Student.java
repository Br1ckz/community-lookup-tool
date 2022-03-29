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
public class Student extends Person{
    private String classYear;
    private String userID;
    
    public Student(String firstName, String lastName, String campus, String classYear,
            String userID) {
        super(firstName, lastName, campus);
        this.classYear = classYear;
        this.userID = userID;
    }

    public String getClassYear() {
        return classYear;
    }

    public String getUserID() {
        return userID;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    @Override
    public void setAffiliation() {
        this.affiliation = "STUDENT";
    }
    
    public String getAffilation() {
        return affiliation;
    }
    
    @Override
    public String toString() {
        return "Student{firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", campus=" + super.getCampus() + "classYear=" + classYear + "}";
    }
}