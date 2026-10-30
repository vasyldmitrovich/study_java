package com.idk.edu10.hp;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }

    public static int compareByName(Student a, Student b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }

    public static int compareByCourse(Student a, Student b) {
        return Integer.compare(a.getCourse(), b.getCourse());
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', course=" + course + '}';
    }
}
