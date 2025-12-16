package com.idk.edu01_intro.hw;
import java.util.Scanner;
import java.time.LocalTime;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static double safeReadDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number (for example, 12.5).");
            }
        }
    }

    public static int safeReadInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer (for example, 7).");
            }
        }
    }

    public static void task1() {
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
    }

    public static void task2() {
        double num1 = safeReadDouble("Input first number: ");
        double num2 = safeReadDouble("Input second number: ");
        double num3 = safeReadDouble("Input third number: ");

        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average is " + average);
    }

    public static void task3() {
        int a = safeReadInt("Enter integer a: ");
        int b = safeReadInt("Enter integer b: ");

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Division and modulo by zero are undefined.");
        }

        System.out.println("a ^ b = " + Math.pow(a, b));
    }

    public static void task4() {
        LocalTime now = LocalTime.now();
        String greeting;

        if (now.isBefore(LocalTime.NOON)) {
            greeting = "Good morning";
        } else if (now.isBefore(LocalTime.of(18, 0))) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }

        System.out.println(greeting + "! How are you feeling today?");
        String mood = scanner.nextLine();
        System.out.println("You are feeling " + mood + ". Thanks for sharing!");
    }
}
