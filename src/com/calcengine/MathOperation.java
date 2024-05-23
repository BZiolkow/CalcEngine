package com.calcengine;

public enum MathOperation {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    private char symbol;
    MathOperation(char symbol) {
        this.symbol = symbol;
    }
    public char getSymbol() {
        return symbol;
    }

}
