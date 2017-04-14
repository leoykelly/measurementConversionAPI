package edu.matc;

import org.apache.log4j.Logger;

/**
 * Created by sandi schwert on 4/10/17.
 */
public class ConvertTemperatureMeasurements {

    private final Logger log = Logger.getLogger(this.getClass());

    private ConversionSet conversionSet;
    private TemperatureMath tempMeasurementConverter = new TemperatureMath();

    public ConvertTemperatureMeasurements() {

    }

    public ConvertTemperatureMeasurements(ConversionSet conversionSet) {

        this.conversionSet = conversionSet;
    }

    /**
     * The purpose of this method is to check which type of temp measurement the from type is.
     * Author: Sandi Schwert 4/9/17
     *
     * @return a double which is the convertedMeasurement after calling the corresponding method
     */

    public double checkTempValueFromType() {
        String fromType = conversionSet.getFromType();
        double convertedMeasurement = 0.00;

        if (fromType.equals("celsius")){
            convertedMeasurement = checkCelsiusToMethod();

        } else if (fromType.equals("fahrenheit")) {
            convertedMeasurement = checkFahrenheitToMethod();

        } else if (fromType.equals("kelvin")) {
            convertedMeasurement = checkKelvinToMethod();
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "celsius") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkCelsiusToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("fahrenheit")) {
            convertedMeasurement = tempMeasurementConverter.convertCelsiusToFahrenheit(measurementAmount);
        } else if (toType.equals("kelvin")) {
            convertedMeasurement = tempMeasurementConverter.convertCelsiusToKelvin(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "Fahrenheit") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkFahrenheitToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("celsius")) {
            convertedMeasurement = tempMeasurementConverter.convertFahrenheitToCelsius(measurementAmount);
        } else if (toType.equals("kelvin")) {
            convertedMeasurement = tempMeasurementConverter.convertFahrenheitToKelvin(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out which unit is desired (from the original unit "Kelvin") and to
     * send the converted number back up through the methods.
     * Author: Sandi Schwert 4/9/17
     * @return convertedMeasurement which is the result after the appropriate math class has been called
     */
    private double checkKelvinToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType.equals("celsius")) {
            convertedMeasurement = tempMeasurementConverter.convertKelvinToCelsius(measurementAmount);
        } else if (toType.equals("fahrenheit")) {
            convertedMeasurement = tempMeasurementConverter.convertKelvinToFahrenheit(measurementAmount);
        }
        return convertedMeasurement;
    }

} //end ConvertTemperatureMeasurements class
