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

    public String getToType() {
        log.debug("inside the getToType " + toType);
        return toType;
    }

    public void setToType(String toType) {

        this.toType = toType;
        log.debug("inside the setToType " + toType);
    }

    public String getFromType() {
        log.debug("inside the getFromType " + fromType);
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
        log.debug("inside the setFromType " + fromType);
    }

    public double getMeasurementAmount() {
        log.debug("inside the getMeasurementAmount " + measurementAmount);
        return measurementAmount;
    }

    public void setMeasurementAmount(double measurementAmount) {

        this.measurementAmount = measurementAmount;
        log.debug("inside the setMeasurementAmount " + measurementAmount);
    }



}
