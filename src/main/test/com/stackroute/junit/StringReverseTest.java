package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.StringReverse;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse sr;

    @Before
    public void setUp() {
        sr=new StringReverse();
    }

    @After
    public void tearDown() {
        sr=null;
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
    public void testForStringReverse()
    {
        String t=sr.StringReverseWithoutStringBuffer("riya");
        assertEquals(" ayir",t);
    }
    @Test
    public void testForReverse()
    {
        String t=sr.StringReverseWithoutStringBuffer("Vishnu");
        assertEquals(" ayir",t);
    }
}