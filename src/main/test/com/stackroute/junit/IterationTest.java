package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.Iteration;
import org.junit.*;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration k;
    @Before
    public void setUp(){
        k=new Iteration();
    }

    @After
    public void tearDown()  {
        k=null;
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
    public void testForPattern() {
        String t=k.Output(3);
        assertEquals("122333",t);
    }
    @Test
    public void testForPatternWhenACharecterIsGiven() {
        String t=k.Output('A');
        assertEquals("Error",t);
    }

}