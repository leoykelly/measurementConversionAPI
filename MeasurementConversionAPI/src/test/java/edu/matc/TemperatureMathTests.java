package edu.matc;

import org.junit.*;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by sandi schwert on 4/12/17.
 */
public class TemperatureMathTests {
    private final Logger log = Logger.getLogger(this.getClass());

    TemperatureMath tempMath = new TemperatureMath();
    double quantity;
    double expectedResult;
    double convertedQuantity;

    @Before
    public void runThisFirst() throws Exception {

    }

    //Celsius tests
    @Test
    public void testCtoF() throws Exception {
        quantity = 32;
        expectedResult = (quantity * 1.8) + 32;
        convertedQuantity = tempMath.convertCelsiusToFahrenheit(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("C to F: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    @Test
    public void testCtoK() throws Exception {
        quantity = 33.33333;
        expectedResult = quantity - 273.15;
        convertedQuantity = tempMath.convertCelsiusToKelvin(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("C to K: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    //Fahrenheit tests
    @Test
    public void testFtoC() throws Exception {
        quantity = 92;
        expectedResult = (quantity - 32) * 5 / 9;
        convertedQuantity = tempMath.convertFahrenheitToCelsius(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("F to C: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    @Test
    public void testFtoK() throws Exception {
        quantity = 92;
        expectedResult = -239.81667;
        convertedQuantity = tempMath.convertFahrenheitToKelvin(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("F to K: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    //Kelvin tests
    @Test
    public void testKtoC() throws Exception {
        quantity = 32;
        expectedResult = (quantity * 1.8) + 32;
        convertedQuantity = tempMath.convertCelsiusToFahrenheit(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("K to C: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

    @Test
    public void testKtoF() throws Exception {
        quantity = 32;
        expectedResult = (quantity * 1.8) + 32;
        convertedQuantity = tempMath.convertCelsiusToFahrenheit(quantity);

        assertEquals(expectedResult, convertedQuantity, .0001);
        log.debug("K to F: Expected: " + expectedResult + " -- Actual: " + convertedQuantity);
    }

}
