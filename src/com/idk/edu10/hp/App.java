package com.idk.edu10.hp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Homework 1: union / intersect
    public static void task1() {
        System.out.println("\n--- TASK 1 ---");
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(4, 5, 6, 7, 8));
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("Union: " + SetOperations.union(set1, set2));
        System.out.println("Intersection: " + SetOperations.intersect(set1, set2));
    }

    // Homework 2: personMap
    public static void task2() {
        System.out.println("\n--- TASK 2 ---");
        Map<String, String> personMap = PersonMapService.createPersonMap();
        System.out.println("personMap:");
        PersonMapService.printMap(personMap);

        System.out.println("\nAt least two people with the same first name? "
                + (PersonMapService.hasDuplicateFirstNames(personMap) ? "Yes" : "No"));

        PersonMapService.removeByFirstName(personMap, "Orest");
        System.out.println("\nAfter removing 'Orest':");
        PersonMapService.printMap(personMap);
    }

    // Homework 3: Student
    public static void task3() {
        System.out.println("\n--- TASK 3 ---");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Olena", 2));
        students.add(new Student("Andriy", 1));
        students.add(new Student("Maryna", 3));
        students.add(new Student("Bohdan", 2));
        students.add(new Student("Dmytro", 1));

        System.out.println("Students of course 2:");
        Student.printStudents(students, 2);

        List<Student> byName = new ArrayList<>(students);
        byName.sort(Student::compareByName);
        System.out.println("\nSorted by name:");
        byName.forEach(System.out::println);

        List<Student> byCourse = new ArrayList<>(students);
        byCourse.sort(Student::compareByCourse);
        System.out.println("\nSorted by course:");
        byCourse.forEach(System.out::println);
    }
}
