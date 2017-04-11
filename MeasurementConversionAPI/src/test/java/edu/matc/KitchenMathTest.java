package edu.matc;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by student on 4/11/17.
 */
public class KitchenMathTest {
    @Test
    public void convertTspToTbs() throws Exception {

    }

    @Test
    public void convertTspToCup() throws Exception {

    }

    @Test
    public void convertTspToQuart() throws Exception {

    }

    @Test
    public void convertTspToGallon() throws Exception {

    }

    @Test
    public void convertTbsToTsp() throws Exception {

    }

    @Test
    public void convertTbsToCup() throws Exception {

    }

    @Test
    public void convertTbsToQuart() throws Exception {

    }

    @Test
    public void convertTbsToGallon() throws Exception {

    }

    @Test
    public void convertCupToTsp() throws Exception {

    }

    @Test
    public void convertCupToTbs() throws Exception {

    }

    @Test
    public void convertCupToQuart() throws Exception {

    }

    @Test
    public void convertCupToGallon() throws Exception {

    }

    @Test
    public void convertQuartToTsp() throws Exception {

    }

    @Test
    public void convertQuartToTbs() throws Exception {

    }

    @Test
    public void convertQuartToCup() throws Exception {

    }

    @Test
    public void convertQuartToGallon() throws Exception {

    }

    @Test
    public void convertGallonToTsp() throws Exception {

    }

    @Test
    public void convertGallonToTbs() throws Exception {

    }

    @Test
    public void convertGallonToCup() throws Exception {

    }

    @Test
    public void convertGallonToQuart() throws Exception {

    }

    @Before
    KitchenMath testKitchenMath;

    @Test
    public void testTspToTbsMath() {
        testKitchenMath = new KitchenMath();

        // assert statements
        assertEquals("Tsp is 6, tbs should be 2", 2, testKitchenMath.convertTspToTbs(6));

    }

}
