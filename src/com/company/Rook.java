package com.company;

public class Rook extends AbstractPiece{
    Rook (boolean color, String type, int indexBoard, boolean enableForCastling) {
        this.white = color;
        this.type = type;
        this.indexBoard = indexBoard;
        this.enableForCastling = enableForCastling;
    }
    public boolean moveTo(int indexToMove){return true;
    }
    public boolean whiteCh(){return true;}
    public boolean blackCh(){return true;}
}
