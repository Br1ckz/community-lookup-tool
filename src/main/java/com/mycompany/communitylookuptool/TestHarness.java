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
public class TestHarness {
    public TestHarness() {
        testCampus();
        testStudent();
    }
    
    public void testCampus(){
        Campus campus = new Campus("Berks", 3000, "Reading, PA", 300);
        
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
        Student student = new Student("Bryce", "Ciemiewicz", "Senior", "Berks");
        
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
}
