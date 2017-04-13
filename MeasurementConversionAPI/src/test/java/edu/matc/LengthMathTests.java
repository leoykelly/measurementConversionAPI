package edu.matc;

import org.junit.*;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by sandischwert on 4/12/17.
 */
public class LengthMathTests {

    private final Logger log = Logger.getLogger(this.getClass());

    LengthMath lengthMath = new LengthMath();
    double quantity;
    double expectedResult;
    double convertedQuantity;

    @Before
    public void runThisFirst() throws Exception {

    }

    //Inch Test
    @Test
    public void testInchToCentimeter() throws Exception {
        quantity = 1;
        expectedResult = quantity * 2.54;
        convertedQuantity = lengthMath.convertInchToCentimeter(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("Inch to Centi: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    //Foot Test
    @Test
    public void testFootToMeter() throws Exception {
        quantity = 1;
        expectedResult = quantity * .3048;
        convertedQuantity = lengthMath.convertFootToMeter(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("Foot to Meter: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    //Yard Test
    @Test
    public void testYardToMeter() throws Exception {
        quantity = 25;
        expectedResult = quantity * .9144;
        convertedQuantity = lengthMath.convertYardToMeter(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("Mile to Kilometer: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    //Mile Test
    @Test
    public void testMileToKilometer() throws Exception {
        quantity = 3.2;
        expectedResult = quantity * 1.60934;
        convertedQuantity = lengthMath.convertMileToKilometer(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("Mile to Kilometer: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

}
