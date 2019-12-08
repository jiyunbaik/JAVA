package assignment3;

import Utility.Candy;
import Utility.Country;
import Utility.Juice;
import Utility.Ribbon;

public class Order {

    Inventory inventory = new Inventory();
    private static double priceRibbon = 2;
    private static double priceCandy = 5;
    private static double priceJuice = 3;
    private static double priceDelivery = 1;
    public static double price = 0;
    public static double total = 0;

    public double deliveryCharge(double distance, Country country) {
        switch (country) {
            case CANADA:
                return distance * priceDelivery;

            case USA:
                return Converter.convertDistance(distance, country) * priceDelivery;
            default:
                return distance * priceDelivery;
        }
    }

    public double totalOrder() {
        return total += price;
    }

    public double processRibbonOrder(Ribbon ribbon, double length, Country country) {

        return finalizeRibbonSale(ribbon, inventory.checkRibbonInventory(ribbon, length, country), country);

    }

    public double processCandyOrder(Candy candy, double weight, Country country) {

        return finalizeCandySale(candy, inventory.checkCandyInventory(candy, weight, country), country);

    }

    public double processJuiceOrder(Juice juice, double volume, Country country) {

        return finalizeJuiceSale(juice, inventory.checkJuiceInventory(juice, volume, country), country);

    }

    public double finalizeRibbonSale(Ribbon ribbon, double length, Country country) {
        switch (ribbon) {
            case YELLOW:
                inventory.updateRibbonInventory(-length, 0, 0, 0, 0);
                return price = length * priceRibbon;
            case RED:
                inventory.updateRibbonInventory(0, -length, 0, 0, 0);
                return price = length * priceRibbon;
            case BLUE:
                inventory.updateRibbonInventory(0, 0, -length, 0, 0);
                return price = length * priceRibbon;
            case PURPLE:
                inventory.updateRibbonInventory(0, 0, 0, -length, 0);
                return price = length * priceRibbon;
            case GREEN:
                inventory.updateRibbonInventory(0, 0, 0, 0, -length);
                return price = length * priceRibbon;
            default:
                return 0;
        }
    }

    public double finalizeCandySale(Candy candy, double weight, Country country) {
        switch (candy) {
            case LEMON:
                inventory.updateCandyInventory(-weight, 0, 0);
                return price = weight * priceCandy;
            case STRAWBERRY:
                inventory.updateCandyInventory(0, -weight, 0);
                return price = weight * priceCandy;
            case RASPBERRY:
                inventory.updateCandyInventory(0, 0, -weight);
                return price = weight * priceCandy;
            default:
                return 0;
        }
    }

    public double finalizeJuiceSale(Juice juice, double volume, Country country) {
        switch (juice) {
            case ORANGE:
                inventory.updateJuiceInventory(-volume, 0, 0, 0);
                return price = volume * priceJuice;
            case APPLE:
                inventory.updateJuiceInventory(0, -volume, 0, 0);
                return price = volume * priceJuice;
            case GRAPE:
                inventory.updateJuiceInventory(0, 0, -volume, 0);
                return price = volume * priceJuice;
            case MANGO:
                inventory.updateJuiceInventory(0, 0, 0, -volume);
                return price = volume * priceJuice;
            default:
                return 0;
        }

    }
}
