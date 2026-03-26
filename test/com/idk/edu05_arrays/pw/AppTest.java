package com.idk.edu05_arrays.pw;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import com.idk.edu05_arrays.imports.Employee;

public class AppTest {

    @Test
    public void testGetFruitsReturnsCorrectData() {
        // Arrange: get data from the App class
        String[] fruits = App.getFruits();

        // Assert: check array size and content using Hamcrest
        assertThat(fruits, arrayWithSize(4));
        assertThat(fruits, hasItemInArray("Apple"));
        assertThat(fruits[0], is("Orange"));
    }

    @Test
    public void testGetValuesCalculation() {
        // Arrange: get double values
        double[] vals = App.getValues();

        // Act: calculate average
        double sum = 0;
        for (double v : vals) sum += v;
        double average = sum / vals.length;

        // Assert: check if average is approximately 10.6
        assertThat(average, closeTo(10.6, 0.01));
    }

    @Test
    public void testGetStaffInitialization() {
        // Arrange: get employees list
        Employee[] staff = App.getStaff();

        // Assert: verify staff count and first entry
        assertThat(staff, arrayWithSize(5));
        assertThat(staff[0].name, is("Andrii"));
    }
}
