package com.idk.edu07_Part2.pw;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {

    @Test
    public void testCatCreation() {
        Cat cat = new Cat("Murka");
        Assert.assertEquals("Murka", cat.getName());
    }

    @Test
    public void testDogEquality() {
        Dog dog1 = new Dog("Sirko");
        Dog dog2 = new Dog("Sirko");
        Assert.assertEquals(dog1, dog2);
    }

    @Test
    public void testTeacherType() {
        Assert.assertEquals("TEACHER", Teacher.TYPE_PERSON);
    }

    @Test
    public void testStudentInheritance() {
        Student student = new Student("Oleg");
        Assert.assertTrue(student instanceof Person);
    }
}