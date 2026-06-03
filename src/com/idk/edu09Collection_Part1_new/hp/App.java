package com.idk.edu09Collection_Part1_new.hp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        hw1();
        hw2();
    }

    public static void hw1() {
        System.out.println("\n--- HW 1 ---");
        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(101) - 50);
        }
        System.out.println("Initial: " + myCollection);

        if (!myCollection.isEmpty()) {
            int maxIdx = 0;
            int minIdx = 0;
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) > myCollection.get(maxIdx)) maxIdx = i;
                if (myCollection.get(i) < myCollection.get(minIdx)) minIdx = i;
            }
            Collections.swap(myCollection, maxIdx, minIdx);
            System.out.println("After swap max/min: " + myCollection);
        }

        int firstNegativeIdx = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativeIdx = i;
                break;
            }
        }
        if (firstNegativeIdx != -1) {
            int randomThreeDigit = random.nextInt(900) + 100;
            myCollection.add(firstNegativeIdx, randomThreeDigit);
            System.out.println("After inserting 3-digit number: " + myCollection);
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting zeros: " + myCollection);

        int k = 3;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (i < k) {
                list1.add(myCollection.get(i));
            } else {
                list2.add(0, myCollection.get(i));
            }
        }
        System.out.println("List1: " + list1);
        System.out.println("List2 (reversed): " + list2);

        int lastEvenIdx = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIdx = i;
                break;
            }
        }
        if (lastEvenIdx != -1) {
            myCollection.remove(lastEvenIdx);
            System.out.println("After removing last even element: " + myCollection);
        } else {
            System.out.println("No even elements found.");
        }

        if (!myCollection.isEmpty()) {
            int minIdx = 0;
            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) < myCollection.get(minIdx)) {
                    minIdx = i;
                }
            }
            if (minIdx < myCollection.size() - 1) {
                myCollection.remove(minIdx + 1);
                System.out.println("After removing element following first min: " + myCollection);
            }
        }
    }

    public static void hw2() {
        System.out.println("\n--- HW 2 ---");
        ArrayList<Student> students = new ArrayList<>();

        ArrayList<Integer> g1 = new ArrayList<>(List.of(4, 5, 4));
        ArrayList<Integer> g2 = new ArrayList<>(List.of(2, 3, 2));
        ArrayList<Integer> g3 = new ArrayList<>(List.of(3, 3, 4));

        students.add(new Student("Ilya", "KIPZs-24-3", 2, g1));
        students.add(new Student("John", "KIPZs-24-3", 1, g2));
        students.add(new Student("Anna", "KIPZs-24-3", 2, g3));

        processStudents(students);
        System.out.println("Students after promotion loop:");
        printStudents(students, 3);
        printStudents(students, 2);
        printStudents(students, 1);
    }

    public static void processStudents(List<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            Student s = students.get(i);
            if (s.getAverageGrade() < 3) {
                students.remove(i);
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students on course " + course + ":");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}