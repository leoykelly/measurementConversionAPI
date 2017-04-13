package edu.matc;

import org.junit.*;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by sandischwert on 4/12/17.
 */
public class KitchenMathTests {
    private final Logger log = Logger.getLogger(this.getClass());

    KitchenMath kitchenMath = new KitchenMath();
    double quantity;
    double expectedResult;
    double convertedQuantity;

    @Before
    public void runThisFirst() throws Exception {

    }

    //Teaspoon Tests
    @Test
    public void testTspToTbsMath() throws Exception {
        //kitchenMath = new KitchenMath();
        quantity = 9;
        expectedResult = 3;
        convertedQuantity = kitchenMath.convertTspToTbs(quantity);

        assertEquals("6 tsp is 2 tbs", expectedResult, convertedQuantity, .0001);
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testTspToCupMath() throws Exception {
        quantity = 19;
        expectedResult = 19 * 0.0208333;
        convertedQuantity = kitchenMath.convertTspToCup(quantity);

        assertEquals("test tsp to cup", expectedResult, convertedQuantity, .0001);
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);

    }

    //testTspToPint

    @Test
    public void testTspToQuart() throws Exception {
        quantity = 125;
        expectedResult = 125 * 0.00520833;
        convertedQuantity = kitchenMath.convertTspToQuart(quantity);

        assertEquals("test tsp to cup", expectedResult, convertedQuantity, .0001);
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testTspToGallon() throws Exception {
        quantity = 1125;
        expectedResult = 1125 * 0.00130208;
        convertedQuantity = kitchenMath.convertTspToGallon(quantity);

        assertEquals("test tsp to gal", expectedResult, convertedQuantity, .0001);
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //Tablespoon Tests
    @Test
    public void testTbsToTsp() throws Exception {
        quantity = 1;
        expectedResult = 3;
        convertedQuantity = kitchenMath.convertTbsToTsp(quantity);

        assertEquals("test tbs to tsp", expectedResult, convertedQuantity, .0001);
        log.debug("test tbs to tsp");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testTbsToCups() throws Exception {
        //there are 16 tbs in 1 cup
        quantity = 32;
        expectedResult = quantity * 0.0625;
        convertedQuantity = kitchenMath.convertTbsToCup(quantity);

        assertEquals("test tbs to cup", expectedResult, convertedQuantity, .0001);
        log.debug("test tbs to cup");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //testTbsToPint

    @Test
    public void testTbsToQuarts() throws Exception {
        //there are 64 tbs in 1 quart
        quantity = 64;
        expectedResult = quantity * 0.015625;
        convertedQuantity = kitchenMath.convertTbsToQuart(quantity);

        assertEquals("test tbs to quart", expectedResult, convertedQuantity, .0001);
        log.debug("test tbs to quart");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testTbsToGals() throws Exception {
        //there are 256 tbs in 1 gallon
        quantity = 256;
        expectedResult = quantity * 0.00390625;
        convertedQuantity = kitchenMath.convertTbsToGallon(quantity);

        assertEquals("test tbs to gal", expectedResult, convertedQuantity, .0001);
        log.debug("test tbs to gal");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testCupToTsp() throws Exception {
        //there are 48 tsp in 1 cup
        quantity = 2;
        expectedResult = quantity * 48;
        convertedQuantity = kitchenMath.convertCupToTsp(quantity);

        assertEquals("test cup to tsp", expectedResult, convertedQuantity, .0001);
        log.debug("test cup to tsp");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testCupToTbs() throws Exception {
        //there are 16 tbs in 1 cup
        quantity = 2;
        expectedResult = quantity * 16;
        convertedQuantity = kitchenMath.convertCupToTbs(quantity);

        assertEquals("test cup to tbs", expectedResult, convertedQuantity, .0001);
        log.debug("test cup to tbs");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //testCupToPint

    @Test
    public void testCupToQuart() throws Exception {
        //there are 4 cups in a quart
        quantity = 8;
        expectedResult = quantity * 0.25;
        convertedQuantity = kitchenMath.convertCupToQuart(quantity);

        assertEquals("test cup to quart", expectedResult, convertedQuantity, .0001);
        log.debug("test cup to quart");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testCupToGal() throws Exception {
        //there are 16 cups in a gallon
        quantity = 24;
        expectedResult = quantity * 0.0625;
        convertedQuantity = kitchenMath.convertCupToGallon(quantity);

        assertEquals("test cup to gal", expectedResult, convertedQuantity, .0001);
        log.debug("test cup to gal");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //PINT TESTS ----- NO ONE CARES ABOUT PINTS UNLESS YOU'RE DRINKING BEER

    //Quart Tests

    @Test
    public void testQuartToTsp() throws Exception {
        //there are 192 tsp in a quart
        quantity = 2;
        expectedResult = quantity * 192;
        convertedQuantity = kitchenMath.convertQuartToTsp(quantity);

        assertEquals("test quart to tsp", expectedResult, convertedQuantity, .0001);
        log.debug("test quart to tsp");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testQuartToTbs() throws Exception {
        //there are 64 tbs in a quart
        quantity = 2;
        expectedResult = quantity * 64;
        convertedQuantity = kitchenMath.convertQuartToTbs(quantity);

        assertEquals("test quart to tbs", expectedResult, convertedQuantity, .0001);
        log.debug("test quart to tbs");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testQuartToCup() throws Exception {
        //there are 4 cups in a quart
        quantity = 2;
        expectedResult = quantity * 4;
        convertedQuantity = kitchenMath.convertQuartToCup(quantity);

        assertEquals("test quart to cup", expectedResult, convertedQuantity, .0001);
        log.debug("test quart to cup");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //testQuartToPint

    @Test
    public void testQuartToGal() throws Exception {
        //there are 4 quarts in a gallon
        quantity = 24;
        expectedResult = quantity * 0.25;
        convertedQuantity = kitchenMath.convertQuartToGallon(quantity);

        assertEquals("test quart to gal", expectedResult, convertedQuantity, .0001);
        log.debug("test quart to gal");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //Gallon Tests

    @Test
    public void testGalToTsp() throws Exception {
        //there are 768 tsp in a gallon
        quantity = 1;
        expectedResult = quantity * 768;
        convertedQuantity = kitchenMath.convertGallonToTsp(quantity);

        assertEquals("test gal to tsp", expectedResult, convertedQuantity, .0001);
        log.debug("test gal to tsp");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testGalToTbs() throws Exception {
        //there are 256 tbs in a gallon
        quantity = 1;
        expectedResult = quantity * 256;
        convertedQuantity = kitchenMath.convertGallonToTbs(quantity);

        assertEquals("test gal to tbs", expectedResult, convertedQuantity, .0001);
        log.debug("test gal to tbs");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    @Test
    public void testGalToCup() throws Exception {
        //there are 16 ups in a gallon
        quantity = 1;
        expectedResult = quantity * 16;
        convertedQuantity = kitchenMath.convertGallonToCup(quantity);

        assertEquals("test gal to cup", expectedResult, convertedQuantity, .0001);
        log.debug("test gal to cup");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

    //testGalToPint

    @Test
    public void testGalToQuart() throws Exception {
        //there are 4 qts in a gallon
        quantity = 1;
        expectedResult = quantity * 4;
        convertedQuantity = kitchenMath.convertGallonToQuart(quantity);

        assertEquals("test gal to qt", expectedResult, convertedQuantity, .0001);
        log.debug("test gal to qt");
        log.debug("Expected: " + expectedResult);
        log.debug("Actual: " + convertedQuantity);
    }

} //end of TestKitchenClass Test Class
