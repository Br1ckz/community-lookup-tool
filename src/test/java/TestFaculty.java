/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import communitylookuptool.Faculty;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bryce Ciemiewicz
 */
public class TestFaculty {
    
    Faculty faculty;
    public TestFaculty() {
    }
    
    @BeforeAll
    public static void setUpClass() {       
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        faculty = new Faculty("Trisha", "Clark", "Berks", "IST", "Computer Vision");
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testGetFirstName() {
        assertEquals("Trisha", faculty.getFirstName());
    }
    
    @Test
    void getLastName() {
        assertEquals("Clark", faculty.getLastName());
    }

    @Test
    void testGetCampus() {
        assertEquals("Berks", faculty.getCampus());
    }

    @Test
    void testGetDepartment() {
        assertEquals("IST", faculty.getDepartment());
    }
    
    @Test 
    void testGetResearch() {
        assertEquals("Computer Vision", faculty.getResearch());
    }
    
    @Test
    void testSetFirstName() {
        faculty.setFirstName("Rand");
        assertEquals("Rand", faculty.getFirstName());
    }

    @Test
    void testSetLastName() {
        faculty.setLastName("Person");
        assertEquals("Person", faculty.getLastName());
    }

    @Test
    void testSetCampus() {
        faculty.setCampus("University Park");
        assertEquals("University Park", faculty.getCampus());
    }

    @Test
    void testSetDepartment() {
        faculty.setDepartment("Engineering");
        assertEquals("Engineering", faculty.getDepartment());
    }
    
    @Test
    void testSetResearch() {
        faculty.setResearch("Mechanical Engineering");
        assertEquals("Mechanical Engineering", faculty.getResearch());
    }

    @Test
    void testToString() {
        assertEquals("Faculty{firstName=Trisha, lastName=Clark, campus=Berks, department=IST, research=Computer Vision}", faculty.toString());
    }
}