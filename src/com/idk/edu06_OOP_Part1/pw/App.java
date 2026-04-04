package com.idk.edu06_OOP_Part1.pw;

import java.util.Objects;

/**
 * Main application for 'pw' package.
 * Demonstrates Car hierarchy.
 */
public class App {
    public static void main(String[] args) {
        Car truck = new Truck("Volvo", 2022, 110);
        truck.run();
        System.out.println(truck);
    }
}

abstract class Car {
    private String model;
    private int year; // Changed from yearOfProduction to match your test
    private int maxSpeed;

    public Car() {}
    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public abstract void run();

    public String getModel() { return model; }
    public void setModel(String m) { this.model = m; }
    public int getYear() { return year; }
    public void setYear(int y) { this.year = y; }
    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int s) { this.maxSpeed = s; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return year == car.year && maxSpeed == car.maxSpeed && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() { return Objects.hash(model, year, maxSpeed); }

    @Override
    public String toString() { return "Car{model='" + model + "', year=" + year + "}"; }
}

class Truck extends Car {
    public Truck() { super(); }
    public Truck(String m, int y, int s) { super(m, y, s); }
    @Override public void run() { System.out.println("Truck is moving"); }
}

class Sedan extends Car {
    public Sedan() { super(); }
    public Sedan(String m, int y, int s) { super(m, y, s); }
    @Override public void run() { System.out.println("Sedan is moving fast"); }
}