package com.netcracker.chapter9.workedexample1;

public class Manager extends SalariedEmployee{

    private double weeklyBonus;

    public Manager(String name, double annualSalary, double bonus) {
        super(name, annualSalary);
        this.weeklyBonus = bonus;
    }

    public double weeklyPay(int hoursWorked){
        return super.weeklyPay(hoursWorked) + weeklyBonus;
    }
}
