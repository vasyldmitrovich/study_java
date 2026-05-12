package com.idk.edu07_Part2.pw;

public class Teacher extends Staff {
    public static final String TYPE_PERSON = "TEACHER";

    public Teacher(String name) {
        super(name);
        System.out.println("Constructor: Created a " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("I am a " + TYPE_PERSON + ". My name is " + getName());
    }

    @Override
    public void salary() {
        System.out.println("Teacher's monthly salary: 25000₴");
    }
}