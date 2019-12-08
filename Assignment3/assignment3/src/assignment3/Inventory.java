package assignment3;

import Utility.Candy;
import Utility.Country;
import Utility.Juice;
import Utility.Ribbon;

public class Inventory {

    private static double invYellowRibbon = 20;
    private static double invRedRibbon = 20;
    private static double invBlueRibbon = 20;
    private static double invPurpleRibbon = 20;
    private static double invGreenRibbon = 20;
    private static double invLemonCandy = 10;
    private static double invStrawberryCandy = 10;
    private static double invRaspberryCandy = 10;
    private static double invOrangeJuice = 15;
    private static double invAppleJuice = 15;
    private static double invGrapeJuice = 15;
    private static double invMangoJuice = 15;

   
    public void updateRibbonInventory(double yellowRibbon, double redRibbon, double blueRibbon, double purpleRibbon, double greenRibbon) {
        invYellowRibbon += yellowRibbon;
        invRedRibbon += redRibbon;
        invBlueRibbon += blueRibbon;
        invPurpleRibbon += purpleRibbon;
        invGreenRibbon += greenRibbon;
    }

    public void updateCandyInventory(double lemonCandy, double strawberryCandy, double raspberryCandy) {
        invLemonCandy += lemonCandy;
        invStrawberryCandy += strawberryCandy;
        invRaspberryCandy += raspberryCandy;
    }

    public void updateJuiceInventory(double orangeJuice, double appleJuice, double grapeJuice, double mangoJuice) {
        invOrangeJuice += orangeJuice;
        invAppleJuice += appleJuice;
        invGrapeJuice += grapeJuice;
        invMangoJuice += mangoJuice;
    }

    public double checkRibbonInventory(Ribbon ribbon, double length, Country country) {
        switch (ribbon) {
            case YELLOW:
                if (length > invYellowRibbon) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invYellowRibbon + "meters of yellow ribbon left in stock for your order");
                            return length = invYellowRibbon;
                        case USA:
                            invYellowRibbon = Converter.convertToFeet(invYellowRibbon);
                            invYellowRibbon = Math.round(invYellowRibbon * 100.0) / 100.0;
                            System.out.println("We have only " + invYellowRibbon + "feet of yellow ribbon left in stock for your order");
                            invYellowRibbon = Converter.convertLength(invYellowRibbon, country);
                            return length = invYellowRibbon;
                    }
                }
            case RED:
                if (length > invRedRibbon) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invRedRibbon + "meters of red ribbon left in stock for your order");
                            return length = invRedRibbon;
                        case USA:
                            invRedRibbon = Converter.convertToFeet(invRedRibbon);
                            invRedRibbon = Math.round(invRedRibbon * 100.0) / 100.0;
                            System.out.println("We have only " + invRedRibbon + "feet of red ribbon left in stock for your order");
                            invRedRibbon = Converter.convertLength(invRedRibbon, country);
                            return length = invRedRibbon;

                    }
                }
            case BLUE:
                if (length > invBlueRibbon) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invBlueRibbon + "meters of blue ribbon left in stock for your order");
                            return length = invBlueRibbon;
                        case USA:
                            invBlueRibbon = Converter.convertToFeet(invBlueRibbon);
                            invBlueRibbon = Math.round(invBlueRibbon * 100.0) / 100.0;
                            System.out.println("We have only " + invBlueRibbon + "feet of blue ribbon left in stock for your order");
                            invBlueRibbon = Converter.convertLength(invBlueRibbon, country);
                            return length = invBlueRibbon;

                    }
                }
            case PURPLE:
                if (length > invPurpleRibbon) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invPurpleRibbon + "meters of purple ribbon left for your order");
                            return length = invPurpleRibbon;
                        case USA:
                            invPurpleRibbon = Converter.convertToFeet(invPurpleRibbon);
                            invPurpleRibbon = Math.round(invPurpleRibbon * 100.0) / 100.0;
                            System.out.println("We have only " + invPurpleRibbon + "feet of purple ribbon left for your order");
                            invPurpleRibbon = Converter.convertLength(invPurpleRibbon, country);
                            return length = invPurpleRibbon;
                    }
                }

            case GREEN:
                if (length > invGreenRibbon) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invGreenRibbon + "meters of green ribbon left in stock for your order");
                            return length = invGreenRibbon;
                        case USA:
                            invGreenRibbon = Converter.convertToFeet(invGreenRibbon);
                            invGreenRibbon = Math.round(invGreenRibbon * 100.0) / 100.0;
                            System.out.println("We have only " + invGreenRibbon + "feet of green ribbon left in stock for your order");
                            invGreenRibbon = Converter.convertLength(invGreenRibbon, country);
                            return length = invGreenRibbon;

                    }
                }

            default:
                return length;
        }
    }

    public double checkCandyInventory(Candy candy, double weight, Country country) {
        switch (candy) {
            case LEMON:
                if (weight > invLemonCandy) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invLemonCandy + "kgs of lemon candy left in stock for your order");
                            return weight = invLemonCandy;
                        case USA:
                            invLemonCandy = Converter.convertToPound(invLemonCandy);
                            invLemonCandy = Math.round(invLemonCandy * 100.0) / 100.0;
                            System.out.println("We have only " + invLemonCandy + "pounds of lemon candy left in stock for your order");
                            invLemonCandy = Converter.convertWeight(invLemonCandy, country);
                            return weight = invLemonCandy;

                    }

                }

            case STRAWBERRY:
                if (weight > invStrawberryCandy) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invStrawberryCandy + "kgs of strawberry candy left in stock for your order");
                            return weight = invStrawberryCandy;
                        case USA:
                            invStrawberryCandy = Converter.convertToPound(invStrawberryCandy);
                            invStrawberryCandy = Math.round(invStrawberryCandy * 100.0) / 100.0;
                            System.out.println("We have only " + invStrawberryCandy + "pounds of strawberry candy left in stock for your order");
                            invStrawberryCandy = Converter.convertWeight(invStrawberryCandy, country);
                            return weight = invStrawberryCandy;

                    }
                }

            case RASPBERRY:
                if (weight > invRaspberryCandy) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invRaspberryCandy + "kgs of raspberry candy left in stock for your order");
                            return weight = invStrawberryCandy;
                        case USA:
                            invRaspberryCandy = Converter.convertToPound(invRaspberryCandy);
                            invRaspberryCandy = Math.round(invRaspberryCandy * 100.0) / 100.0;
                            System.out.println("We have only " + invRaspberryCandy + "pounds of raspberry candy left in stock for your order");
                            invRaspberryCandy = Converter.convertWeight(invRaspberryCandy, country);
                            return weight = invRaspberryCandy;

                    }
                }

            default:
                return weight;
        }
    }

    public double checkJuiceInventory(Juice juice, double volume, Country country) {
        switch (juice) {
            case ORANGE:
                if (volume > invOrangeJuice) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invOrangeJuice + "liters of orange juice left in stock for your order");
                            return volume = invOrangeJuice;
                        case USA:
                            invOrangeJuice = Converter.convertToGallon(invOrangeJuice);
                            invOrangeJuice = Math.round(invOrangeJuice * 100.0) / 100.0;
                            System.out.println("We have only " + invOrangeJuice + "gallons of orange juice left in stock for your order");
                            invOrangeJuice = Converter.convertVolume(invOrangeJuice, country);
                            return volume = invOrangeJuice;

                    }

                }

            case APPLE:
                if (volume > invAppleJuice) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invAppleJuice + "liters of apple juice left in stock for your order");
                            return volume = invAppleJuice;
                        case USA:
                            invAppleJuice = Converter.convertToGallon(invAppleJuice);
                            invAppleJuice = Math.round(invAppleJuice * 100.0) / 100.0;
                            System.out.println("We have only " + invAppleJuice + "gallons of apple juice left in stock for your order");
                            invAppleJuice = Converter.convertVolume(invAppleJuice, country);
                            return volume = invAppleJuice;

                    }
                }

            case GRAPE:
                if (volume > invGrapeJuice) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invGrapeJuice + "liters of grape juice left in stock for your order");
                            return volume = invGrapeJuice;
                        case USA:
                            invGrapeJuice = Converter.convertToGallon(invGrapeJuice);
                            invGrapeJuice = Math.round(invGrapeJuice * 100.0) / 100.0;
                            System.out.println("We have only " + invGrapeJuice + "gallons of grape juice left in stock for your order");
                            invGrapeJuice = Converter.convertVolume(invGrapeJuice, country);
                            return volume = invGrapeJuice;

                    }
                }

            case MANGO:
                if (volume > invMangoJuice) {
                    switch (country) {
                        case CANADA:
                            System.out.println("We have only " + invMangoJuice + "liters of mango juice left in stock for your order");
                            return volume = invMangoJuice;
                        case USA:
                            invMangoJuice = Converter.convertToGallon(invMangoJuice);
                            invMangoJuice = Math.round(invMangoJuice * 100.0) / 100.0;
                            System.out.println("We have only " + invMangoJuice + "gallons of mango juice left in stock for your order");
                            invMangoJuice = Converter.convertVolume(invMangoJuice, country);
                            return volume = invMangoJuice;

                    }
                }

            default:
                return volume;
        }
    }
}
