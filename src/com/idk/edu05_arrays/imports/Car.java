package com.idk.edu05_arrays.imports;


public class Car {
    public String type;
    public int year;
    public double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return String.format("Type: %-10s | Year: %d | Engine: %.1fL", type, year, engineCapacity);
    }
}