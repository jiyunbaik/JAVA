
package Battleship;

public enum Cell {
    MISSED('X'), HIT('O'), NORMAL('?'), SHIP('?');
    
    private char symbol;

    private Cell(char symbol) {
        this.symbol=symbol;
    }
    
    public char getSymbol(){
        return symbol;
    }
}
