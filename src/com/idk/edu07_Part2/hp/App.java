package com.idk.edu07_Part2.hp;

import com.idk.edu07_Part2.pw.*;
import com.idk.edu07_Part2.hp.*;

public class App {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Murka"),
                new Dog("Sirko")
        };

        for (Animal a : animals) {
            a.voice();
            a.feed();
        }

        Person[] people = {
                new Teacher("Oleksandr Petrovych"),
                new Student("Andrii"),
                new Cleaner("Natalia")
        };

        for (Person p : people) {
            p.print();
            if (p instanceof Staff s) {
                s.salary();
            }
        }

        System.out.println("\n\n\n");

        Vehicle[] fleet = {
                new Liner(2500, 15),
                new Boat(6, 40),
                new Plane(180, 5500),
                new Helicopter(4, 3000, 4000),
                new Bus(50, "Route 101"),
                new Motorcycle(2, 280),
                new Car(5, "Audi RS6")
        };

        for (Vehicle v : fleet) {
            System.out.println(v.toString());

            if (v instanceof WaterVehicle water) {
                water.isSailing();
            } else if (v instanceof FlyingVehicle fly) {
                fly.fly();
                fly.land();
            } else if (v instanceof GroundVehicle ground) {
                ground.drive();
            }
            System.out.println();
        }
    }
}