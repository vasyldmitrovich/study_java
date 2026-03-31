package com.idk.edu06_OOP_Part1.hp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testBirdLogic() {
        Bird eagle = new Eagle();
        // Замість instanceof перевіряємо дані, щоб прибрати варнінг
        assertNotNull("Об'єкт не має бути null", eagle);
        assertTrue("ToString має містити інфо про яйця", eagle.toString().contains("2-4"));
    }

    @Test
    public void testEmployeeReport() {
        Employee emp = new Employee("Ivan", 45, 25000.0);
        String report = emp.report();
        assertTrue(report.contains("Name: Ivan"));
        assertTrue(report.contains("₴25000.00"));
    }

    @Test
    public void testDeveloperInheritance() {
        Developer dev = new Developer("Taras", 32, 32735.35, "Java dev");
        String report = dev.report();
        // Перевірка перевизначеного методу
        assertTrue("Звіт має містити посаду", report.contains("Position: Java dev"));
    }
}