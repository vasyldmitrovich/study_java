package com.idk.edu03_oop.pw;

import java.util.Scanner;

public class App {
    // The shared Scanner object for all methods to use.
    public static Scanner scanner = new Scanner(System.in);

    // --- Main Execution Method ---
    public static void main(String[] args) {
        task1();
        // Ensure the scanner resource is closed when the program exits.
        scanner.close(); 
    }

    // --- Task 1: The Core Logic Executor ---
    public static void task1() {
        System.out.println("--- Starting Practical Task: Number Operations ---");
        
        // 1. Get input from the user using the required method
        int firstNum = getNumber("Enter the first number: ");
        int secondNum = getNumber("Enter the second number: ");

        // 2. Calculate the total and average
        int total = getTotal(firstNum, secondNum);
        double average = getAverage(firstNum, secondNum);

        // 3. Print the results
        System.out.println();
        System.out.println("The sum of " + firstNum + " and " + secondNum + " is " + total);
        
        // Format the output to match the example (e.g., 4.5)
        System.out.println("The average of " + firstNum + " and " + secondNum + " is " + String.format("%.1f", average));
        
        System.out.println("\n--- Task Complete ---");
    }

    // --- Required Methods (Placed within the App class) ---

    /**
     * (*) static getNumber(String prompt) - Allows input of numbers using Scanner, 
     * displays a prompt, and handles non-integer input.
     * @param prompt The message to display to the user before input.
     * @return The integer number entered by the user.
     */
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
                scanner.next(); // Consume the invalid input
            }
        }
        return number;
    }

    /**
     * getTotal - returns their sum.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The total sum (int).
     */
    public static int getTotal(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * getAverage - returns their average.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The average (double).
     */
    public static double getAverage(int num1, int num2) {
        // Cast to double for precise calculation
        return (double) (num1 + num2) / 2;
    }
}