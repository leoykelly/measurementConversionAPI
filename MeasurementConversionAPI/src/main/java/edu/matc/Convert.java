package edu.matc;

/**
 * Created by Sandi Schwert on 3/7/17.
 */
public class Convert {

    String fromType;
    String toType;
    String measurementAmount;

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



    public double checkFromTypeCatagory() {
        double convertedMeasurement = 0.00;
        
        if (fromType == "cups" || fromType == "teaspoons" || fromType == "tablespoons" || fromType == "quarts" || fromType == "gallons") {

        }

        if (fromType == "fahrenheit" || fromType == "celsius") {

        }


        return convertedMeasurement;

    }
}
