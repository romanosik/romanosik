package week08;
/*
A url is valid if it has "www." in the beginning and has either .com, .org, .edu. or .gov at the end

isValidUrl("www.google.com") => true
isValidUrl("") => false
isValidUrl("etsy.io") => false

 */
public class ValidUrl {

    public static void main(String[] args) {
        System.out.println(isValidUrl("www.google.com"));
        System.out.println(isValidUrl(""));
        System.out.println(isValidUrl("etsy.io"));
        System.out.println(isValidUrl("www.com"));
    }

    public static boolean isValidUrl(String url) {
        if (url.isEmpty()) {
            return false;
        }

        if (url.startsWith("www.") && (url.endsWith(".com") ||
                url.endsWith(".org") || url.endsWith(".edu") || url.endsWith(".gov"))) {
            return true;
        }

        return false;

    }
}
