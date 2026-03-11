package com.idk.edu04_condition.imports;


public class Dog {
    public enum Breed { RETRIEVER, BULLDOG, SHEPHERD, PUG }

    public String name;
    public Breed breed;
    public int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
}