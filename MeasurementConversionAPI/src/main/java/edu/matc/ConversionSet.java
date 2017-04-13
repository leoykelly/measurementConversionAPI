package edu.matc;

import org.apache.log4j.Logger;

/**
 * Created by Kelly on 3/22/2017.
 */
public class ConversionSet {

    private String toType;
    private String fromType;
    private double measurementAmount;
    private final Logger log = Logger.getLogger(this.getClass());

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    private String returnType;

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public double getMeasurementAmount() {
        log.debug("inside the getMeasurementAmount");
        return measurementAmount;
    }

    public void setMeasurementAmount(double measurementAmount) {
        this.measurementAmount = measurementAmount;
    }



}
