package com.netcracker.chapter9.projects.project1;

import java.util.ArrayList;

public class Bishop extends ChessPiece{

    public Bishop() {}

    @Override
    public ArrayList<String> canMoveTo(){
        ArrayList<String> moves = new ArrayList<>();
        final int rightXMovesFinal = 8 - getCoordinateY();
        final int rightYMovesFinal = 8 - getCoordinateX();
        final int leftXMovesFinal = getCoordinateY() - 1;
        final int leftYMovesFinal = getCoordinateX() - 1;
        //right up diagonal moves
        int rightXMoves = rightXMovesFinal;
        int rightYMoves = rightYMovesFinal;
        while (rightXMoves > 0 && rightYMoves > 0){
            moves.add(intToStringCoordinateX(getCoordinateX() + rightXMoves)
                    + (getCoordinateY()+rightYMoves));
            rightXMoves--;
            rightYMoves--;
        }
        //right down diagonal moves
        rightXMoves = rightXMovesFinal;
        int leftYMoves = leftYMovesFinal;
        while (rightXMoves > 0 && leftYMoves > 0){
            moves.add(intToStringCoordinateX(getCoordinateY() + rightXMovesFinal - rightXMoves + 1)
                    + (leftYMoves));
            rightXMoves--;
            leftYMoves--;
        }
        //left up diagonal moves
        int leftXMoves = leftXMovesFinal;
        rightYMoves = rightYMovesFinal;
        while (leftXMoves > 0 && rightYMoves > 0){
            moves.add(intToStringCoordinateX(leftXMoves)
                    + (getCoordinateY()+ rightYMovesFinal - rightYMoves + 1));
            leftXMoves--;
            rightYMoves--;
        }
        //left down diagonal moves
        leftXMoves = leftXMovesFinal;
        leftYMoves = leftYMovesFinal;
        while (leftXMoves > 0 && leftYMoves > 0){
            moves.add(intToStringCoordinateX(leftXMoves)
                    + (leftYMoves));
            leftXMoves--;
            leftYMoves--;
        }
        return moves;
    }
}
