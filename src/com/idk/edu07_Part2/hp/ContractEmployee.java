package com.idk.edu07_Part2.hp;

import java.util.Objects;

public class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    public String getFederalTaxIdMember() { return federalTaxIdMember; }
    public void setFederalTaxIdMember(String taxId) { this.federalTaxIdMember = taxId; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        if (!(o instanceof ContractEmployee that)) return false;
        return Double.compare(that.hourlyRate, hourlyRate) == 0 && hoursWorked == that.hoursWorked && Objects.equals(federalTaxIdMember, that.federalTaxIdMember);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), federalTaxIdMember, hourlyRate, hoursWorked); }
}