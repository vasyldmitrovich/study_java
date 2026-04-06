package com.idk.edu05_arrays.pw;

import java.util.*;
import com.idk.edu05_arrays.imports.Employee;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        scanner.close();
    }

    // --- Task 1: String sorting, Average, Search ---
    public static void task1() {
        System.out.println("\n--- Task 1: Arrays Magic ---");

        String[] fruits = getFruits(); // Виклик методу ініціалізації
        Arrays.sort(fruits);
        System.out.println("Sorted: " + Arrays.toString(fruits));

        double[] vals = getValues(); // Виклик методу ініціалізації
        double sum = 0;
        for (double v : vals) sum += v;
        System.out.println("Average: " + (sum / vals.length));

        System.out.print("Enter fruit to find: ");
        String search = scanner.next();
        boolean found = false;
        for (String f : fruits) {
            if (f.equalsIgnoreCase(search)) { found = true; break; }
        }
        System.out.println("Result: " + (found ? "Found it!" : "Not in the list."));
    }

    // --- Task 2: Prime Number Logic ---
    public static void task2() {
        System.out.println("\n--- Task 2: Prime Check ---");
        int n = getInt("Enter positive integer: ");

        if (n <= 1) {
            System.out.println("Is not prime number");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        System.out.println(isPrime ? "Is a prime number" : "Is not prime number");
    }

    // --- Task 3: Random Array & Stats ---
    public static void task3() {
        System.out.println("\n--- Task 3: Random Stats ---");
        Random rnd = new Random();
        int[] nums = new int[10];
        int posSum = 0, negCount = 0, posCount = 0;

        System.out.print("Generated Array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(201) - 100;
            System.out.print(nums[i] + " ");

            if (nums[i] > 0) { posSum += nums[i]; posCount++; }
            else if (nums[i] < 0) { negCount++; }
        }

        int max = nums[0];
        for (int x : nums) if (x > max) max = x;

        System.out.println("\nMax: " + max + " | Sum Positive: " + posSum + " | Negatives: " + negCount);

        if (negCount > posCount) System.out.println("There are more negative values.");
        else if (posCount > negCount) System.out.println("There are more positive values.");
        else System.out.println("Counts are equal.");
    }

    // --- Task 4: Employee Filter & Salary Sort ---
    public static void task4() {
        System.out.println("\n--- Task 4: Employee Management ---");
        Employee[] staff = getStaff(); // Виклик методу ініціалізації

        int targetDept = getInt("Enter department (1-3): ");
        System.out.println("Employees in Dept " + targetDept + ":");
        for (Employee e : staff) {
            if (e.departmentNumber == targetDept) System.out.println(e);
        }

        Arrays.sort(staff, (a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("\nSorted by Salary (Desc):");
        for (Employee e : staff) System.out.println(e);
    }

    // --- Initialization Methods (What the teacher requested) ---

    public static String[] getFruits() {
        return new String[]{"Orange", "Apple", "Banana", "Kiwi"};
    }

    public static double[] getValues() {
        return new double[]{12.5, 5.0, 7.2, 18.3, 10.0};
    }

    public static Employee[] getStaff() {
        return new Employee[]{
                new Employee("Andrii", 1, 1200),
                new Employee("Oksana", 2, 2800),
                new Employee("Maks", 1, 1500),
                new Employee("Dmitro", 3, 3500),
                new Employee("Yulia", 2, 2100)
        };
    }

    // --- Helper ---
    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid. Enter number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}