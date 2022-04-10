package com.netcracker.chapter3.project1and2;

import java.util.Locale;

public class Project1 {

    public static void main(String[] args) {

        CashRegister register = new CashRegister(0.2);
        register.recordPurchase(29.50);
        register.recordTaxablePurchase(10);
        register.recordTaxablePurchase(5);
        register.receivePayment(50);

        System.out.println(register);
        System.out.print("Общий размер налогов: ");
        System.out.printf(Locale.US, "%.2f%n",CashRegister.getTotalTax());
    }

}
