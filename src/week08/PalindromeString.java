package week08;

import java.util.Locale;

public class PalindromeString {
    /*
    1) reverse the string
    2) compare if original and reversed equal
     */
    public static void main(String[] args) {
        String str = "Race car";
        str = str.toLowerCase();
        str = str.replace(" ","");
        
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("reversed = " + reversed);

        if (str.equals(reversed)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }

        System.out.println("===============");

        String initial = "ci vic";
        initial = initial.toLowerCase().replace(" ","");

        StringBuilder stb = new StringBuilder(initial);
        if (stb.reverse().toString().equals(initial)) {
            System.out.println("PALINDROME");
        } else {
            System.out.println("NOT PALINDROME");
        }
        
    }
}
