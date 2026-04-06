package com.idk.edu06_OOP_Part1.pw;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testCarMethods() {
        Truck truck = new Truck();
        truck.setYear(2021); // Now works!
        assertEquals(2021, truck.getYear());
    }
}