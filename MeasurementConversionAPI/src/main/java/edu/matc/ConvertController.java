package edu.matc;

import org.apache.log4j.Logger;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class ConvertController {

    private final Logger log = Logger.getLogger(this.getClass());

    private ConversionSet conversionSet;


    /**
     * Empty constructor
     * Author: KAR 3/22/17
     * */
    public ConvertController() {
    }



    public String convertMeasurement(ConversionSet conversionSet) {
        double resultDouble = checkFromTypeCategory(conversionSet);
        String formattedResult = Double.toString(resultDouble);
        return formattedResult;
    }
    /**
     * The purpose of this method is to determine which category of measurement the from type belongs to.
     * Author: KAR 3/22/17
     * @return
     */
    public double checkFromTypeCategory(ConversionSet conversionSet) {
        String fromType = conversionSet.getFromType();
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 25.5;

        if (fromType == "cup" || fromType == "teaspoon" || fromType == "tablespoon" || fromType == "quart" || fromType == "gallon") {
            ConvertKitchenMeasurements kitchenMeasurements = new ConvertKitchenMeasurements();
            convertedMeasurement = kitchenMeasurements.checkKitchenMeasurementFromType();


            return convertedMeasurement;

        } else if (fromType == "fahrenheit" || fromType == "celsius" || fromType == "kelvin") {


            ConvertTemperatureMeasurements tempMeasurement = new ConvertTemperatureMeasurements();
            tempMeasurement.checkTempValueFromType();

            return convertedMeasurement;


        } else if (fromType == "inch" || fromType == "centimeter" || fromType == "feet" || fromType == "meter" || fromType == "kilometer" || fromType == "mile") {
            ConvertLengthMeasurements lengthMeasurements = new ConvertLengthMeasurements();
            lengthMeasurements.checkLengthValueFromType();

            return convertedMeasurement;

        } else {
            return convertedMeasurement;
        }

    }





} //end convertController class

