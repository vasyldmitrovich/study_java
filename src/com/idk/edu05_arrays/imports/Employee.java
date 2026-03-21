package com.idk.edu05_arrays.imports;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departmentNumber == employee.departmentNumber &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, departmentNumber, salary);
    }

    @Override
    public String toString() {
        return String.format("Name: %-10s | Dept: %d | Salary: %.2f", name, departmentNumber, salary);
    }
}
