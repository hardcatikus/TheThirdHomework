package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class Rook extends ChessPiece{

    public Rook() {}

    @Override
    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        for(int i=getCoordinateX(); i<8;i++){
            moves.add(intToStringCoordinateX(getCoordinateX()+i)
                    + getCoordinateY());
        }
        for(int i=getCoordinateX()-1; i>0;i--){
            moves.add(intToStringCoordinateX(i)
                    + getCoordinateY());
        }
        for(int i=getCoordinateY(); i<8;i++){
            moves.add(intToStringCoordinateX(getCoordinateX())
                    + (getCoordinateY() + i));
        }
        for(int i=getCoordinateY()-1; i>0;i--){
            moves.add(intToStringCoordinateX(getCoordinateX())
                    + i);
        }
        return moves;
    }
}
