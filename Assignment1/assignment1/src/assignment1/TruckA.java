
package assignment1;


public class TruckA {

    private int x1;
    private int y1;

    public TruckA() {
        x1 = 0;
        y1 = 0;
    }

    public int truckAdistance(int x, int y) {
        return Math.abs(x - x1) + Math.abs(y - y1);

    }

    public void updatePosition(int x, int y) {
        x1 = x;
        y1 = y;

    }    
    


}
