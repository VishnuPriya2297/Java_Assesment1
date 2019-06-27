package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.IdentifyCharecters;

import org.junit.*;

import static org.junit.Assert.*;

public class IdentifyCharectersTest {
    IdentifyCharecters ic;
    @Before
    public void setUp() {
        ic=new IdentifyCharecters();
    }

    @After
    public void tearDown() {
        ic =null;
    }
    @BeforeClass
    public static void setUpBeforeClass()
    {
        System.out.println("Class Creation");
    }

    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("Class Deletion");
    }
    @Test
    public void testforLowerCaseLetters()
    {
        String t=ic.checkInput('a');
        assertEquals("Lower case letter",t);
    }
    @Test
    public void testforUpperCaseLetters()
    {
        String t=ic.checkInput('A');
        assertEquals("Capital letter",t);
    }
    @Test
    public void testforNumber()
    {
        String t=ic.checkInput('9');
        assertEquals("Digit",t);
    }
    @Test
    public void testforSpecialCharecters()
    {
        String t=ic.checkInput('#');
        assertEquals("Special symbols",t);
    }
}