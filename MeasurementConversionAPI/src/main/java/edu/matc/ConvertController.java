package edu.matc;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class ConvertController {

    private ConversionSet conversionSet;


    /**
     * Empty constructor
     * Author: KAR 3/22/17
     * */
    public ConvertController() {
    }



    public String convertMeasurement(ConversionSet conversionSet) {
        double resultDouble = checkFromTypeCategory(conversionSet);
        String formattedResult = formatResults(resultDouble, conversionSet);
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
        double convertedMeasurement = 0.00;

        if (fromType == "cup" || fromType == "teaspoon" || fromType == "tablespoon" || fromType == "quart" || fromType == "gallon") {

            ConvertKitchenMeasurements kitchenMeasurements = new ConvertKitchenMeasurements();
            kitchenMeasurements.checkKitchenMeasurementFromType();

        }

        if (fromType == "fahrenheit" || fromType == "celsius") {

        }

        if (fromType == "inch" || fromType == "centimeter" || fromType == "feet" || fromType == "meter" || fromType == "kilometer" || fromType == "mile") {

        }


        return convertedMeasurement;

    }

    private String formatResults(Double result, ConversionSet conversionSet) {
        String formatedResults = "";

        String returnType = conversionSet.getReturnType();
        String toType = conversionSet.getToType();

        if(returnType == "html") {
            formatedResults = "<h1>" + result + "</h1>";

        } else if (returnType == "json") {
            formatedResults = "result {" + toType + " : " + result + "}";
        }
        return formatedResults;
    }



}