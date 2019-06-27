package main.java.com.stackroute.junit;
public class StringReverse {

    public String StringReverseWithoutStringBuffer(String str)
    {
        int length=str.length();
        String reverse=" ";
        for(int i=length-1;i>=0;i--)
        {
           // for(int j=0;j<length;j++)
            //{
            //reverse.charAt(i)=str.charAt(i);
           // System.out.println(str.charAt(i));
            //}
            reverse = reverse + str.charAt(i);

        }
        return reverse;
    }
}
