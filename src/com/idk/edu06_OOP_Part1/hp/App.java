package com.idk.edu06_OOP_Part1.hp;

public class App {
    public static void main(String[] args) {
        // Використовуємо args, щоб прибрати попередження
        if (args.length > 0) System.out.println("Кількість аргументів: " + args.length);

        // Завдання 1: Птахи
        System.out.println("=== TASK 1: BIRDS ===");
        Bird[] birds = { new Eagle(), new Swallow(), new Penguin(), new Kiwi() };
        for (Bird bird : birds) {
            System.out.println(bird.getClass().getSimpleName() + ": " + bird);
            bird.fly();
        }

        // Завдання 2: Співробітники
        System.out.println("\n=== TASK 2: EMPLOYEES ===");
        Employee emp = new Employee("Ivan", 45, 25000.0);
        Developer dev = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println(emp.report());
        System.out.println(dev.report());
    }
}

// --- Класи Птахів ---
abstract class Bird {
    protected final String feathers; // Додано final
    protected final String layEggs;   // Додано final

    public Bird(String feathers, String layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Пір'я: " + feathers + ", Яйця: " + layEggs;
    }
}

abstract class FlyingBird extends Bird {
    public FlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Статус: Літає"); }
}

abstract class NonFlyingBird extends Bird {
    public NonFlyingBird(String f, String e) { super(f, e); }
    @Override public void fly() { System.out.println("Статус: Не літає"); }
}

class Eagle extends FlyingBird { public Eagle() { super("Коричневе", "2-4"); } }
class Swallow extends FlyingBird { public Swallow() { super("Чорне", "4-6"); } }
class Penguin extends NonFlyingBird { public Penguin() { super("Густе", "1-2"); } }
class Kiwi extends NonFlyingBird { public Kiwi() { super("Шерсть", "1"); } }

// --- Класи Співробітників ---
class Employee {
    private final String name;   // Додано final
    private final int age;       // Додано final
    private final double salary; // Додано final

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: ₴%.2f", name, age, salary);
    }
}

class Developer extends Employee {
    private final String position; // Додано final

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report() + ", Position: " + position;
    }
}