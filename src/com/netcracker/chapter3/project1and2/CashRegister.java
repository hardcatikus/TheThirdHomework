package com.netcracker.chapter3.project1and2;

public class CashRegister {

    private double taxRate;
    private double purchase;
    private double payment;
    private int count;

    private static double salesTax;

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    public void recordPurchase(double amount){
        purchase += amount;
        ++count;
    }

    public void recordTaxablePurchase(double amount){
        recordPurchase(amount * (taxRate + 1));
        salesTax += amount * taxRate;
    }

    public void receivePayment(double amount){
        payment += amount;
    }

    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        count = 0;
        return change;
    }

    public int getItemCount(){
        return count;
    }

    public double getPurchase() {
        return purchase;
    }

    public double getPayment() {
        return payment;
    }

    @Override
    public String toString(){
        return "Количество товаров: " + getItemCount()
                + ", Стоимость товаров: " + getPurchase()
                + ", Получено: " + getPayment()
                + ", Сдача: " + giveChange();
    }

    public static double getTotalTax(){
        return salesTax;
    }
}
