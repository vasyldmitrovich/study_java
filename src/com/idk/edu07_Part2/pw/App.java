package com.idk.edu07_Part2.pw;

public class App {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: ANIMALS ===");
        // Створюємо масив інтерфейсу Animal
        Animal[] animals = {
                new Cat("Marsik"),
                new Dog("Dino")
        };

        for (Animal a : animals) {
            a.voice();
            a.feed();
            System.out.println(a.toString()); // Перевірка toString
        }

        System.out.println("\n=== TASK 2: PEOPLE ===");
        // Створюємо масив абстрактного класу Person
        Person[] people = {
                new Teacher("Олександр Петрович"),
                new Student("Андрій"),
                new Cleaner("Тітка Наташа")
        };

        for (Person p : people) {
            p.print();
            // Перевіряємо, чи є людина персоналом (Staff), щоб виплатити зарплату
            if (p instanceof Staff s) {
                s.salary();
            }
        }
    }
}