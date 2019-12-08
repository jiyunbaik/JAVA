
package assignment1;

import java.util.Scanner;

public class Dispatch {

    TruckA truckA = new TruckA();
    TruckB truckB = new TruckB();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dispatch dispatch = new Dispatch();

        while (true) {

            System.out.println("Please enter x coordinate for destination");
            int x = scanner.nextInt();
            System.out.println("Please enter y coordinate for destination");
            int y = scanner.nextInt();

            dispatch.dispatch(x, y);

            System.out.println("Is there any more delivery to make today?(y/n)");
            if (!scanner.next().equals("y")) {
                break;
            }
        }
    }

    public void dispatch(int x, int y) {

        int truckAdis = truckA.truckAdistance(x, y);
        int truckBdis = truckB.truckBdistance(x, y);

        if (truckAdis <= truckBdis) {
            System.out.println("Sending Truck A for delivery");
            truckA.updatePosition(x, y);

        } else {
            System.out.println("Sending Truck B for delivery");
            truckB.updatePosition(x, y);

        }

    }

}
