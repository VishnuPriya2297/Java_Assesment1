package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.SortandSum;
import org.junit.*;

import static org.junit.Assert.*;

public class SortandSumTest {
    SortandSum ss;

    @Before
    public void setUp() throws Exception {
    ss=new SortandSum();
    }

    @After
    public void tearDown() throws Exception {
        ss=null;
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
    public void testForSumLessThan15()
    {
        String t=ss.sortDecreasingOrderAndPrintSumOfEvenNumbers("779645");
        assertEquals("Sorted number in non-increasing order 977654sum of even numbers is 10 false",t);
    }
    @Test
    public void testForSumGreaterThan15()
    {
        String t=ss.sortDecreasingOrderAndPrintSumOfEvenNumbers("6634");
        assertEquals("Sorted number in non-increasing order 6643sum of even numbers is 16 true",t);
    }

}