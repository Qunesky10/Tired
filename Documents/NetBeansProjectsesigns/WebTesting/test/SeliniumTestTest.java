import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author UCHE
 */
public class SeliniumTestTest {
    
    static WebDriver driver;
    public SeliniumTestTest() {
    }
    
    
    
    @BeforeClass
    public static void initDriver(){
        
    String path = System.getProperty("user.dir");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\UCHE\\Desktop\\chromedriver.exe");
    
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.artsy.net");
    
    }
    
    
    @Before
    public void setUp(){
        
    }
    
    @After
    public void tearDown(){
        driver.close();
    }
    
    @Test
    public void hello(){
        
    }
    
    @Test
    public void verifyTitle(){
        System.out.println("Verify Title Page Test Case");
//        String title = driver.getTitle();
//        assertTrue(title.contains("Donsoft"));
    }
    
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of initDriver method, of class SeliniumTest.
//     */
//    @Test
//    public void testInitDriver() {
//        System.out.println("initDriver");
//        SeliniumTest.initDriver();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setUp method, of class SeliniumTest.
//     */
//    @Test
//    public void testSetUp() {
//        System.out.println("setUp");
//        SeliniumTest instance = new SeliniumTest();
//        instance.setUp();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of tearDown method, of class SeliniumTest.
//     */
//    @Test
//    public void testTearDown() {
//        System.out.println("tearDown");
//        SeliniumTest instance = new SeliniumTest();
//        instance.tearDown();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hello method, of class SeliniumTest.
//     */
//    @Test
//    public void testHello() {
//        System.out.println("hello");
//        SeliniumTest instance = new SeliniumTest();
//        instance.hello();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of verifyTitle method, of class SeliniumTest.
//     */
//    @Test
//    public void testVerifyTitle() {
//        System.out.println("verifyTitle");
//        SeliniumTest instance = new SeliniumTest();
//        instance.verifyTitle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
