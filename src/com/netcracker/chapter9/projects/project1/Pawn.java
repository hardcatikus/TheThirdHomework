package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class Pawn extends ChessPiece{

    public Pawn() {}

    @Override
    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        if(8-getCoordinateY() >= 2){
            moves.add(intToStringCoordinateX(getCoordinateX()) + (getCoordinateY()+1));
            moves.add(intToStringCoordinateX(getCoordinateX()) + (getCoordinateY()+2));
        }
        else if (8-getCoordinateY() == 1){
            moves.add(intToStringCoordinateX(getCoordinateX()) + (getCoordinateY()+1));
        }
        return moves;
    }
}
