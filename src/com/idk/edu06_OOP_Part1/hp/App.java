package com.idk.edu06_OOP_Part1.hp;

import java.util.Objects;

/**
 * Main application class to demonstrate inheritance and polymorphism.
 */
public class App {
    public static void main(String[] args) {
        // Fix for "unused parameter" warning
        if (args.length > 0) System.out.println("Args: " + args.length);

        // Task 1: Birds demonstration
        System.out.println("=== TASK 1: BIRDS ===");
        Bird[] birds = { new Eagle(), new Swallow(), new Penguin(), new Kiwi() };
        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": " + bird);
            bird.fly();
        }

        // Task 2: Employees demonstration
        System.out.println("\n=== TASK 2: EMPLOYEES ===");
        Employee emp = new Employee("Ivan", 45, 25000.0);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}

// --- TASK 1: BIRD HIERARCHY ---

abstract class Bird {
    private String feathers;
    private String layEggs;

    // No-parameter constructor
    public Bird() {
        this.feathers = "unknown";
        this.layEggs = "unknown";
    }

    // Constructor with parameters
    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    // Getters and Setters
    public String getFeathers() { return feathers; }
    public void setFeathers(String feathers) { this.feathers = feathers; }
    public String getLayEggs() { return layEggs; }
    public void setLayEggs(String layEggs) { this.layEggs = layEggs; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(feathers, bird.feathers) && Objects.equals(layEggs, bird.layEggs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Bird{feathers='" + feathers + "', layEggs='" + layEggs + "'}";
    }
}

abstract class FlyingBird extends Bird {
    public FlyingBird() { super(); }
    public FlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Status: Can fly"); }
}

abstract class NonFlyingBird extends Bird {
    public NonFlyingBird() { super(); }
    public NonFlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Status: Cannot fly"); }
}

class Eagle extends FlyingBird {
    public Eagle() { super("Brown", "2-4 eggs"); }
}

class Swallow extends FlyingBird {
    public Swallow() { super("Black/White", "4-6 eggs"); }
}

class Penguin extends NonFlyingBird {
    public Penguin() { super("Dense/Waterproof", "1-2 eggs"); }
}

class Kiwi extends NonFlyingBird {
    public Kiwi() { super("Hair-like", "1 egg"); }
}

// --- TASK 2: EMPLOYEE & DEVELOPER ---

class Employee {
    private String name;
    private int age;
    private double salary;

    // No-parameter constructor
    public Employee() {}

    // Constructor with parameters
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4%.2f", name, age, salary);
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

class Developer extends Employee {
    private String position;

    // No-parameter constructor
    public Developer() { super(); }

    // Constructor with parameters
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report() + ", Position: " + position;
    }

    // Getters and Setters
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Developer)) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(position, developer.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), position);
    }

    @Override
    public String toString() {
        return super.toString() + " Developer{position='" + position + "'}";
    }
}