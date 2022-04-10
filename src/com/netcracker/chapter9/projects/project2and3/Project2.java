package com.netcracker.chapter9.projects.project2and3;

public class Project2 {
    public static void main(String[] args) {

        System.out.println("Local time:");

        Clock clock = new Clock();
        System.out.println(clock.getHours());
        System.out.println(clock.getMinutes());
        System.out.println(clock.getTime());

        System.out.println("Time in a different time zone:");

        WorldClock worldClock = new WorldClock(5);
        System.out.println(worldClock.getHours());
        System.out.println(worldClock.getMinutes());
        System.out.println(worldClock.getTime());

        System.out.println("Time in a different time zone:");

        WorldClock worldClock2 = new WorldClock(-17);
        System.out.println(worldClock2.getHours());
        System.out.println(worldClock2.getMinutes());
        System.out.println(worldClock2.getTime());

        System.out.println("Local time with alarm:");

        Clock clock1 = new Clock();
        clock1.setAlarm(17,9);
        System.out.println(clock1.getHours());
        System.out.println(clock1.getMinutes());
        System.out.println(clock1.getTime());

        System.out.println("Time in a different time zone with alarm:");

        WorldClock worldClock3 = new WorldClock(5);
        worldClock3.setAlarm(22,21);
        System.out.println(worldClock3.getHours());
        System.out.println(worldClock3.getMinutes());
        System.out.println(worldClock3.getTime());
    }
}
