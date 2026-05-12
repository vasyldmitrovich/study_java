package com.idk.edu07_Part2.hp;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passengers) { super(passengers); }
    public abstract void isSailing();
}