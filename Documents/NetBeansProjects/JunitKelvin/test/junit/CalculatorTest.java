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
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkString method, of class Calculator.
     */
    
    @Test
    public void testCheckString() {
        System.out.println("checkString");
        Calculator obj = new Calculator();
        assertTrue("String are not equal", obj.checkString("Hello", "Hello"));
    }
    
//    
//    @Test
//    public void testCheckString() {
//        System.out.println("checkString");
//        String a = "";
//        String b = "";
//        Calculator instance = new Calculator();
//        boolean expResult = false;
//        boolean result = instance.checkString(a, b);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of add method, of class Calculator.
//     */
//    @Test
//    public void testAdd_double_double() {
//        System.out.println("add");
//        double a = 0.0;
//        double b = 0.0;
//        Calculator instance = new Calculator();
//        double expResult = 0.0;
//        double result = instance.add(a, b);
//        assertEquals(expResult, result, 0.0);
//    }
//
//    /**
//     * Test of add method, of class Calculator.
//     */
//    @Test
//    public void testAdd_int_int() {
//        System.out.println("add");
//        int a = 0;
//        int b = 0;
//        Calculator instance = new Calculator();
//        int expResult = 0;
//        int result = instance.add(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of add method, of class Calculator.
//     */
//    @Test
//    public void testAdd_String_String() {
//        System.out.println("add");
//        String a = "";
//        String b = "";
//        Calculator instance = new Calculator();
//        String expResult = "";
//        String result = instance.add(a, b);
//        assertEquals(expResult, result);
//    }
    
}
