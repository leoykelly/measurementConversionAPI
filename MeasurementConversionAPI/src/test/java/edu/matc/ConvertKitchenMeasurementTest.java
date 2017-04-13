package edu.matc;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by sandi schwert on 4/10/17.
 */
public class ConvertKitchenMeasurementTest {
    ConvertKitchenMeasurements measurement;

    @Before


    @Test
    public void testGetCupsFromType() throws Exception {
        measurement = new ConvertKitchenMeasurements();
        String fromType = "cup";
        //measurement.checkKitchenMeasurementFromType();

        assertEquals("is cups the fromType?", "cup", fromType);
    }


}
