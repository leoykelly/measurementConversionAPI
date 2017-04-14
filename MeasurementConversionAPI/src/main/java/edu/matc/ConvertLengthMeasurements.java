package edu.matc;

import org.apache.log4j.Logger;

/**
 * Created by student on 4/10/17.
 */
public class ConvertLengthMeasurements {

    private final Logger log = Logger.getLogger(this.getClass());

    private ConversionSet conversionSet;
    private LengthMath lengthMeasurementConverter = new LengthMath();

    public ConvertLengthMeasurements() {

    }

    public ConvertLengthMeasurements(ConversionSet conversionSet) {

        this.conversionSet = conversionSet;
    }



    /**
     * The purpose of this method is to check which type of length measurement the from type is.
     * Author: Sandi Schwert 4/9/17
     *
     * @return a double which is the convertedMeasurement after calling the corresponding method
     */
    public double checkLengthValueFromType() {
        String fromType = conversionSet.getFromType();
        double convertedMeasurement = 0.00;

        if (fromType.equals("inch")){
            checkInchesToMethod();

        } else if (fromType.equals("foot")) {
            checkFeetToMethod();

        } else if (fromType.equals("yard")) {
            checkYardToMethod();

        } else if (fromType.equals("mile")) {
            checkMileToMethod();

        } else if (fromType.equals("millimeter")) {
            checkMillimeterToMethod();

        } else if (fromType.equals("centimeter")) {
            checkCentimeterToMethod();

        } else if (fromType.equals("meter")) {
            checkMeterToMethod();

        } else if (fromType.equals("kilometer")) {
            checkKilometerToMethod();
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

        if (toType.equals("millimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertInchToMillimeter(measurementAmount);
        } else if (toType.equals("centimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertInchToCentimeter(measurementAmount);
        } else if (toType.equals("meter")) {
            convertedMeasurement = lengthMeasurementConverter.convertInchToMeter(measurementAmount);
        } else if (toType.equals("kilometer")) {
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

        if (toType.equals("millimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertFootToMillimeter(measurementAmount);
        } else if (toType.equals("centimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertFootToCentimeter(measurementAmount);
        } else if (toType.equals("meter")) {
            convertedMeasurement = lengthMeasurementConverter.convertFootToMeter(measurementAmount);
        } else if (toType.equals("kilometer")) {
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

        if (toType.equals("millimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertYardToMillimeter(measurementAmount);
        } else if (toType.equals("centimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertYardToCentimeter(measurementAmount);
        } else if (toType.equals("meter")) {
            convertedMeasurement = lengthMeasurementConverter.convertYardToMeter(measurementAmount);
        } else if (toType.equals("kilometer")) {
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

        if (toType.equals("millimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertMileToMillimeter(measurementAmount);
        } else if (toType.equals("centimeter")) {
            convertedMeasurement = lengthMeasurementConverter.convertMileToCentimeter(measurementAmount);
        } else if (toType.equals("meter")) {
            convertedMeasurement = lengthMeasurementConverter.convertMileToMeter(measurementAmount);
        } else if (toType.equals("kilometer")) {
            convertedMeasurement = lengthMeasurementConverter.convertMileToKilometer(measurementAmount);
        }
        return convertedMeasurement;

    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "millimeter") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkMillimeterToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("inch")) {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToInch(measurementAmount);
        } else if (toType.equals("foot")) {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToFoot(measurementAmount);
        } else if (toType.equals("yard")) {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToYard(measurementAmount);
        } else if (toType.equals("mile")) {
            convertedMeasurement = lengthMeasurementConverter.convertMillimeterToMile(measurementAmount);
        }
        return convertedMeasurement;

    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "centimeter") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkCentimeterToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("inch")) {
            convertedMeasurement = lengthMeasurementConverter.convertCentimeterToInch(measurementAmount);
        } else if (toType.equals("foot")) {
            convertedMeasurement = lengthMeasurementConverter.convertCentimeterToFoot(measurementAmount);
        } else if (toType.equals("yard")) {
            convertedMeasurement = lengthMeasurementConverter.convertCentimeterToYard(measurementAmount);
        } else if (toType.equals("mile")) {
            convertedMeasurement = lengthMeasurementConverter.convertCentimeterToMile(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "meter") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkMeterToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("inch")) {
            convertedMeasurement = lengthMeasurementConverter.convertMeterToInch(measurementAmount);
        } else if (toType.equals("foot")) {
            convertedMeasurement = lengthMeasurementConverter.convertMeterToFoot(measurementAmount);
        } else if (toType.equals("yard")) {
            convertedMeasurement = lengthMeasurementConverter.convertMeterToYard(measurementAmount);
        } else if (toType.equals("mile")) {
            convertedMeasurement = lengthMeasurementConverter.convertMeterToMile(measurementAmount);
        }
        return convertedMeasurement;

    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "kilometer") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkKilometerToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("inch")) {
            convertedMeasurement = lengthMeasurementConverter.convertKilometerToInch(measurementAmount);
        } else if (toType.equals("foot")) {
            convertedMeasurement = lengthMeasurementConverter.convertKilometerToFoot(measurementAmount);
        } else if (toType.equals("yard")) {
            convertedMeasurement = lengthMeasurementConverter.convertKilometerToYard(measurementAmount);
        } else if (toType.equals("mile")) {
            convertedMeasurement = lengthMeasurementConverter.convertKilometerToMile(measurementAmount);
        }
        return convertedMeasurement;

    }


} /* end of ConvertLengthMeasurements class */
