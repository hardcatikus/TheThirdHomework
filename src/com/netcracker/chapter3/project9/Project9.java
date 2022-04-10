package com.netcracker.chapter3.project9;

public class Project9 {
    public static void main(String[] args) {

        Battery battery = new Battery(2000);

        battery.drain(500);
        battery.drain(1100);

        System.out.println(battery);

        battery.charge();

        System.out.println(battery);

    }
}
