/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.communitylookuptool.*;
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
public class TestEvent {
    
    Event event;
    public TestEvent() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        event = new Event("IST Meeting", "1/25/2022", "3:00PM", "Penn State Berks");
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testGetName() {
        assertEquals("IST Meeting", event.getName());
    }

    @Test
    void testGetDate() {
        assertEquals("1/25/2022", event.getDate());
    }

    @Test
    void testGetTime() {
        assertEquals("3:00PM", event.getTime());
    }

    @Test
    void testGetLocation() {
        assertEquals("Penn State Berks", event.getLocation());
    }

    @Test
    void testSetName() {
        event.setName("Business Meeting");
        assertEquals("Business Meeting", event.getName());
    }

    @Test
    void testSetDate() {
        event.setDate("2/3/2022");
        assertEquals("2/3/2022", event.getDate());
    }

    @Test
    void testSetTime() {
        event.setTime("12:00PM");
        assertEquals("12:00PM", event.getTime());
    }

    @Test
    void testSetLocation() {
        event.setLocation("Penn State University Park");
        assertEquals("Penn State University Park", event.getLocation());
    }

    @Test
    void testToString() {
        assertEquals("Event{name=IST Meeting, date=1/25/2022, time=3:00PM, location=Penn State Berks}", event.toString());
    }
}