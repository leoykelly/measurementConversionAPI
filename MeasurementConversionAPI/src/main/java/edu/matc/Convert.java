package edu.matc;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class Convert {

    String fromType;
    String toType;
    String measurementAmount;
    Math kitchenMeasurementConverter = new Math();

    /**
     * Empty constructor
     * Author: KAR 3/22/17
     * */
    public Convert() {
    }

    /**
     * Constructor to bring in params 1 through three
     * Author: KAR 3/22/17
     * */
    public Convert(String fromTypeParameter, String toTypeParameter, String measurementAmountParameter) {
        fromType = fromTypeParameter;
        toType = toTypeParameter;
        measurementAmount = measurementAmountParameter;

    }


    /**
     * The purpose of this method is to determine which category of measurement the from type belongs to.
     * Author: KAR 3/22/17
     * @return
     */
    public double checkFromTypeCategory() {
        double convertedMeasurement = 0.00;

        if (fromType == "cups" || fromType == "teaspoons" || fromType == "tablespoons" || fromType == "quarts" || fromType == "gallons") {

            checkKitchenMeasurementFromType();

        }

        if (fromType == "fahrenheit" || fromType == "celsius") {

        }

        if (fromType == "inches" || fromType == "centemeters" || fromType == "feet" || fromType == "meters" || fromType == "kilometers" || fromType == "miles") {

        }


        return convertedMeasurement;

    }

    private double checkKitchenMeasurementFromType() {
        double convertedMeasurement = 0.00;

        if (fromType == "cups"){
            checkCupsToMethod();

        } else if (fromType == "teaspoons") {


        } else if (fromType == "tablespoons") {


        } else if (fromType == "quarts") {


        } else if (fromType == "gallons") {

        }

        return convertedMeasurement;
    }

    private double checkCupsToMethod() {

        double convertedMeasurement = 0.00;

        if (toType == "tablespoons") {

        } else if (toType == "quarts") {

        } else if (toType == "gallons") {

        } else if (toType == "quarts") {

        }
        return convertedMeasurement;
    }

}
