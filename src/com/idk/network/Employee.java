package com.idk.network;

public class Employee {
    private String name;
    private double rate;
    private int hours;

    private static double totalSum = 0;

    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public String getName() { return name; }
    public double getRate() { return rate; }
    public int getHours() { return hours; }

    public void setName(String name) { this.name = name; }
    public void setRate(double rate) { this.rate = rate; }
    public void setHours(int hours) { this.hours = hours; }

    public double getSalary() { return rate * hours; }
    public double getBonuses() { return getSalary() * 0.10; }

    @Override
    public String toString() {
        return String.format(
            "Employee: %s\n  Rate: %.2f USD/hour\n  Hours: %d\n  Salary: %.2f USD\n  Bonus: %.2f USD",
            name, rate, hours, getSalary(), getBonuses()
        );
    }

    public static double getTotalSum() {
        return totalSum;
    }
}
