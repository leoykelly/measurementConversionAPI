package edu.matc;

import org.apache.log4j.Logger;

/**
 * Created by Kelly on 3/22/2017.
 */
public class ConvertKitchenMeasurements {

    private final Logger log = Logger.getLogger(this.getClass());

    private ConversionSet conversionSet;
    private KitchenMath kitchenMeasurementConverter = new KitchenMath();

    public ConvertKitchenMeasurements() {

    }

    public ConvertKitchenMeasurements(ConversionSet conversionSet) {

        this.conversionSet = conversionSet;
    }



    /**
     * The purpose of this method is to check which type of kitchen measurement the from type is.
     * Author: KAR 3/22/17
     *
     * @return
     */
    public double checkKitchenMeasurementFromType() {
        String fromType = conversionSet.getFromType();
        double convertedMeasurement = 0.00;

        if (fromType == "cup"){
            checkCupsToMethod();

        } else if (fromType == "teaspoon") {
            checkTbsToMethod();

        } else if (fromType == "tablespoon") {
            checkTspToMethod();

        } else if (fromType == "quart") {
            checkQuartToMethod();

        } else if (fromType == "gallon") {
            checkGallonToMethod();
        }

        return convertedMeasurement;
    }


    /**
     * The purpose if this method is to figure out what type the cup from type is converting to and to
     * send the converted number back up through the methods.
     * Author: KAR 3/22/17
     * @return
     */
    private double checkCupsToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "tablespoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertCupToTbs(measurementAmount);
        } else if (toType == "quart") {
            convertedMeasurement = kitchenMeasurementConverter.convertCupToQuart(measurementAmount);
        } else if (toType == "gallon") {
            convertedMeasurement = kitchenMeasurementConverter.convertCupToGallon(measurementAmount);
        } else if (toType == "teaspoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertCupToTsp(measurementAmount);
        }
        log.info("the value of the convertedMeasurement" + convertedMeasurement);
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out what type the tablespoon from type is converting to and to
     * send the converted number back up through the methods.
     * Author: KAR 3/22/17
     * @return
     */
    private double checkTbsToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "cup") {
            convertedMeasurement = kitchenMeasurementConverter.convertTbsToCup(measurementAmount);
        } else if (toType == "quart") {
            convertedMeasurement = kitchenMeasurementConverter.convertTbsToQuart(measurementAmount);
        } else if (toType == "gallon") {
            convertedMeasurement = kitchenMeasurementConverter.convertTbsToGallon(measurementAmount);
        } else if (toType == "teaspoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertTbsToTsp(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out what type the teaspoon from type is converting to and to
     * send the converted number back up through the methods.
     * Author: KAR 3/22/17
     * @return
     */
    private double checkTspToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "cup") {
            convertedMeasurement = kitchenMeasurementConverter.convertTspToCup(measurementAmount);
        } else if (toType == "quart") {
            convertedMeasurement = kitchenMeasurementConverter.convertTspToQuart(measurementAmount);
        } else if (toType == "gallon") {
            convertedMeasurement = kitchenMeasurementConverter.convertTspToGallon(measurementAmount);
        } else if (toType == "tbs") {
            convertedMeasurement = kitchenMeasurementConverter.convertTspToTbs(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out what type the quart from type is converting to and to
     * send the converted number back up through the methods.
     * Author: KAR 3/22/17
     * @return
     */
    private double checkQuartToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "cup") {
            convertedMeasurement = kitchenMeasurementConverter.convertQuartToCup(measurementAmount);
        } else if (toType == "teaspoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertQuartToTsp(measurementAmount);
        } else if (toType == "gallon") {
            convertedMeasurement = kitchenMeasurementConverter.convertQuartToGallon(measurementAmount);
        } else if (toType == "tablespoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertQuartToTbs(measurementAmount);
        }
        return convertedMeasurement;
    }

    /**
     * The purpose if this method is to figure out what type the gallon from type is converting to and to
     * send the converted number back up through the methods.
     * Author: KAR 3/22/17
     * @return
     */
    private double checkGallonToMethod() {
        String toType = conversionSet.getToType();
        double measurementAmount = conversionSet.getMeasurementAmount();
        double convertedMeasurement = 0.00;

        if (toType == "cup") {
            convertedMeasurement = kitchenMeasurementConverter.convertGallonToCup(measurementAmount);
        } else if (toType == "teaspoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertGallonToTsp(measurementAmount);
        } else if (toType == "quart") {
            convertedMeasurement = kitchenMeasurementConverter.convertGallonToQuart(measurementAmount);
        } else if (toType == "tablespoon") {
            convertedMeasurement = kitchenMeasurementConverter.convertGallonToTbs(measurementAmount);
        }
        return convertedMeasurement;
    }

}
