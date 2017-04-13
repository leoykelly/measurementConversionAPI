package edu.matc;

import org.junit.*;
import org.apache.log4j.Logger;

import static org.junit.Assert.assertEquals;

/**
 * Created by sandischwert on 4/12/17.
 */
public class KitchenClassTests {
    private final Logger log = Logger.getLogger(this.getClass());

    KitchenMath kitchenMath = new KitchenMath();
    double quantity;
    double expectedResult;
    double convertedQuantity;

    @Before
    public void runThisFirst() throws Exception {

    }


    @Test
    public void testTspToTbsMath() throws Exception {
        //kitchenMath = new KitchenMath();
        quantity = 9;
        expectedResult = 3;
        convertedQuantity = kitchenMath.convertTspToTbs(quantity);

        assertEquals("6 tsp is 2 tbs", expectedResult, convertedQuantity, .0001);
    }

    @Test
    public void testTspToCupMath() throws Exception {
        quantity = 19;
        expectedResult = 19 * 0.00520833;
        convertedQuantity = kitchenMath.convertTspToCup(19);

        assertEquals("test tsp to cup", expectedResult, convertedQuantity, .0001);


    }

}
