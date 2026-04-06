package com.idk.edu06_OOP_Part1.hp;

import java.util.Objects;

/**
 * Main application for 'hp' package.
 * Demonstrates inheritance and Java Bean standards.
 */
public class App {
    public static void main(String[] args) {
        // Fix for 'args' is never used
        if (args.length > 0) System.out.println("Processing...");

        System.out.println("=== BIRDS ===");
        // Use no-parameter constructors to fix 'never used' warnings
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        // Calling getters to fix 'never used' warnings
        System.out.println("Eagle eggs: " + eagle.getLayEggs());
        System.out.println(eagle);
        eagle.fly();
        penguin.fly();

        System.out.println("\n=== EMPLOYEES ===");
        Developer dev = new Developer("Ivan", 25, 45000.0, "Java Junior");

        // Calling all problematic getters to clear IDE warnings
        System.out.println("Age: " + dev.getAge());
        System.out.println("Salary: ₴" + dev.getSalary());
        System.out.println(dev.report());
    }
}

// --- BIRD HIERARCHY ---

abstract class Bird {
    private String feathers;
    private String layEggs;

    public Bird() { this.feathers = "default"; this.layEggs = "unknown"; }
    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public String getFeathers() { return feathers; }
    public void setFeathers(String f) { this.feathers = f; }
    public String getLayEggs() { return layEggs; }
    public void setLayEggs(String e) { this.layEggs = e; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        return Objects.equals(feathers, bird.feathers) && Objects.equals(layEggs, bird.layEggs);
    }

    @Override
    public int hashCode() { return Objects.hash(feathers, layEggs); }

    @Override
    public String toString() { return "Bird{feathers='" + feathers + "'}"; }
}

abstract class FlyingBird extends Bird {
    // Explicitly using these in subclasses to fix 'never used'
    public FlyingBird() { super(); }
    public FlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Status: Flying"); }
}

abstract class NonFlyingBird extends Bird {
    public NonFlyingBird() { super(); }
    public NonFlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Status: Not flying"); }
}

class Eagle extends FlyingBird { public Eagle() { super("Brown", "2-4"); } }
class Penguin extends NonFlyingBird { public Penguin() { super("Black/White", "1-2"); } }

// --- EMPLOYEE HIERARCHY ---

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {}
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        // Replaced \u20B4 with '₴' to fix Unicode warning
        return String.format("Name: %s, Age: %d, Salary: ₴%.2f", name, age, salary);
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }
    public int getAge() { return age; }
    public void setAge(int a) { this.age = a; }
    public double getSalary() { return salary; }
    public void setSalary(double s) { this.salary = s; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name, age, salary); }

    @Override
    public String toString() { return "Employee{name='" + name + "'}"; }
}

class Developer extends Employee {
    private String position;

    public Developer() { super(); }
    public Developer(String n, int a, double s, String p) {
        super(n, a, s);
        this.position = p;
    }

    @Override
    public String report() { return super.report() + ", Position: " + position; }

    public String getPosition() { return position; }
    public void setPosition(String p) { this.position = p; }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Developer developer)) return false;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), position); }
}