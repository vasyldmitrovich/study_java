package com.idk.network;

import java.time.Year;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
        this.birthYear = 0;
    }

    public int getAge() {
        if (birthYear == 0) return -1;
        return Year.now().getValue() - birthYear;
    }

    public void input(Scanner sc) {
        System.out.print("Enter first name: ");
        this.firstName = sc.next();
        System.out.print("Enter last name: ");
        this.lastName = sc.next();
        System.out.print("Enter birth year: ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Name: " + firstName + " " + lastName);
        if (birthYear != 0) {
            System.out.println("Birth Year: " + birthYear);
            System.out.println("Age: " + getAge());
        }
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) this.firstName = fn;
        if (ln != null && !ln.isEmpty()) this.lastName = ln;
    }
}
