package com.idk.edu07_Part2.hp;



import java.util.Objects;

public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public void setSocialSecurityNumber(String ssn) { this.socialSecurityNumber = ssn; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;
        if (!(o instanceof SalariedEmployee that)) return false;
        return Double.compare(that.fixedMonthlyPayment, fixedMonthlyPayment) == 0 && Objects.equals(socialSecurityNumber, that.socialSecurityNumber);
    }

    @Override
    public int hashCode() { return Objects.hash(super.hashCode(), socialSecurityNumber, fixedMonthlyPayment); }
}