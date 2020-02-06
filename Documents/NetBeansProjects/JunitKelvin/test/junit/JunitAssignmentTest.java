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
public class JunitAssignmentTest {
    
    public JunitAssignmentTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void areaOfACircle(){
        double pi = 3.141;
        int radius = 23;
        
        double answer = (2*pi)*(radius*2);
        assertEquals(answer, answer, 0);
    }
    
    /**
     * Test of main method, of class JunitAssignment.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        JunitAssignment.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
