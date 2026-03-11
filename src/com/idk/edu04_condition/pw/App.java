package com.idk.edu04_condition.pw;

import java.util.Scanner;
import com.idk.edu04_condition.imports.Continent; // Імпорт нашого Enum
import com.idk.edu04_condition.imports.Product;   // Імпорт нашого класу

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        scanner.close();
    }

    // --- Task 1: Odd Numbers ---
    public static void task1() {
        System.out.println("\n--- Task 1: Count Odds ---");
        int odds = 0;
        for (int i = 0; i < 3; i++) {
            if (getInt("Enter number: ") % 2 != 0) odds++;
        }
        System.out.println("Odd numbers count: " + odds);
    }

    // --- Task 2: Days (Dual Language) ---
    public static void task2() {
        System.out.println("\n--- Task 2: Day Names ---");
        int day = getInt("Enter day (1-7): ");
        String name = switch (day) {
            case 1 -> "Monday / Понеділок";
            case 2 -> "Tuesday / Вівторок";
            case 3 -> "Wednesday / Середа";
            case 4 -> "Thursday / Четвер";
            case 5 -> "Friday / П'ятниця";
            case 6 -> "Saturday / Субота";
            case 7 -> "Sunday / Неділя";
            default -> "Invalid day";
        };
        System.out.println(name);
    }

    // --- Task 3: Continents ---
    public static void task3() {
        System.out.println("\n--- Task 3: Continent Finder ---");
        System.out.print("Enter country: ");
        String country = scanner.next().toLowerCase();

        Continent continent = switch (country) {
            case "ukraine", "france" -> Continent.EUROPE;
            case "china", "japan" -> Continent.ASIA;
            case "egypt" -> Continent.AFRICA;
            case "usa", "canada" -> Continent.NORTH_AMERICA;
            default -> null;
        };

        System.out.println(continent != null ? "Continent: " + continent : "Not found.");
    }

    // --- Task 4: Product Logic ---
    public static void task4() {
        System.out.println("\n--- Task 4: Products ---");
        Product[] products = new Product[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Product #" + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            double price = getDouble("Price: ");
            int qty = getInt("Quantity: ");
            products[i] = new Product(name, price, qty);
        }

        Product exp = products[0];
        Product highQty = products[0];

        for (Product p : products) {
            if (p.price > exp.price) exp = p;
            if (p.quantity > highQty.quantity) highQty = p;
        }

        System.out.println("\nResults:");
        System.out.println("Most expensive: " + exp.name + " (Qty: " + exp.quantity + ")");
        System.out.println("Max quantity: " + highQty.name);
    }

    // --- Helpers ---
    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Enter a whole number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Enter a decimal: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}