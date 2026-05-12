package com.idk.edu07_Part2.hp;

public class Bus extends GroundVehicle {
    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    @Override public void drive() { System.out.println("Bus on route " + route); }

    @Override
    public String toString() {
        return "Bus{passengers=" + getPassengers() + ", route='" + route + "'}";
    }
}