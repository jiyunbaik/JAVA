
package assignment1;


public class TruckB {
    private int x2;
    private int y2;

    public TruckB() {
        x2 = 0;
        y2 = 0;
    }

    public int truckBdistance(int x, int y) {
        return Math.abs(x - x2) + Math.abs(y - y2);

    }

    public void updatePosition(int x, int y) {
        x2 = x;
        y2 = y;
    }
}
