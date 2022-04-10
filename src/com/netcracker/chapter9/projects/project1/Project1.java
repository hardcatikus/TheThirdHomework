package com.netcracker.chapter9.projects.project1;

public class Project1 {
    public static void main(String[] args) {

        //Pawn
        Pawn pawn = new Pawn();
        pawn.setPosition("d4");
        System.out.println("Pawn's moves(" + pawn.canMoveTo().size() + "): " + pawn.canMoveTo());

        //Bishop
        Bishop bishop = new Bishop();
        bishop.setPosition("d4");
        System.out.println("Bishop's moves(" + bishop.canMoveTo().size() + "): " + bishop.canMoveTo());

        //Rook
        Rook rook = new Rook();
        rook.setPosition("d4");
        System.out.println("Rook's moves(" + rook.canMoveTo().size() + "): " + rook.canMoveTo());

        //Queen
        Queen queen = new Queen();
        queen.setPosition("d4");
        System.out.println("Queen's moves(" + queen.canMoveTo().size() + "): " + queen.canMoveTo());

        //King
        King king = new King();
        king.setPosition("d4");
        System.out.println("King's moves(" + king.canMoveTo().size() + "): " + king.canMoveTo());

        //Knight
        Knight knight = new Knight();
        knight.setPosition("d4");
        System.out.println("Knight's moves(" + knight.canMoveTo().size() + "): " + knight.canMoveTo());
    }
}
