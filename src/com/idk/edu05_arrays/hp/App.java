package com.idk.edu05_arrays.hp;


import java.util.*;
import com.idk.edu05_arrays.imports.Car;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hw1_all_parts();
        hw2_doWhileSum();
        hw3_carsLogic();
        hw4_guessGame();
        scanner.close();
    }


    public static int getDaysInMonth(int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12) return -1;
        return days[month - 1];
    }

    public static long calculateTenNums(int[] arr) {
        boolean firstFivePos = true;
        for (int i = 0; i < 5; i++) if (arr[i] <= 0) firstFivePos = false;

        if (firstFivePos) {
            int sum = 0;
            for (int i = 0; i < 5; i++) sum += arr[i];
            return sum;
        } else {
            long prod = 1;
            for (int i = 5; i < 10; i++) prod *= arr[i];
            return prod;
        }
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }


    public static void hw1_all_parts() {
        System.out.println("\n--- HW 1.1: Months ---");
        int m = getInt("Month number: ");
        System.out.println("Days: " + getDaysInMonth(m));

        System.out.println("\n--- HW 1.2: 10 Numbers Logic ---");
        int[] ten = new int[10];
        for (int i = 0; i < 10; i++) ten[i] = getInt("N" + (i+1) + ": ");
        System.out.println("Result: " + calculateTenNums(ten));

        System.out.println("\n--- HW 1.3: Min & Pos ---");
        int[] five = new int[5];
        for (int i = 0; i < 5; i++) five[i] = getInt("Val: ");
        System.out.println("Min is: " + findMin(five));
    }

    public static void hw2_doWhileSum() {
        System.out.println("\n--- HW 2: Do-While Sum ---");
        String again;
        do {
            int a = getInt("A: ");
            int b = getInt("B: ");
            System.out.println("Sum: " + (a + b));
            System.out.print("Again? (y/n): ");
            again = scanner.next();
        } while (again.equalsIgnoreCase("y"));
    }

    public static void hw3_carsLogic() {
        System.out.println("\n--- HW 3: Cars ---");
        Car[] cars = {
            new Car("Audi", 2020, 2.0),
            new Car("BMW", 2015, 3.0),
            new Car("Tesla", 2022, 0.0),
            new Car("Lanos", 2008, 1.5)
        };
        int y = getInt("Search year: ");
        for (Car c : cars) if (c.year == y) System.out.println(c);
        
        System.out.println("Sorted by year:");
        Arrays.sort(cars, (c1, c2) -> Integer.compare(c1.year, c2.year));
        for (Car c : cars) System.out.println(c);
    }

    public static void hw4_guessGame() {
        System.out.println("\n--- HW 4: Guess Game ---");
        int target = new Random().nextInt(100) + 1;
        int guess;
        do {
            guess = getInt("Guess (1-100): ");
            if (guess > target) System.out.println("Too high");
            else if (guess < target) System.out.println("Too low");
        } while (guess != target);
        System.out.println("You won!");
    }

    public static int getInt(String p) {
        System.out.print(p);
        while (!scanner.hasNextInt()) { scanner.next(); }
        return scanner.nextInt();
    }
}