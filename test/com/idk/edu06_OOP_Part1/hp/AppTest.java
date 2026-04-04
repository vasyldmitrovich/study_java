package com.idk.edu06_OOP_Part1.hp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testBirdFunctionality() {
        Eagle eagle = new Eagle();
        eagle.setFeathers("Golden");
        assertEquals("Golden", eagle.getFeathers());

        // Removed 'eagle instanceof Bird' check because it is always true
        // and caused a warning.
    }

    @Test
    public void testEquality() {
        Employee e1 = new Employee("Ivan", 30, 2000.0);
        Employee e2 = new Employee("Ivan", 30, 2000.0);
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
    }
}