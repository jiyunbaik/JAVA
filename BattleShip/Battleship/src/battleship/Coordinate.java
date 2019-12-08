package battleship;

public class Coordinate {

    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAdjacent(Coordinate coordinate){
        return (Math.abs(this.x - coordinate.getX()) <= 1) && (Math.abs(this.y - coordinate.getY()) <= 1);
    }
    
    
        
}