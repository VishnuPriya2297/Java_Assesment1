package main.java.com.stackroute.junit;
/*
checking whether a number is even or ofdd and lies between 20 and 30
 */

public class EvenOdd {

public  String checkWhethertheNumberIsEvenOrOdd(int num)// code for checking if the number is even or odd
{
    if((num>=20)&&(num<=30))
    {
        if(num%2==0)
            return "Jerry";

        else
            return "Tom";
    }
    else
        return "Error";

}
}
