package com.company;

public class Pawn extends AbstractPiece {

    Pawn(boolean color, String type, int indexBoard, boolean statusTooMove) {
        this.white = color;
        this.type = type;
        this.indexBoard = indexBoard;
        this.statusTooMove = statusTooMove;
    }

    public boolean moveTo(int indexToMove) {
        return true;
    }

    public boolean whiteCh() {
        return false;
    }

    public boolean blackCh() {
        return false;
    }
}
