package com.idk.edu03_oop.hp;

import java.util.Scanner;
import com.idk.network.TriangleOps;
import com.idk.network.NumberOps;
import com.idk.network.Person;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1(); // triangle area
        task2(); // smallest number
        task3(); // Person
        scanner.close();
    }

    // --- Task 1: Triangle Area ---
    public static void task1() {
        System.out.println("\n--- Task 1: Triangle Area ---");

        System.out.print("Input Side 1: ");
        double a = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double b = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double c = scanner.nextDouble();

        double area = TriangleOps.getArea(a, b, c);
        System.out.printf("The area of the triangle is %.2f%n", area);
    }

    // --- Task 2: Smallest Number ---
    public static void task2() {
        System.out.println("\n--- Task 2: Smallest Number ---");

        System.out.print("Input the first number: ");
        int x = scanner.nextInt();
        System.out.print("Input the second number: ");
        int y = scanner.nextInt();
        System.out.print("Input the third number: ");
        int z = scanner.nextInt();

        int smallest = NumberOps.getSmallest(x, y, z);
        System.out.println("The smallest number is " + smallest);
    }

    // --- Task 3: Person ---
    public static void task3() {
        System.out.println("\n--- Task 3: Person ---");

        Person[] people = new Person[5];
        for (int i = 0; i < people.length; i++) {
            System.out.println("\nPerson #" + (i + 1));
            people[i] = new Person();
            people[i].input(scanner);
        }

        System.out.println("\n--- Person Details ---");
        for (Person p : people) {
            p.output();
            System.out.println();
        }
    }
}
