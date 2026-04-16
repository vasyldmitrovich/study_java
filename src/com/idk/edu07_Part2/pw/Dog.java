package com.idk.edu07_Part2.pw;

import java.util.Objects;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void voice() {
        System.out.println(name + " says: Woof Woof");
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() { return Objects.hash(name); }

    @Override
    public String toString() { return "Dog{name='" + name + "'}"; }
}