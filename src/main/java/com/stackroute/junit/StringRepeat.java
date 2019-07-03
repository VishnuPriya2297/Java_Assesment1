package main.test.com.stackroute.junit;
/*
program to repeat the last n charecters for n times
 */

public class StringRepeat {
    public String repeat(String str1,int num1) {


        String str;
        int length=str1.length();

        for (int j = 0; j < num1; j++) {
            for (int i = str1.length() - num1; i < length; i++) {


                str1=str1+ str1.charAt(i);//str1 contains all the charecters leaving the last n charecters
            }
        }
        for(int k=0;k<str1.length();k++)
        {
            if(str1.charAt(k)>='a'&&str1.charAt(k)<='z'||str1.charAt(k)>='A'&&str1.charAt(k)<='Z')
            {
                return str1;
            }

        }
        return "it is a number";//returning the error message
    }
}
