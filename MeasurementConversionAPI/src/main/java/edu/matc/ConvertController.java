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



    public double convertMeasurement(ConversionSet conversionSet) {
        log.debug("1: inside the convertMeasurement method ");
        double resultDouble = checkFromTypeCategory(conversionSet);
        log.debug("5: inside the convertMeasurement method second time");
        return resultDouble;
    }
    /**
     * The purpose of this method is to determine which category of measurement the from type belongs to.
     * Author: KAR 3/22/17
     * @return
     */
    public double checkFromTypeCategory(ConversionSet conversionSet) {
        String cup = "cup";
        String fromType = conversionSet.getFromType();

        double convertedMeasurement = 0.00;
        log.debug("Before checking from type: " + fromType);

        if (fromType == cup || fromType == "teaspoon" || fromType == "tablespoon" || fromType == "quart" || fromType == "gallon") {
            ConvertKitchenMeasurements kitchenMeasurements = new ConvertKitchenMeasurements();
            log.debug("2. inside the checkFromTypeCategory " + fromType);
            convertedMeasurement = kitchenMeasurements.checkKitchenMeasurementFromType(conversionSet);
            log.debug("4. inside the checkFromTypeCategory second time " + fromType);



        } else if (fromType == "fahrenheit" || fromType == "celsius" || fromType == "kelvin") {


            ConvertTemperatureMeasurements tempMeasurement = new ConvertTemperatureMeasurements();
            convertedMeasurement = tempMeasurement.checkTempValueFromType();




        } else if (fromType == "inch" || fromType == "centimeter" || fromType == "feet" || fromType == "meter" || fromType == "kilometer" || fromType == "mile") {
            ConvertLengthMeasurements lengthMeasurements = new ConvertLengthMeasurements();
            convertedMeasurement = lengthMeasurements.checkLengthValueFromType();



        } else {
            log.debug("Not a vaild from type " + fromType);
        }
        return convertedMeasurement;
    }





} //end convertController class

