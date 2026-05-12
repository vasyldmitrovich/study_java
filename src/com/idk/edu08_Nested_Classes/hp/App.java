package com.idk.edu08_Nested_Classes.hp;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student(new FullName("John", "Doe"), 20, 2);
        Student s2 = new Student(new FullName("Anna", "Smith"), 22, 4);

        System.out.println(s1.info());
        System.out.println(s1.activity());
        System.out.println(s2.info());
        System.out.println(s2.activity());

        Student s3 = s1.clone();
        s3.course = 3;

        System.out.println("\nAfter clone:");
        System.out.println(s1.info());
        System.out.println(s3.info());
    }
}
