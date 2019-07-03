package main.java.com.stackroute.junit;
/*
program to return the sum of all the integers
 */

public class SumOfIntegers
{
        //method that adds all the integers
        public static String printLoop(int num)
        {
                String result = "";
                Integer.parseInt(String.valueOf(num));
                for (int i = 0; i <= num; i++)
                {
                        for (int j = 0; j < i; j++)
                        {
                                result = result + i;
                        }
                        }
                        return result;
                }


        }

