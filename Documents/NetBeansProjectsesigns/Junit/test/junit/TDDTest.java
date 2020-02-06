/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import junit.TDD;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kelvi
 */
public class TDDTest {
    
    public TDDTest() {
    }

    /**
     * Test of mean method, of class TDD.
     */
    @Test
    public void testMean() {
        System.out.println("mean");
        int[] num = {1,2,3};
        TDD tdd = new TDD();
        int expResult = 2;
        int result = tdd.mean(num); 
        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of variance method, of class TDD.
     */
    @Test
    public void testVariance() {
        System.out.println("variance");
        int[] var = {2653,2783,2187,2443,1782};
        TDD tdd = new TDD();
        double expResult = 127044.2;
        double result = tdd.variance(var);
        assertEquals(expResult, result, 0.0);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TDD.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TDD.main(args);
//        fail("The test case is a prototype.");
    }
    
}
