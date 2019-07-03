package main.java.com.stackroute.junit;
/*
program to sort the numbers and add the numbers in even positions and comparing it with 15
 */
import java.util.Arrays;
public class SortandSum
{
    public  String sortDecreasingOrderAndPrintSumOfEvenNumbers(String number)
    {
        int sum=0;
        String str="";
        int length= number.length();
        char tempArray[] = number.toCharArray();
        Arrays.sort(tempArray);//using sort method to sort the arrays
        String original = new String(tempArray);
        StringBuilder stringBuilder = new StringBuilder(original);
        original = stringBuilder.reverse().toString();
        str=str.concat("Sorted number in non-increasing order ").concat(original);
        for(int i=0;i<length;i++)//calculating the sum
        {
            int j = Character.getNumericValue(original.charAt(i));
            if(j%2==0)
            {
                sum=sum+j;
            }
        }

        str=str+"sum of even numbers is "+sum;//calculating the sum
        if(sum>15)
          return  str=str+" true";
        else
            return str=str+" false";


    }

}