package main.test.com.stackroute.junit;
import main.java.com.stackroute.junit.Palindrome;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void setUp() {
        p=new Palindrome();
    }

    @After
    public void tearDown() {
        p=null;
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
    public void testForSumLessThan25()
    {
        String t=p. CheckforPalindrome(121);
        assertEquals("is a palindrome and the sum is not greater than 25",t);
    }
    @Test
    public void testForSumGreaterThan25()
    {
        String t=p. CheckforPalindrome(2468642);
        assertEquals("is a palindrome and the sum is greater than 25",t);
    }
    @Test
    public void testForNotPalindrome()
    {
        String t=p. CheckforPalindrome(12345);
        assertEquals("is not a palindrome",t);
    }
}