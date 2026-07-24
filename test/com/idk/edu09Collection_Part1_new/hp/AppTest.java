package com.idk.edu09Collection_Part1_new.hp;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    public void testStudentPromotionAndRemoval() {
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> goodGrades = new ArrayList<>(List.of(4, 5, 4));
        ArrayList<Integer> badGrades = new ArrayList<>(List.of(2, 2, 3));

        Student s1 = new Student("Ilya", "KIPZs-24-3", 2, goodGrades);
        Student s2 = new Student("John", "KIPZs-24-3", 1, badGrades);

        students.add(s1);
        students.add(s2);

        App.processStudents(students);

        Assert.assertEquals(1, students.size());
        Assert.assertEquals("Ilya", students.get(0).getName());
        Assert.assertEquals(3, students.get(0).getCourse());
    }

    @Test
    public void testHw1LogicInIsolation() {
        ArrayList<Integer> list = new ArrayList<>(List.of(10, -5, 20, -2, 30));

        int maxIdx = 0;
        int minIdx = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIdx)) maxIdx = i;
            if (list.get(i) < list.get(minIdx)) minIdx = i;
        }
        java.util.Collections.swap(list, maxIdx, minIdx);
        Assert.assertEquals(Integer.valueOf(-5), list.get(2));
        Assert.assertEquals(Integer.valueOf(20), list.get(1));

        int firstNegativeIdx = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                firstNegativeIdx = i;
                break;
            }
        }
        if (firstNegativeIdx != -1) {
            list.add(firstNegativeIdx, 555);
        }
        Assert.assertEquals(Integer.valueOf(555), list.get(2));

        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i) >= 0 && list.get(i + 1) < 0) || (list.get(i) < 0 && list.get(i + 1) >= 0)) {
                list.add(i + 1, 0);
                i++;
            }
        }
        Assert.assertEquals(Integer.valueOf(0), list.get(4));
    }
}