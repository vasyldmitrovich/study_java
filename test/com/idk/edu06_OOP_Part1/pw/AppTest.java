package com.idk.edu06_OOP_Part1.pw;

// Імпорти для JUnit 4
import org.junit.Test;
import static org.junit.Assert.*;

// Імпорт твоїх класів з пакета imports
import com.idk.edu06_OOP_Part1.imports.*;

public class AppTest {

    @Test
    public void testCarHierarchy() {
        // Тестуємо ієрархію автомобілів (Завдання 2)
        Car truck = new Truck("Volvo FH", 120, 2022);
        Car sedan = new Sedan("BMW M5", 250, 2023);

        assertNotNull("Об'єкт Truck не має бути null", truck);
        assertEquals("Volvo FH", truck.model);
        assertEquals(250, sedan.maxSpeed);
    }

    @Test
    public void testPointToString() {
        // Тестуємо правильність формату виводу Point (Завдання 3*)
        Point p = new Point(5, 10);

        assertEquals(5, p.x);
        assertEquals(10, p.y);
        // Перевіряємо, чи toString повертає (x, y)
        assertEquals("(5, 10)", p.toString());
    }

    @Test
    public void testColorLineData() {
        // Тестуємо ColorLine та успадкування від Line
        Point start = new Point(0, 0);
        Point end = new Point(10, 10);
        ColorLine colorLine = new ColorLine(start, end, "Blue");

        // Перевіряємо специфічне поле кольору
        assertEquals("Blue", colorLine.color);

        // Перевірка полів, успадкованих від Line
        assertNotNull("Початок лінії не має бути null", colorLine.start);
        assertEquals(start, colorLine.start);
    }
}