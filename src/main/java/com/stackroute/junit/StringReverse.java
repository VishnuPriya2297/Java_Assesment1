package main.java.com.stackroute.junit;
/*
program to generate reverse of  a string
 */
public class StringReverse {

    public String StringReverseWithoutStringBuffer(String str)
    {
        int length=str.length();
        String reverse=" ";
        for(int i=length-1;i>=0;i--)
        {
            reverse = reverse + str.charAt(i);//addinh the charectres in the reverse order

        }
        return reverse;//returning the final result
    }
}
