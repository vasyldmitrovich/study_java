package com.idk.edu10.pw;

import java.time.LocalDate;

public class Employee {
    private final int id;
    private String name;
    private String position;
    private double salary;
    private final LocalDate dateOfBirth;

    public Employee(int id, String name, String position, double salary, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', position='" + position
                + "', salary=" + salary + ", dateOfBirth=" + dateOfBirth + '}';
    }
}
