package edu.matc;

import org.apache.log4j.Logger;

import static java.lang.Math.*;

/**
 * Created by Sandi Schwert on 3/7/17.
 * Written by Kyle
 */
public class KitchenMath {

    private final Logger log = Logger.getLogger(this.getClass());

    public KitchenMath() {
    }

    //Teaspoon conversion methods
    public double convertTspToTbs(double quantity) {
        double convertedQuantity = round(quantity * 0.333333);
        return convertedQuantity;
    }

    public double convertTspToCup(double quantity) {
        double convertedQuantity = quantity * 0.0208333;
        return convertedQuantity;
    }

    public double convertTspToQuart(double quantity) {
        double convertedQuantity = quantity * 0.00520833;
        return convertedQuantity;
    }

    public double convertTspToGallon(double quantity) {
        double convertedQuantity = quantity * 0.00130208;
        return convertedQuantity;
    }


    //Tablespoon conversion methods
    public double convertTbsToTsp(double quantity) {
        double convertedQuantity = quantity * 3;
        return convertedQuantity;
    }

    public double convertTbsToCup(double quantity) {
        double convertedQuantity = quantity * 0.0625;
        return convertedQuantity;
    }

    public double convertTbsToQuart(double quantity) {
        double convertedQuantity = quantity * 0.015625;
        return convertedQuantity;
    }

    public double convertTbsToGallon(double quantity) {
        double convertedQuantity = quantity * 0.00390625;
        return convertedQuantity;
    }

    //Cup conversion methods
    public double convertCupToTsp(double quantity) {
        double convertedQuantity = quantity * 48;
        return convertedQuantity;
    }

    public double convertCupToTbs(double quantity) {
        double convertedQuantity = quantity * 16;
        return convertedQuantity;
    }

    public double convertCupToQuart(double quantity) {
        double convertedQuantity = quantity * 0.25;
        return convertedQuantity;
    }

    public double convertCupToGallon(double quantity) {
        double convertedQuantity = quantity * 0.0625;
        return convertedQuantity;
    }

    //Quart conversion methods
    public double convertQuartToTsp(double quantity) {
        double convertedQuantity = quantity * 192;
        return convertedQuantity;
    }

    public double convertQuartToTbs(double quantity) {
        double convertedQuantity = quantity * 64;
        return convertedQuantity;
    }

    public double convertQuartToCup(double quantity) {
        double convertedQuantity = quantity * 4;
        return convertedQuantity;
    }

    public double convertQuartToGallon(double quantity) {
        double convertedQuantity = quantity * 0.25;
        return convertedQuantity;
    }

    //Gallon conversion methods
    public double convertGallonToTsp(double quantity) {
        double convertedQuantity = quantity * 768;
        return convertedQuantity;
    }

    public double convertGallonToTbs(double quantity) {
        double convertedQuantity = quantity * 256;
        return convertedQuantity;
    }

    public double convertGallonToCup(double quantity) {
        double convertedQuantity = quantity * 16;
        return convertedQuantity;
    }
    public double convertGallonToQuart(double quantity) {
        double convertedQuantity = quantity * 4;
        return convertedQuantity;
    }


} //end edu.matc.Math Class. Heh.
//Lol, that's a good one, Kyle.
