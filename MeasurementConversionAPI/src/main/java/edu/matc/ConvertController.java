package edu.matc;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class ConvertController {

    String fromType;
    String toType;
    double measurementAmount;
    Math kitchenMeasurementConverter = new Math();

    /**
     * Empty constructor
     * Author: KAR 3/22/17
     * */
    public ConvertController() {
    }

    /**
     * Constructor to bring in params 1 through three
     * Author: KAR 3/22/17
     * */
    public ConvertController(String fromTypeParameter, String toTypeParameter, String measurementAmountParameter) {
        fromType = fromTypeParameter.toLowerCase();
        toType = toTypeParameter.toLowerCase();
        measurementAmount = Double.parseDouble(measurementAmountParameter);

    }


    /**
     * The purpose of this method is to determine which category of measurement the from type belongs to.
     * Author: KAR 3/22/17
     * @return
     */
    public double checkFromTypeCategory() {
        double convertedMeasurement = 0.00;

        if (fromType == "cup" || fromType == "teaspoon" || fromType == "tablespoon" || fromType == "quart" || fromType == "gallon") {

            ConvertKitchenMeasurements kitchenMeasurements = new ConvertKitchenMeasurements();
            kitchenMeasurements.checkKitchenMeasurementFromType();

        }

        if (fromType == "fahrenheit" || fromType == "celsius") {

        }

        if (fromType == "inch" || fromType == "centemeter" || fromType == "feet" || fromType == "meter" || fromType == "kilometer" || fromType == "mile") {

        }


        return convertedMeasurement;

    }



}
