package com.idk.edu07_Part2.hp;

public class Motorcycle extends GroundVehicle {
    private int maxSpeed;

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override public void drive() { System.out.println("Motorcycle driving at " + maxSpeed + " km/h."); }

    @Override
    public String toString() {
        return "Motorcycle{passengers=" + getPassengers() + ", maxSpeed=" + maxSpeed + "}";
    }
}