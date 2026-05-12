package com.idk.edu07_Part2.pw;
import java.util.Objects;


public class Cat implements Animal {
    private String name;

    public Cat(String name)  { this.name = name;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override public void voice() {System.out.println(name + " says: Meow!"); }
    @Override public void feed() {System.out.println(name + " eats fish."); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Objects.equals(name, cat.name);
    }

    @Override public int hashCode() { return Objects.hash(name);}
    @Override public String toString() { return "Cat{name='" + name + "'}";}
}
