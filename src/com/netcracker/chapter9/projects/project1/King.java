package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class King extends ChessPiece{

    public King() {
    }

    @Override
    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        moves.add(intToStringCoordinateX(getCoordinateX() + 1)
                    + (getCoordinateY()+1));
        moves.add(intToStringCoordinateX(getCoordinateY() + 1)
                    + (getCoordinateY()-1));
        moves.add(intToStringCoordinateX(getCoordinateX() - 1)
                    + (getCoordinateY() + 1));
        moves.add(intToStringCoordinateX(getCoordinateX() - 1)
                    + (getCoordinateY()-1));
        moves.add(intToStringCoordinateX(getCoordinateX()+1)
                    + getCoordinateY());
        moves.add(intToStringCoordinateX(getCoordinateX()-1)
                    + getCoordinateY());
        moves.add(intToStringCoordinateX(getCoordinateX())
                    + (getCoordinateY() + 1));
        moves.add(intToStringCoordinateX(getCoordinateX())
                    + (getCoordinateY() - 1));
        return moves;
    }
}
