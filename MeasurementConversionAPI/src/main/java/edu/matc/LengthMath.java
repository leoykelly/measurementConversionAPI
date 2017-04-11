package edu.matc;

/**
 * Created by sandi schwert on 4/6/17.
 */
public class LengthMath {

    /* EnglishToMetricConversions */
    /* Inches */
    public double convertInchToMillimeter(double length) {
        double convertedLength = length * 25.4;
        return convertedLength;
    }

    public double convertInchToCentimeter(double length) {
        double convertedLength = length * 2.54;
        return convertedLength;
    }

    public double convertInchToMeter(double length) {
        double convertedLength = length * .0254;
        return convertedLength;
    }

    public double convertInchToKilometer(double length) {
        double convertedLength = length * 2.54e-5;
        return convertedLength;
    }

    /* Feet */
    public double convertFootToMillimeter(double length) {
        double convertedLength = length * 304.8;
        return convertedLength;
    }

    public double convertFootToCentimeter(double length) {
        double convertedLength = length * 30.48;
        return convertedLength;
    }

    public double convertFootToMeter(double length) {
        double convertedLength = length * .3048;
        return convertedLength;
    }

    public double convertFootToKilometer(double length) {
        double convertedLength = length * 0.0003048;
        return convertedLength;
    }

    /* Yards */
    public double convertYardToMillimeter(double length) {
        double convertedLength = length * 914.4;
        return convertedLength;
    }

    public double convertYardToCentimeter(double length) {
        double convertedLength = length * 91.44;
        return convertedLength;
    }

    public double convertYardToMeter(double length) {
        double convertedLength = length * .9144;
        return convertedLength;
    }

    public double convertYardToKilometer(double length) {
        double convertedLength = length * 0.0009144;
        return convertedLength;
    }

    /* Miles */
    public double convertMileToMillimeter(double length) {
        double convertedLength = length * 1.609e+6;
        return convertedLength;
    }

    public double convertMileToCentimeter(double length) {
        double convertedLength = length * 160934;
        return convertedLength;
    }

    public double convertMileToMeter(double length) {
        double convertedLength = length * 1609.34;
        return convertedLength;
    }

    public double convertMileToKilometer(double length) {
        double convertedLength = length * 1.60934;
        return convertedLength;
    }

    /* Metric to English Conversions*/
    /* Millimeters */
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

    public double convertMillimeterToMile (double length) {
        double convertedLength = length * 6.21371e-7;
        return convertedLength;
    }
    

    /* Centimeters */
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

    /* Meters */
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

    /* I'm not including Miles and Kilometers because it's too far */

} /* end of LengthMath class */
