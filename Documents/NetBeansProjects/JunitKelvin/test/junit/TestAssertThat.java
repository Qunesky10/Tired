package junit;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.isA;
import org.junit.*;
import static org.junit.Assert.assertThat;

public class TestAssertThat {
    int totalNoOfStudent = 0;
    
    @Before
    public void setStudent(){
        totalNoOfStudent = 9;
    }
    
    @Test
    public void testAssetThatEquals(){
        assertThat("123", is("123"));
    }
    
    @Test
    public void testAssetThatNotEquals(){
        assertThat(totalNoOfStudent, is("123"));
    }
    
    @Test
    public void testAssertThatOject(){
        assertThat("123", isA(String.class));
    }
    
    @Test
    public void testAssertThatWithMessage(){
        assertThat("They are not equals", "123", is("1234"));
    }
}
