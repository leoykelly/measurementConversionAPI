package edu.matc;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandi schwert on 4/10/17.
 */
public class ConvertKitchenMeasurementTest {
    private final Logger log = Logger.getLogger(this.getClass());
    ConvertKitchenMeasurements measurement;
    ConversionSet newSet;

    @Before
    public void doThisFirst() {
    }

/*
    @Test
    public void testGetCupsFromType() throws Exception {
        newSet.setFromType("cup");
        String hope = newSet.getFromType();
        measurement = new ConvertKitchenMeasurements();
        String tester = "cup";
        measurement.checkKitchenMeasurementFromType();

        assertEquals("is cups the fromType?", tester, hope);
        log.debug("is it a cup?: Expected: " + tester + " -- Actual: " + hope);
    }
*/

}
