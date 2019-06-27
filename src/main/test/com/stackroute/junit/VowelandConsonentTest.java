package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.VowelandConsonent;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelandConsonentTest {
    VowelandConsonent vc;
    @Before
    public void setUp() throws Exception {
        vc= new VowelandConsonent();
    }
    @After
    public void tearDown() throws Exception {
        vc=null;
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
    public void testForVowelConsonant()
    {
        String t=vc.CheckConsonantorVowel("stack");
        assertEquals("consonantconsonantVowelconsonantconsonant",t);
    }
    @Test
    public void testForInputIsNotACharecter()
    {
        String t=vc.CheckConsonantorVowel("123");
        assertEquals("not a letter",t);
    }

}