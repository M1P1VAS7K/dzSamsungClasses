package com.company;

import java.util.Locale;
import java.util.Scanner;

public abstract class AbstractPiece {
    protected boolean white;
    protected String type;
    protected int indexBoard;
    protected boolean statusTooMove;
    protected boolean enableForCastling;

    public abstract boolean moveTo(int indexToMove);

    public int getIndexBoard() {return indexBoard;}

    public String getTypePiece() {return type;}

    public boolean getColor() {return white;}

    public abstract boolean whiteCh();

    public abstract boolean blackCh();

    public String paint() {return"a";
    }
}
