package com.idk.edu03_oop.pw;

import java.util.Scanner;
import com.idk.network.Employee;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        scanner.close(); 
    }

    // --- Task 1: Number Operations ---
    public static void task1() {
        System.out.println("\n--- Task 1: Number Operations ---");

        int firstNum = getNumber("Enter the first number: ");
        int secondNum = getNumber("Enter the second number: ");

        int total = getTotal(firstNum, secondNum);
        double average = getAverage(firstNum, secondNum);

        System.out.println("Sum: " + total);
        System.out.println("Average: " + String.format("%.2f", average));
    }

    // --- Task 2: Employee Input and Display ---
    public static void task2() {
        System.out.println("\n--- Task 2: Employee Input ---");

        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEmployee #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();

            double rate = getDouble("Hourly rate (USD): ");
            int hours = getNumber("Hours worked: ");

            employees[i] = new Employee(name, rate, hours);
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            System.out.println(e);
            System.out.println();
        }

        System.out.println("Total salary of all employees: " + Employee.getTotalSum() + " USD");
    }

    // --- Utility Methods ---
    public static int getNumber(String prompt) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
            }
        }
        return number;
    }

    public static double getDouble(String prompt) {
        double number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a decimal number.");
                scanner.next();
            }
        }
        return number;
    }

    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    public static double getAverage(int num1, int num2) {
        return (double) (num1 + num2) / 2;
    }
}
