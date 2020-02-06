/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author kelvi
 */
public class TestAssertThat {
     int totalNoOfStudent = 0;
    @Before
    public void setStudent(){
        totalNoOfStudent = 9;
    }
    
    @Test
    public void testAssertThatEqual(){
        assertThat("123", is("123"));
    }
    
    @Test
    public void testAssertThatNotEqual(){
        assertThat(totalNoOfStudent, is("123"));
    }
    
    @Test
    public void testAssertThatObject(){
        assertThat("123", isA(String.class));
    }
    
    @Test
    public void testAssertThatWithMessage(){
        assertThat("They are not equal", "123", is("1234"));
    }
}
    
