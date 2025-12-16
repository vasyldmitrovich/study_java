package com.idk.edu01_intro.pw;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1(); // FlowerBed
        task2(); // PersonalInfo
        task3(); // PhoneCalls
    }

    public static void task1() {
        System.out.print("Enter the radius of the flower bed: ");
        double radius = scanner.nextDouble();
        scanner.nextLine(); // read the remaining input after nextDouble

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Area: %.2f\n", area);
    }

    public static void task2() {
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Where do you live, %s? ", name);
        String address = scanner.nextLine();

        System.out.printf("Name: %s\nAddress: %s\n", name, address);
    }

    public static void task3() {
        double[] costs = new double[3];
        double totalCost = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter cost per minute for call %d: ", i + 1);
            double costPerMinute = scanner.nextDouble();

            System.out.printf("Enter duration in minutes for call %d: ", i + 1);
            double duration = scanner.nextDouble();

            scanner.nextLine(); // read the remaining input after nextDouble

            costs[i] = costPerMinute * duration;
            totalCost += costs[i];
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Cost of call %d: %.2f\n", i + 1, costs[i]);
        }

        System.out.printf("Total cost: %.2f\n", totalCost);
    }
}
