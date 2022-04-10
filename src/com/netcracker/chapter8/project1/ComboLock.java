package com.netcracker.chapter8.project1;

import java.util.Arrays;

public class ComboLock {

    private int[] combination;
    private int dialPosition = 0;
    private int[] inputCombination = new int[]{0, 0, 0};
    private int turnCount = 1;

    public ComboLock() {
        combination = new int[]{0, 0, 0};
    }

    public ComboLock(int secret1, int secret2, int secret3){
        if(secret1 > 39 || secret1 < 0 || secret2 > 39
                || secret2 < 0 || secret3 > 39 || secret3 < 0){
            System.out.println("Incorrect input!");
        }
        else {
            combination = new int[]{secret1,secret2,secret3};
        }
    }

    public void reset(){
        dialPosition = 0;
        Arrays.fill(inputCombination,0);
        turnCount = 1;
    }

    public void turnLeft(int ticks){
        dialPosition = Math.abs(Math.floorMod(dialPosition-ticks,40));
        switch (turnCount) {
            case 2:
                inputCombination[1] = dialPosition;
                turnCount++;
                break;
            case 3:
                inputCombination[1] = dialPosition;
                break;
            default:
                reset();
                System.out.println("Reset!");
        }
    }

    public void turnRight(int ticks){
        dialPosition = Math.abs(Math.floorMod(dialPosition+ticks,40));
        switch (turnCount){
            case 1:
                inputCombination[0] = dialPosition;
                turnCount++;
                break;
            case 2:
                inputCombination[0] = dialPosition;
                break;
            case 3:
                inputCombination[2] = dialPosition;
                turnCount++;
                break;
            default:
                inputCombination[2] = dialPosition;
        }
    }

    public boolean open(){
        System.out.println("Your input " + Arrays.toString(inputCombination));
        boolean result = combination[0] == inputCombination[0]
                && combination[1] == inputCombination[1]
                && combination[2] == inputCombination[2];
        reset();
        return result;
    }

    @Override
    public String toString(){
        return "Lock combination: " + Arrays.toString(combination);
    }
}
