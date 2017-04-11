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

        } else if (fromType == "mile") {
            checkMileToMethod();

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
     * The purpose if this method is to figure out which unit is desired (from the original unit "inch") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
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
     * The purpose if this method is to figure out which unit is desired (from the original unit "feet") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
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

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "yard") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkYardToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "millimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertYardToMillimeter(measurementAmount);
        } else if (toType == "centimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertYardToCentimeter(measurementAmount);
        } else if (toType == "meter") {
            convertedMeasurement = lengthMeasurementConverter.convertYardToMeter(measurementAmount);
        } else if (toType == "kilometer") {
            convertedMeasurement = lengthMeasurementConverter.convertYardToKilometer(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "mile") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkMileToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "millimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertMileToMillimeter(measurementAmount);
        } else if (toType == "centimeter") {
            convertedMeasurement = lengthMeasurementConverter.convertMileToCentimeter(measurementAmount);
        } else if (toType == "meter") {
            convertedMeasurement = lengthMeasurementConverter.convertMileToMeter(measurementAmount);
        } else if (toType == "kilometer") {
            convertedMeasurement = lengthMeasurementConverter.convertMileToKilometer(measurementAmount);
        }
        return convertedMeasurement;

    }

    private double checkMillimeterToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "inch") {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToInch(measurementAmount);
        } else if (toType == "foot") {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToFoot(measurementAmount);
        } else if (toType == "yard") {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToYard(measurementAmount);
        } else if (toType == "mile") {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToMile(measurementAmount);
        }
        return convertedMeasurement;

    }

    private double checkCentimeterToMethod() {
    }

    private double checkMeterToMethod() {

    }


} /* end of ConvertLengthMeasurements class */
