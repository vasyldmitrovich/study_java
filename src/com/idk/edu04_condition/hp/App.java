package com.idk.edu04_condition.hp;

import java.util.Scanner;
import com.idk.edu04_condition.imports.*;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        hw1(); hw2(); hw3(); hw4(); hw5();
        scanner.close();
    }

    // --- HW 1: Range Check [-5, 5] ---
    public static void hw1() {
        System.out.println("\n--- HW 1: Range Check ---");
        float f1 = getFloat("Num 1: ");
        float f2 = getFloat("Num 2: ");
        float f3 = getFloat("Num 3: ");

        boolean allInRange = (f1 >= -5 && f1 <= 5) && (f2 >= -5 && f2 <= 5) && (f3 >= -5 && f3 <= 5);
        
        if (allInRange) System.out.println("All numbers belong to the range [-5, 5]");
        else System.out.println("Not all numbers belong to the range [-5, 5]");
    }

    // --- HW 2: Max and Min ---
    public static void hw2() {
        System.out.println("\n--- HW 2: Max/Min ---");
        int a = getInt("Enter a: ");
        int b = getInt("Enter b: ");
        int c = getInt("Enter c: ");

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Max: " + max + ", Min: " + min);
    }

    // --- HW 3: HTTP Errors ---
    public static void hw3() {
        System.out.println("\n--- HW 3: HTTP Error Map ---");
        int code = getInt("Enter HTTP error code (e.g. 400, 404): ");
        HTTPError error = HTTPError.fromCode(code);
        
        if (error != null) System.out.println("Error Name: " + error);
        else System.out.println("Unknown error code.");
    }

    // --- HW 4: Faculty & Seasons ---
    public static void hw4() {
        System.out.println("\n--- HW 4: Faculty Info ---");
        int count = getInt("Number of students: ");
        System.out.print("Season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String sInput = scanner.next().toUpperCase();
        
        try {
            Faculty.Season season = Faculty.Season.valueOf(sInput);
            Faculty myFaculty = new Faculty(count, season);
            System.out.println("Faculty created: " + myFaculty.studentsCount + " students in " + myFaculty.currentSeason);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid season name.");
        }
    }

    // --- HW 5: Dogs ---
    public static void hw5() {
        System.out.println("\n--- HW 5: Dogs Logic ---");
        Dog[] dogs = new Dog[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Dog #" + (i+1));
            System.out.print("Name: "); String name = scanner.next();
            System.out.print("Breed (RETRIEVER, BULLDOG, etc): "); 
            Dog.Breed breed = Dog.Breed.valueOf(scanner.next().toUpperCase());
            int age = getInt("Age: ");
            dogs[i] = new Dog(name, breed, age);
        }

        // Check for duplicate names
        boolean hasDuplicate = dogs[0].name.equals(dogs[1].name) || 
                               dogs[1].name.equals(dogs[2].name) || 
                               dogs[0].name.equals(dogs[2].name);
        System.out.println(hasDuplicate ? "Found dogs with same name!" : "All names are unique.");

        // Find oldest
        Dog oldest = dogs[0];
        for (Dog d : dogs) if (d.age > oldest.age) oldest = d;
        System.out.println("Oldest dog: " + oldest.name + ", Breed: " + oldest.breed);
    }

    // --- Helpers ---
    public static int getInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) { scanner.next(); System.out.print("Error. Enter int: "); }
        return scanner.nextInt();
    }

    public static float getFloat(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextFloat()) { scanner.next(); System.out.print("Error. Enter float: "); }
        return scanner.nextFloat();
    }
}