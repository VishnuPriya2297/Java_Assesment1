package main.java.com.stackroute.junit;
public class Iteration {

    public String Output(int num)//code for printing the pattern
    {

        String str="";
        if(((num>=97)&&(num<=122)||((num>=65)&&(num<=90))))
            return "Error";


        for(int temp=1;temp<=num;temp++)
        {
            for(int j=temp;j>0;j--)
            {
              str=str+temp;
            }
        }
                return str;
    }
}