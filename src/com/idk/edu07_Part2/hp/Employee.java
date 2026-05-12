package com.idk.edu07_Part2.hp;

import java.util.Objects;

public abstract class Employee implements Payment {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() { return Objects.hash(employeeId, name); }

    @Override
    public String toString() {
        return "Employee{id='" + employeeId + "', name='" + name + "', avgMonthlySalary=" + calculatePay() + "}";
    }
}