package edu.matc;

/**
 * Created by student on 4/6/17.
 */
public class EnglishToMetricMath {

    /*EnglishToMetricConversions*/

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
        double convertedLength = length * 914.4;
        return convertedLength;
    }

    public double convertYardsToCentimeters(double length) {
        double convertedLength = length * 91.44;
        return convertedLength;
    }

    public double convertYardsToMeters(double length) {
        double convertedLength = length * .9144;
        return convertedLength;
    }

    /* Metric to English Conversions*/

    public double convertMillimeterToInch (double length) {
        double convertedLength = length * 0.03937;
        return convertedLength;
    }

    public double convertMillimeterToFoot (double length) {
        double convertedLength = length * 0.00328084;
        return convertedLength;
    }

    public double convertMillimeterToYard (double length) {
        double convertedLength = length * 0.00109361;
        return convertedLength;
    }

    public double convertCentimeterToInch (double length) {
        double convertedLength = length * 0.393701;
        return convertedLength;
    }

    public double convertCentimeterToFoot (double length) {
        double convertedLength = length * 0.0328084;
        return convertedLength;
    }

    public double convertCentimeterToYard (double length) {
        double convertedLength = length * 0.0109361;
        return convertedLength;
    }

    public double convertMeterToInch (double length) {
        double convertedLength = length * 39.3701;
        return convertedLength;
    }

    public double convertMeterToFoot (double length) {
        double convertedLength = length * 3.28084;
        return convertedLength;
    }

    public double convertMeterToYard (double length) {
        double convertedLength = length * 1.09361;
        return convertedLength;
    }

    /* Miles and Kilometers ???????? */

}
