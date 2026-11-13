package com.idk.edu10.pw;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    // Practical task 1: employeeMap <Integer, String>
    public static void task1() {
        System.out.println("\n--- TASK 1 ---");
        Map<Integer, String> employeeMap = EmployeeMapService.createEmployeeMap();
        EmployeeMapService.printMap(employeeMap);

        System.out.print("Enter ID: ");
        int id = readInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Name: " + EmployeeMapService.findNameById(employeeMap, id));
        } else {
            System.out.println("ID " + id + " not found.");
        }
//idk
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            System.out.println("ID: " + EmployeeMapService.findIdByName(employeeMap, name));
        } else {
            System.out.println("Name '" + name + "' not found.");
        }
    }

    // Practical task 2**: duplicates check, extra info, editing, sorting
    public static void task2() {
        System.out.println("\n--- TASK 2 ---");
        EmployeeRegistry registry = new EmployeeRegistry();

        System.out.print("How many employees to add? ");
        int count = readInt();
        for (int i = 0; i < count; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("  ID: ");
            int id = readInt();
            System.out.print("  Name: ");
            String name = scanner.nextLine().trim();
            System.out.print("  Position: ");
            String position = scanner.nextLine().trim();
            System.out.print("  Salary: ");
            double salary = readDouble();
            LocalDate birth = readDate("  Date of birth (yyyy-MM-dd): ");

            if (!registry.add(new Employee(id, name, position, salary, birth))) {
                System.out.println("Duplicate ID or name found. Adding stopped.");
                break;
            }
        }
        registry.print();

        System.out.print("\nEnter ID to edit (0 to skip): ");
        int editId = readInt();
        if (editId != 0) {
            if (registry.containsId(editId)) {
                System.out.print("  New name: ");
                String name = scanner.nextLine().trim();
                System.out.print("  New position: ");
                String position = scanner.nextLine().trim();
                System.out.print("  New salary: ");
                double salary = readDouble();
                registry.edit(editId, name, position, salary);
                registry.print();
            } else {
                System.out.println("ID " + editId + " not found.");
            }
        }

        System.out.print("\nSort by (id / name / position): ");
        String criterion = scanner.nextLine().trim();
        Map<Integer, Employee> sorted = registry.sortedBy(criterion);
        if (sorted == null) {
            System.out.println("Unknown criterion.");
        } else {
            sorted.values().forEach(System.out::println);
        }
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter an integer: ");
            }
        }
    }

    private static double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Enter a number: ");
            }
        }
    }

    private static LocalDate readDate(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return LocalDate.parse(scanner.nextLine().trim());
            } catch (DateTimeParseException e) {
                System.out.println("Wrong format.");
            }
        }
    }
}
