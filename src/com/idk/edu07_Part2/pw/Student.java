package com.idk.edu07_Part2.pw;

public class Student extends Person {
    public static final String TYPE_PERSON = "STUDENT";

    public Student(String name) {
        super(name);
        System.out.println("Constructor: Created a " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }
}

