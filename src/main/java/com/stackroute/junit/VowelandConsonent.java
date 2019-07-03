package main.java.com.stackroute.junit;
/*
program to check each charecter in a string to find out if it is a vowel or a consonant
 */
public class VowelandConsonent {

    public  String CheckConsonantorVowel(String c)
    {
        String str="";
        String text;
        text = c.toUpperCase();//converting all the charecters into uppercase
        System.out.println(text);
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (Character.isLetter(text.charAt(i))) {
                if(text.charAt(i)== 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U')//checking for the vowels
                    str=str+"Vowel";
                else
                    str=str+"consonant";//if not a vowel concatante with consonant

            }
            else
                return "not a letter";//if it is not a letter returning error message

        }
        return str;//returning the final string

    }
}
