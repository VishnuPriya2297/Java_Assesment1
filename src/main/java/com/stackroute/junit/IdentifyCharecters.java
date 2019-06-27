package main.java.com.stackroute.junit;

public class IdentifyCharecters {
    public String  checkInput(char ch)//code to check the type of charecter
    {
        if ((ch >= 97) && (ch <= 122))
            return "Lower case letter";
        else if ((ch >= 65) && (ch <= 90))
           return "Capital letter";
        else if ((ch >= 48) && (ch <= 57))
            return "Digit";
        else if((ch>0 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<=96) ||(ch>=123 && ch<=127))
            return "Special symbols";
        return "Error";
    }

}
