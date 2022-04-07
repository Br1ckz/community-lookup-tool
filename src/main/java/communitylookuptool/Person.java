/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitylookuptool;

import java.io.Serializable;

/**
 *
 * @author bryce
 */
public class Person implements Serializable {
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
        return "Person{" + "lastName=" + lastName + ", firstName=" + firstName + ", campus=" + campus + '}';
    }
    
    
    public boolean decideToInsert(Object person) {
		boolean decision = false;
		boolean firstDec = false;
		boolean lastDec = false;
		
		Person person1 = (Person)person;
//		if (this.shippingPriority < order1.shippingPriority) {
//			decision = true;
//		}
		String lowerLast = this.lastName.toLowerCase();
		String lowerFirst = this.firstName.toLowerCase();
		char firstName[] = lowerFirst.toCharArray();
		char lastName[] = lowerLast.toCharArray();
		int sizeLast = lastName.length;
		int sizeFirst = lastName.length;
		for (int i = 0; i < sizeLast; i++) {
			for (int j = i + 1; j < sizeLast; j++) {
				if (lastName[j] > lastName[i]){
					lastDec = true;
				}
			}
		}

		for (int i = 0; i < sizeFirst; i++) {
			for (int j = i + 1; j < sizeFirst; j++) {
				if (firstName[j] > firstName[i]){
					firstDec = true;
				}
			}
		}
		
		decision = firstDec & lastDec;
		
		return decision;
	}
}