package main.test.com.stackroute.junit;

public class StringRepeat {
    public String repeat(String str1,int num1) {


        String str;
        int length=str1.length();
        //System.out.print(str1);
        //to print the last n words n times
        for (int j = 0; j < num1; j++) {
            for (int i = str1.length() - num1; i < length; i++) {
                //   System.out.print(str1.charAt(i));

                str1=str1+ str1.charAt(i);
            }
        }
        for(int k=0;k<str1.length();k++)
        {
            if(str1.charAt(k)>='a'&&str1.charAt(k)<='z'||str1.charAt(k)>='A'&&str1.charAt(k)<='Z')
            {
                return str1;
            }
            //else return "it is a number";
        }
        return "it is a number";
    }
}
