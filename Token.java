package edu.kit.informatik;

public class Token {

    private boolean isBlack;
    private boolean isSquare;
    private boolean isSmall;
    private boolean isHallow;
    private int number;


    public Token(boolean isBlack, boolean isSquare, boolean isSmall, boolean isHallow, int number) {
        this.isBlack = isBlack;
        this.isSquare = isSquare;
        this.isSmall = isSmall;
        this.isHallow = isHallow;
        this.number = number;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public boolean isSmall() {
        return isSmall;
    }

    public boolean isHallow() {
        return isHallow;
    }

    public int getNumber() {
        return number;
    }

}