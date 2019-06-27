package main.java.com.stackroute.junit;
public class Palindrome {


    public  String CheckforPalindrome(int n)//
    {

        int m = n;
        int reverse = 0;
        int sum = 0;
        int check;

        while (n > 0) {//generating the reverse of the number

            reverse = reverse * 10;
            reverse = reverse + (n % 10);
            n = n / 10;
        }
        if (m == reverse) {//comparing the numbers

            while(reverse>0)//calculating the summ of even numbers
            {
                check=reverse%10;
                if(check%2==0)
                    sum=sum+check;
                reverse=reverse/10;

            }
            if(sum>25)
            return "is a palindrome and the sum is greater than 25";
           else
            {
               return "is a palindrome and the sum is not greater than 25";
            }
        }
        else {
            return "is not a palindrome";
        }
    }
}
