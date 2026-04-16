package com.idk.edu07_Part2.hp;

import java.util.Objects;

public abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() { return passengers; }
    public void setPassengers(int passengers) { this.passengers = passengers; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passengers that)) return false;
        return passengers == that.passengers;
    }

    @Override
    public int hashCode() { return Objects.hash(passengers); }
}