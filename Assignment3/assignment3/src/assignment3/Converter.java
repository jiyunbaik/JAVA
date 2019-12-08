package assignment3;

import Utility.Country;

public class Converter {

    public static double rateUSD = 0.76;
    private static final double rateMILE = 0.621371;
    private static final double rateFEET = 3.28084;
    private static final double rateGALLON = 0.264172;
    private static final double ratePOUND = 2.20462;

    public static double convertCurrency(double price, Country country) {
        switch (country) {
            case CANADA:
                return price;
            case USA:
                return price * rateUSD;
            default:
                return price;
        }
    }

    public static double convertDistance(double distance, Country country) {
        switch (country) {
            case CANADA:
                return distance;
            case USA:
                return distance / rateMILE;
            default:
                return distance;
        }
    }

    public static double convertLength(double length, Country country) {
        switch (country) {
            case CANADA:
                return length;
            case USA:
                return length / rateFEET;
            default:
                return length;
        }
    }

    public static double convertToFeet(double value) {

        return value * rateFEET;
    }

    public static double convertVolume(double volume, Country country) {
        switch (country) {
            case CANADA:
                return volume;
            case USA:
                return volume / rateGALLON;
            default:
                return volume;
        }
    }

    public static double convertToGallon(double value) {

        return value * rateGALLON;
    }

    public static double convertWeight(double weight, Country country) {
        switch (country) {
            case CANADA:
                return weight;
            case USA:
                return weight / ratePOUND;
            default:
                return weight;
        }
    }

    public static double convertToPound(double value) {

        return value * ratePOUND;
    }

}
