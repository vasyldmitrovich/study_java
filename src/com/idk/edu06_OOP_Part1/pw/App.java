package com.idk.edu06_OOP_Part1.pw;

import com.idk.edu06_OOP_Part1.imports.*; // Імпорт для Завдання 3*

public class App {

    public static void main(String[] args) {
        // Використання args для усунення варнінгу
        if (args.length > 0) System.out.println("Аргументи: " + args.length);

        // --- Завдання 2: Автомобілі ---
        System.out.println("--- Cars ---");
        Car[] cars = {
                new Truck("Volvo FH", 120, 2022),
                new Sedan("BMW M5", 250, 2023)
        };
        for (Car c : cars) {
            c.printInfo();
            c.run();
            c.stop();
        }

        // --- Завдання 3*: Геометрія ---
        System.out.println("\n--- Geometry ---");
        Line[] lines = {
                new Line(new Point(0, 0), new Point(5, 5)),
                new ColorLine(new Point(1, 1), new Point(10, 10), "Blue")
        };
        for (Line l : lines) {
            l.print(); // Виклик методу print()
        }
    }
}

// Абстрактний клас Car
abstract class Car {
    // Поля моделі
    public String model;
    public int maxSpeed;
    public int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run(); // Абстрактні методи
    public abstract void stop();

    public void printInfo() {
        System.out.println(model + " (" + yearOfProduction + ") Max Speed: " + maxSpeed);
    }
}

class Truck extends Car {
    public Truck(String m, int s, int y) { super(m, s, y); }
    @Override public void run() { System.out.println(model + " is hauling cargo..."); }
    @Override public void stop() { System.out.println(model + " truck stopped."); }
}

class Sedan extends Car {
    public Sedan(String m, int s, int y) { super(m, s, y); }
    @Override public void run() { System.out.println(model + " is cruising..."); }
    @Override public void stop() { System.out.println(model + " sedan stopped."); }
}