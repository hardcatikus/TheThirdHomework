package com.netcracker.chapter8.project1;

public class Project1 {
    public static void main(String[] args) {

        System.out.println("=========Default Lock=========");

        ComboLock comboLock = new ComboLock();
        System.out.println(comboLock);
        System.out.println(comboLock.open());

        System.out.println("=========Custom Lock=========");

        ComboLock comboLockWithCombo = new ComboLock(19,8,24);
        System.out.println(comboLockWithCombo);

        System.out.println("*****First attempt*****");
        System.out.println(comboLockWithCombo.open());

        System.out.println("*****Second attempt*****");
        comboLockWithCombo.turnLeft(12); //->reset
        comboLockWithCombo.turnRight(1);
        comboLockWithCombo.turnRight(2);
        comboLockWithCombo.turnLeft(8);
        comboLockWithCombo.turnLeft(3);
        comboLockWithCombo.turnRight(34);
        comboLockWithCombo.turnLeft(9); //->reset
        System.out.println(comboLockWithCombo.open());

        System.out.println("*****Third attempt*****");
        comboLockWithCombo.turnRight(19);
        comboLockWithCombo.turnLeft(51); // 19+40-8
        comboLockWithCombo.turnRight(16); //24-8
        System.out.println(comboLockWithCombo.open());
    }
}
