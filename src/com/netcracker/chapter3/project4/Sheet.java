package com.netcracker.chapter3.project4;

public class Sheet {
    private int width;
    private int height;
    private String name;

    public Sheet() {
        width = 841;
        height = 1189;
        name = "A0";
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public void cutInHalf(){
        if(width > height) {
            int temp = width / 2;
            width = height;
            height = temp;
        }
        else {
            int temp = height / 2;
            height = width;
            width = temp;
        }
        name = "A" + String.valueOf(Integer.parseInt(name.substring(1)) + 1);
    }

    @Override
    public String toString(){
        return "Sheet " + name + " has dimensions "
                + width + "x" + height + " millimeters";
    }
}
