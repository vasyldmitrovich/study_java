package com.idk.edu07_Part2.hp;

public class Car extends GroundVehicle {
    private String model;

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    @Override public void drive() { System.out.println("Driving car: " + model); }

    @Override
    public String toString() {
        return "Car{passengers=" + getPassengers() + ", model='" + model + "'}";
    }
}