/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package communitylookuptool;

import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author Bryce Ciemiewicz
 */
public class TestHarness {
    public TestHarness() {
        testCampus();
        System.out.println();
        testStudent();
        System.out.println();
        testClassHierarchy();
        System.out.println();
        testInterface();
    }
    
    public void testCampus(){
        Campus campus = new Campus("Berks", 3000, 300);
        
        System.out.println("----------Campus----------");
        System.out.println("-----Initial Conditions-----");
        System.out.println("Campus: " + campus.getName());
        System.out.println("Number of Students: " + campus.getNumStudents());
        System.out.println("Location: " + campus.getLocation());
        System.out.println("Number of Faculty: " + campus.getNumFaculty());
        System.out.println("toString: " + campus.toString());
        
        campus.setName("University Park");
        campus.setNumStudents(45000);
        campus.setLocation("State College, PA");
        campus.setNumFaculty(1200);
        
        System.out.println("-----Changed Conditions-----");
        System.out.println("Campus: " + campus.getName());
        System.out.println("Number of Students: " + campus.getNumStudents());
        System.out.println("Location: " + campus.getLocation());
        System.out.println("Number of Faculty: " + campus.getNumFaculty());
        System.out.println("toString: " + campus.toString());
    }
    
    public void testStudent(){
        Student student = new Student("Bryce", "Ciemiewicz", "Berks", "Senior", "bzc5373");
        
        System.out.println("----------Student----------");
        System.out.println("-----Initial Conditions-----");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Class Year: " + student.getClassYear());
        System.out.println("Campus: " + student.getCampus());
        System.out.println("toString: " + student.toString());

        student.setFirstName("Rand");
        student.setLastName("Person");
        student.setClassYear("Freshman");
        student.setCampus("University Park");
        
        System.out.println("-----Changed Conditions-----");
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Class Year: " + student.getClassYear());
        System.out.println("Campus: " + student.getCampus());
        System.out.println("toString: " + student.toString());
    }
    
    public void testClassHierarchy() {
        ArrayList<Person> persons = new ArrayList<>();
        
        Person person = new Person("Rand", "Person", "University Park");
        person.setAffiliation();
        
        Student student = new Student("Bryce", "Ciemiewicz", "Berks", "Senior", "bzc5373");
        student.setAffiliation();
        
        Faculty faculty = new Faculty("Trisha", "Clark", "Berks", "IST", "Computer Vision");
        faculty.setAffiliation();
        
        persons.add(person);
        persons.add(student);
        persons.add(faculty);
        
        System.out.println("----------Hierarchy Check----------");
        
        for (Person p : persons) {
            System.out.println("Affilation: " + p.getAffiliation());
        }
        
        for (Person p : persons) {
            System.out.println("toString: " + p.toString());
        }
    }
    
    public static void testInterface() {
        ArrayList<Location> locations = new ArrayList<>();
        Campus campus = new Campus("Berks", 3000, 300);
        Event event = new Event("IST Meeting", "1/25/2022", "3:00PM");
        locations.add(campus);
        locations.add(event);
        
        for (Location location : locations) {
            location.setLocation("Penn State Berks");
            location.updateLocation("Penn State Berks", "Penn State University Park");
            location.addLocation("Penn State Great Valley");
        }
        
        System.out.println("----------Interface Check----------");
        System.out.println("Campus implements Location");
        System.out.println("Campus location: " + campus.getLocation());
        System.out.println("Event implements Locations");
        System.out.println("Event location: " + event.getLocation());
    }
}