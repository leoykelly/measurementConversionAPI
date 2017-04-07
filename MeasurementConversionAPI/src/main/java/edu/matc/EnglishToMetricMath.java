package edu.matc;

/**
 * Created by student on 4/6/17.
 */
public class EnglishToMetricMath {

    public double convertInchesToMillimeters(double length) {
        double convertedLength = length * 25.4;
        return convertedLength;
    }

    public double convertInchesToCentimeters(double length) {
        double convertedLength = length * 2.54;
        return convertedLength;
    }

    public double convertInchesToMeters(double length) {
        double convertedLength = length * .0254;
        return convertedLength;
    }

    /* THIS IS A USELESS FORMULA DON'T BOTHER WITH KILOMETERS UNLESS BACKWARDS
       public double convertInchesToKilometers(double length) {
        double convertedLength = length * .00000254;
        return convertedLength;
    }*/

    public double convertFeetToMillimeters(double length) {
        double convertedLength = length * 304.8;
        return convertedLength;
    }

    public double convertFeetToCentimeters(double length) {
        double convertedLength = length * 30.48;
        return convertedLength;
    }

    public double convertFeetToMeters(double length) {
        double convertedLength = length * .3048;
        return convertedLength;
    }

    public double convertYardsToMillimeters(double length) {
        double convertedLength = length * 30.48;
        return convertedLength;
    }

    public double convertYardsToCentimeters(double length) {
        double convertedLength = length * 30.48;
        return convertedLength;
    }

    public double convertYardsToMeters(double length) {
        double convertedLength = length * 30.48;
        return convertedLength;
    }

}
