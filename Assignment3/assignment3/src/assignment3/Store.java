package assignment3;

import Utility.Candy;
import Utility.Juice;
import Utility.Ribbon;
import Utility.Country;
import java.util.Scanner;

public class Store {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        String name;
        String country;
        String product;
        String color;
        String flavor;
        String type;
        double distance;
        double length;
        double weight;
        double volume;
        String input;
        double totalInvoice;

        System.out.println("What is your name?");
        name = scanner.next();
        System.out.println("Choose your Country: CANADA / USA");
        country = scanner.next();
        country = country.toUpperCase();
        Country selectedCountry = Country.valueOf(country);

        do {
            System.out.println("Choose a product: RIBBON / CANDY / JUICE");
            product = scanner.next();
            product = product.toUpperCase();
            switch (product) {
                case "RIBBON":
                    System.out.println("Choose a color: YELLOW / RED / BLUE / PURPLE / GREEN");
                    color = scanner.next();
                    color = color.toUpperCase();
                    Ribbon r = Ribbon.valueOf(color);
                    System.out.println("What length do you need?");
                    length = scanner.nextDouble();
                    length = Converter.convertLength(length, selectedCountry);
                    order.processRibbonOrder(r, length, selectedCountry);
                    break;

                case "CANDY":
                    System.out.println("Choose a flavor: LEMON / STRAWBERRY / RASPBERRY");
                    flavor = scanner.next();
                    flavor = flavor.toUpperCase();
                    Candy c = Candy.valueOf(flavor);
                    System.out.println("How much weight do you need?");
                    weight = scanner.nextDouble();
                    order.processCandyOrder(c, weight, selectedCountry);
                    break;

                case "JUICE":
                    System.out.println("Choose type: ORANGE / APPLE / GRAPE / MANGO");
                    type = scanner.next();
                    type = type.toUpperCase();
                    Juice j = Juice.valueOf(type);
                    System.out.println("How much volume do you need?");
                    volume = scanner.nextDouble();
                    order.processJuiceOrder(j, volume, selectedCountry);
                    break;
            }
            totalInvoice = order.totalOrder();
            System.out.println("would you like to purchase more products? y/n");
            input = scanner.next();
            input = input.toUpperCase();

        } while (!input.equals("N"));
        System.out.println("How far do you live?");
        distance = scanner.nextDouble();
        totalInvoice += order.deliveryCharge(distance, selectedCountry);
        totalInvoice = Converter.convertCurrency(totalInvoice, selectedCountry);
        totalInvoice = Math.round(totalInvoice * 100.0) / 100.0;
        System.out.println(name + ", your total bill is: " + totalInvoice + " dollars");

    }

}
