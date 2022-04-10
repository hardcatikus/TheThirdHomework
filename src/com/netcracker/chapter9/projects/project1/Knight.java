package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class Knight extends ChessPiece{

    public Knight(){
    }

    @Override
    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        moves.add(intToStringCoordinateX(getCoordinateX()+2)
                + (getCoordinateY()+1));
        moves.add(intToStringCoordinateX(getCoordinateX()+1)
                + (getCoordinateY()+2));
        moves.add(intToStringCoordinateX(getCoordinateX()+2)
                + (getCoordinateY()-1));
        moves.add(intToStringCoordinateX(getCoordinateX()+1)
                + (getCoordinateY()-2));
        moves.add(intToStringCoordinateX(getCoordinateX()-2)
                + (getCoordinateY()+1));
        moves.add(intToStringCoordinateX(getCoordinateX()-1)
                + (getCoordinateY()+2));
        moves.add(intToStringCoordinateX(getCoordinateX()-2)
                + (getCoordinateY()-1));
        moves.add(intToStringCoordinateX(getCoordinateX()-1)
                + (getCoordinateY()-2));
        return moves;
    }

}
