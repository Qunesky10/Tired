/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UCHE
 */
public class ConeTest {
    
    public ConeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of volume method, of class Cone.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        double radius = 0.0;
        double height = 0.0;
        Cone instance = new Cone();
        double expResult = 0.0;
        double result = instance.volume(radius, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Cone.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Cone.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
