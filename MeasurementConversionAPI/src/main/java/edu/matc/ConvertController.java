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

        if (fromType.equals("cup") || fromType.equals("teaspoon") || fromType.equals("tablespoon") || fromType.equals("quart") || fromType.equals("gallon")) {
            ConvertKitchenMeasurements kitchenMeasurements = new ConvertKitchenMeasurements(conversionSet);
            log.debug("2. inside the checkFromTypeCategory " + fromType);
            convertedMeasurement = kitchenMeasurements.checkKitchenMeasurementFromType();
            log.debug("4. inside the checkFromTypeCategory second time " + fromType);



        } else if (fromType.equals("fahrenheit") || fromType.equals("celsius") || fromType.equals("kelvin")) {


            ConvertTemperatureMeasurements tempMeasurement = new ConvertTemperatureMeasurements(conversionSet);
            convertedMeasurement = tempMeasurement.checkTempValueFromType();




        } else if (fromType.equals("inch") || fromType.equals("centimeter") || fromType.equals("foot") || fromType.equals("meter") || fromType.equals("kilometer") || fromType.equals("mile")) {
            ConvertLengthMeasurements lengthMeasurements = new ConvertLengthMeasurements(conversionSet);
            convertedMeasurement = lengthMeasurements.checkLengthValueFromType();



        } else {
            log.debug("Not a vaild from type " + fromType);
        }
        return convertedMeasurement;
    }





} //end convertController class

