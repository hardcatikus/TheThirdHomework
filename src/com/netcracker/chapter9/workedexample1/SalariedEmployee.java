package com.netcracker.chapter9.workedexample1;

public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    public double weeklyPay(int hoursWorked){
        final int WEEKS_PER_YEAR = 52;
        return annualSalary / WEEKS_PER_YEAR;
    }
}
