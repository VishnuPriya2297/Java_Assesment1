package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.EvenOdd;
import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddTest {
    EvenOdd eo;

    @Before
    public void setUp()  {
        eo=new EvenOdd();
    }

    @After
    public void tearDown()  {
        eo=null;
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
    public void testForEven()
    {
        String t=eo.checkWhethertheNumberIsEvenOrOdd(22);
        assertEquals("Jerry",t);
    }
    @Test
    public void testForOdd()
    {
        String t=eo.checkWhethertheNumberIsEvenOrOdd(27);
        assertEquals("Tom",t);
    }
    @Test
    public void testForNumberInTheRange()
    {
        String t=eo.checkWhethertheNumberIsEvenOrOdd(58);
        assertEquals("Error",t);
    }
}