package com.idk.edu05_arrays.hp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testGetDaysInMonth() {
        // Testing correct month
        assertThat(App.getDaysInMonth(1), is(31));  // January
        assertThat(App.getDaysInMonth(2), is(28));  // February

        // Testing invalid month
        assertThat(App.getDaysInMonth(13), is(-1));
        assertThat(App.getDaysInMonth(0), is(-1));
    }

    @Test
    public void testFindMin() {
        int[] numbers = {10, 5, 20, -3, 8};
        // Calling static method to find minimum
        int min = App.findMin(numbers);

        assertThat(min, is(-3));
    }

    @Test
    public void testCalculateTenNumsLogic() {
        // Case 1: First five are positive (should return sum of first five)
        int[] posArr = {1, 2, 3, 4, 5, 10, 10, 10, 10, 10};
        assertThat(App.calculateTenNums(posArr), is(15L));

        // Case 2: One of the first five is not positive (should return product of last five)
        int[] mixArr = {1, -2, 3, 4, 5, 2, 2, 2, 2, 2};
        // Last five: 2*2*2*2*2 = 32
        assertThat(App.calculateTenNums(mixArr), is(32L));
    }
}
