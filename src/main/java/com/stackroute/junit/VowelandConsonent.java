package main.java.com.stackroute.junit;
public class VowelandConsonent {

    public  String CheckConsonantorVowel(String c)
    {
        String str="";
        String text;
        text = c.toUpperCase();
        System.out.println(text);
        int length = text.length();
        for (int i = 0; i < length; i++) {
            if (Character.isLetter(text.charAt(i))) {
                if(text.charAt(i)== 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U')
                    str=str+"Vowel";
                else
                    str=str+"consonant";

            }
            else
                return "not a letter";

        }
        return str;

    }
}
