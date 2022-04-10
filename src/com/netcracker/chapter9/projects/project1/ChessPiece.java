package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class ChessPiece {

    private String coordinates;
    private int coordinateX;
    private int coordinateY;

    public void setPosition(String coordinates){
        this.coordinates=coordinates;
        coordinateX = stringToIntCoordinateX(coordinates);
        coordinateY = stringToIntCoordinateY(coordinates);
    }

    public String getCoordinates() {
        return coordinates;
    }

    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        return moves;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public int stringToIntCoordinateY(String coordinates){
        return Integer.parseInt(coordinates.substring(1));
    }

    public int stringToIntCoordinateX(String coordinates){
        int result = 0;
        switch (coordinates.substring(0,1)){
            case "a":
                result = 1;
                break;
            case "b":
                result = 2;
                break;
            case "c":
                result = 3;
                break;
            case "d":
                result = 4;
                break;
            case "e":
                result = 5;
                break;
            case "f":
                result = 6;
                break;
            case "g":
                result = 7;
                break;
            case "h":
                result = 8;
                break;
            default:
                result = 0;
        }
        return result;
    }

    public String intToStringCoordinateX(int coordinateX){
        String result = "a";
        switch (coordinateX){
            case 1:
                result = "a";
                break;
            case 2:
                result = "b";
                break;
            case 3:
                result = "c";
                break;
            case 4:
                result = "d";
                break;
            case 5:
                result = "e";
                break;
            case 6:
                result = "f";
                break;
            case 7:
                result = "g";
                break;
            case 8:
                result = "h";
                break;
            default:
                result = "a";
        }
        return result;
    }
}
