package com.idk.edu05_arrays.imports;

import java.util.Objects;

public class Car {
    public String type;
    public int year;
    public double engineCapacity;

    public Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    // Те, що попросив викладач:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, year, engineCapacity);
    }

    @Override
    public String toString() {
        return String.format("Type: %-10s | Year: %d | Engine: %.1fL", type, year, engineCapacity);
    }
}
