package week08;

import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        //length -> min 8
        //lowercase and uppercase
        //at least 1 digit
        //at least 1 special char

        String letters = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "!@#$%^&*";

        //5 lowercase, 1 uppercase, 1 digit, 1 special

        String password = "";
        password += letters.charAt(4);
        password += letters.charAt(9);
        password += letters.charAt(15);
        password += letters.charAt(0);
        password += letters.charAt(16);

        System.out.println("password = " + password);

        password += letters.toUpperCase().charAt(22);
        password += digits.charAt(5);
        password += special.charAt(2);

        System.out.println("password = " + password);

        System.out.println("==================================");

        Random random = new Random();
        System.out.println(random.nextInt(26));//0-25
        int len = letters.length();
        System.out.println("len = " + len);
        
        String randomPwd = "";
        for (int i = 1; i <= 5 ; i++) {
            randomPwd += letters.charAt(random.nextInt(26));
        }

        randomPwd += letters.toUpperCase().charAt(random.nextInt(26));
        randomPwd += digits.charAt(random.nextInt(10));
        randomPwd += special.charAt(random.nextInt(8));

        System.out.println("randomPwd = " + randomPwd);

    }
}
