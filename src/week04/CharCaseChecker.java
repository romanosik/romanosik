package week04;
/*
    ch = 'A'
    if ch is uppercase: "Uppercase letter"
        ch >= 'A' && ch <= 'Z'
    if ch is lowercase: "Lowercase letter"
    else: "Not a letter"
 */
public class CharCaseChecker {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') { //A-Z range
            System.out.println("Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Not a letter - " + ch);
        }

    }
}
