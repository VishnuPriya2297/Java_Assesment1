package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.SumOfIntegers;
import org.junit.*;

import static org.junit.Assert.*;

public class SumOfIntegersTest {
    SumOfIntegers object;
    @Before
    public void setUp() throws Exception {
        object=new SumOfIntegers();
    }

    @After
    public void tearDown() throws Exception {
    object=null;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("After Class");

    }
    @Test
    public void givenNumberShouldDisplayLoop() {
        String result= object.printLoop(2);
        assertEquals("122",result);

    }
    @Test
    public void givenNumberShouldDisplay() {
        String result= object.printLoop(5);
        assertEquals("122333444455555",result);

    }
}