package com.netcracker.chapter3.project9;

public class Battery {

    private double capacity;
    private double remainingCapacity;

    public Battery(double capacity){
        this.capacity = capacity;
        this.remainingCapacity = capacity;
    }

    public void drain(double amount){
        remainingCapacity -= amount;
    }

    public void charge(){
        remainingCapacity = capacity;
    }

    public double getRemainingCapacity(){
        return remainingCapacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString(){
        return "Battery's current charge is " + getRemainingCapacity()
                + " out of " + getCapacity() + " mAh";
    }
}
