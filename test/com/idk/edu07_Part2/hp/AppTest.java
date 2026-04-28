package com.idk.edu07_Part2.hp;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {

    @Test
    public void testCarCreation() {
        Car car = new Car(5, "Audi");
        Assert.assertEquals(5, car.getPassengers());
    }

    @Test
    public void testPlaneDistance() {
        Plane plane = new Plane(150, 5000);
        Assert.assertEquals(5000, plane.getMaxDistance());
    }

    @Test
    public void testLinerFloors() {
        Liner liner = new Liner(2000, 12);
        Assert.assertEquals(12, liner.getFloors());
    }

    @Test
    public void testHelicopterInheritance() {
        Helicopter heli = new Helicopter(4, 3000, 4000);
        Assert.assertTrue(heli instanceof FlyingVehicle);
    }

    @Test
    public void testVehicleInterface() {
        Motorcycle moto = new Motorcycle(2, 280);
        Assert.assertTrue(moto instanceof Vehicle);
    }
}