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
public class Faculty extends Person{
    private String department;
    private String research;

    public Faculty(String firstName, String lastName, String campus, String department, String research) {
        super(firstName, lastName, campus);
        this.department = department;
        this.research = research;
    }

    public String getDepartment() {
        return department;
    }

    public String getResearch() {
        return research;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public void setAffiliation() {
        this.affiliation = "FACULTY";
    }

    public String getAffilaiton() {
        return affiliation;
    }
    
    @Override
    public String toString() {
        return "Faculty{firstName=" + super.getFirstName() + ", lastName=" + super.getLastName() + ", campus=" + super.getCampus() + ", department=" + department + ", research=" + research + '}';
    }
}