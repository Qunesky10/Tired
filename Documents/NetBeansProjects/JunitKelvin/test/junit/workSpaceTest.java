/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.Random;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UCHE
 */
public class workSpaceTest {
    
    public workSpaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("hello ");
    }
    
    @After
    public void tearDown() {
        System.out.println("finish");
    }

    /**
     * Test of main method, of class workSpace.
     */
    
    @Test
    public void testMethod(){
        workSpace obj = new workSpace();
        assertEquals(obj.factor, obj.factor, 0);
    }
    
    @Test(timeout = 2800)
    public void generateRandomNumber(){
        workSpace obj = new workSpace();
        obj.generateRandomNumber();
    }
    
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        workSpace.main(args);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    
}
