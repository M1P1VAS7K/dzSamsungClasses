package com.company;

public class Bishop extends AbstractPiece {
    Bishop(boolean color, String type, int indexBoard) {
        this.white = color;
        this.type = type;
        this.indexBoard = indexBoard;
    }

    public boolean moveTo(int indexToMove) {
        return false;
    }

    public boolean whiteCh() {
        return true;
    }

    public boolean blackCh() {
        return true;
    }
}
