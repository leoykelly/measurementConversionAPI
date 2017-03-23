package edu.matc;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class Math {
    // TODO: Needs a constructor.
    double quantity;
    double convertedQuantity;

    //Teaspoon conversion methods
    public double convertTspToTbs(double quantity) {
        convertedQuantity = quantity * 0.333333;
        return convertedQuantity;
    }

    public double convertTspToCup(double quantity) {
        convertedQuantity = quantity * 0.0208333;
        return convertedQuantity;
    }

    public double convertTspToQuart(double quantity) {
        convertedQuantity = quantity * 0.00520833;
        return convertedQuantity;
    }

    public double convertTspToGallon(double quantity) {
        convertedQuantity = quantity * 0.00130208;
        return convertedQuantity;
    }


    //Tablespoon conversion methods
    public double convertTbsToTsp(double quantity) {
        convertedQuantity = quantity * 3;
        return convertedQuantity;
    }

    public double convertTbsToCup(double quantity) {
        convertedQuantity = quantity * 0.0625;
        return convertedQuantity;
    }

    public double convertTbsToQuart(double quantity) {
        convertedQuantity = quantity * 0.015625;
        return convertedQuantity;
    }

    public double convertTbsToGallon(double quantity) {
        convertedQuantity = quantity * 0.00390625;
        return convertedQuantity;
    }

    //Cup conversion methods
    public double convertCupToTsp(double quantity) {
        convertedQuantity = quantity * 48;
        return convertedQuantity;
    }

    public double convertCupToTbs(double quantity) {
        convertedQuantity = quantity * 16;
        return convertedQuantity;
    }

    public double convertCupToQuart(double quantity) {
        convertedQuantity = quantity * 0.25;
        return convertedQuantity;
    }

    public double convertCupToGallon(double quantity) {
        convertedQuantity = quantity * 0.0625;
        return convertedQuantity;
    }

    //Quart conversion methods
    public double convertQuartToTsp(double quantity) {
        convertedQuantity = quantity * 192;
        return convertedQuantity;
    }

    public double convertQuartToTbs(double quantity) {
        convertedQuantity = quantity * 64;
        return convertedQuantity;
    }

    public double convertQuartToCup(double quantity) {
        convertedQuantity = quantity * 4;
        return convertedQuantity;
    }

    public double convertQuartToGallon(double quantity) {
        convertedQuantity = quantity * 0.25;
        return convertedQuantity;
    }

    //Gallon conversion methods
    public double convertGallonToTsp(double quantity) {
        convertedQuantity = quantity * 768;
        return convertedQuantity;
    }

    public double convertGallonToTbs(double quantity) {
        convertedQuantity = quantity * 256;
        return convertedQuantity;
    }

    public double convertGallonToCup(double quantity) {
        convertedQuantity = quantity * 16;
        return convertedQuantity;
    }
    public double convertGallonToQuart(double quantity) {
        convertedQuantity = quantity * 4;
        return convertedQuantity;
    }


} //end edu.matc.Math Class. Heh.
