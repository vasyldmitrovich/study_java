package com.idk.edu07_Part2.pw;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = "CLEANER";

    public Cleaner(String name) {
        super(name);
        System.out.println("Constructor: Created a " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Cleaner's monthly salary: 12000₴");
    }
}