/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UCHE
 */
public class JunitTest {
    
    public JunitTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Junit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 2;
        Junit instance = new Junit();
        int expResult = 4;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Junit.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Junit.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
