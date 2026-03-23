package com.idk.edu05_arrays.imports;


public class Employee {
    public String name;
    public int departmentNumber;
    public double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %-10s | Dept: %d | Salary: %.2f", name, departmentNumber, salary);
    }
}