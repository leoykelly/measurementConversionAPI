package edu.matc;

/**
 * Created by student on 4/10/17.
 */
public class ConvertLengthMeasurements {

    private ConversionSet conversionSet;
    private LengthMath lengthMeasurementConverter = new LengthMath();

    public ConvertLengthMeasurements() {

    }

    public ConvertLengthMeasurements(ConversionSet conversionSet) {

        this.conversionSet = conversionSet;
    }



    /**
     * The purpose of this method is to check which type of kitchen measurement the from type is.
     * Author: Sandi Schwert 4/9/17
     *
     * @return the converted measurement
     */
    public double checkLengthValueFromType() {
        String fromType = conversionSet.getFromType();
        double convertedMeasurement = 0.00;

        if (fromType == "inch"){
            checkInchesToMethod();

        } else if (fromType == "foot") {
            checkFeetToMethod();

        } else if (fromType == "yard") {
            checkYardToMethod();

        } else if (fromType == "millimeter") {
            checkMillimeterToMethod();

        } else if (fromType == "centimeter") {
            checkCentimeterToMethod();

        } else if (fromType == "meter") {
            checkMeterToMethod();
        }
        return convertedMeasurement;
     }


    /**
     * The purpose if this method is to figure out what type the cup from type is converting to and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return
     */
    private double checkInchesToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "millimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertInchToMillimeter(measurementAmount);
        } else if (toType == "centimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertInchToCentimeter(measurementAmount);
        } else if (toType == "meter") {
            convertedMeasurement = lengthMeasurementConverter.convertInchToMeter(measurementAmount);
        } else if (toType == "kilometer") {
            convertedMeasurement = lengthMeasurementConverter.convertInchToKilometer(measurementAmount);
        }
        return convertedMeasurement;
    }


    /**
     * The purpose if this method is to figure out what type the foot from type is converting to and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return
     */
    private double checkFeetToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "millimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertFootToMillimeter(measurementAmount);
        } else if (toType == "centimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertFootToCentimeter(measurementAmount);
        } else if (toType == "meter") {
            convertedMeasurement = lengthMeasurementConverter.convertFootToMeter(measurementAmount);
        } else if (toType == "kilometer") {
            convertedMeasurement = lengthMeasurementConverter.convertFootToKilometer(measurementAmount);
        }
        return convertedMeasurement;
    }

    private double checkYardToMethod() {
    }

    private double checkMillimeterToMethod() {
    }

    private double checkCentimeterToMethod() {
    }

    private double checkMeterToMethod() {

    }


} /* end of ConvertLengthMeasurements class */
