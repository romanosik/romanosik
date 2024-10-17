package week06.methods_with_return;

public class Converter {

    public static void main(String[] args) {
        System.out.println(convertDollars("EUR", 100));
        System.out.println(convertDollars("TRY", 120.5));
        System.out.println(convertDollars("JPY", 321.0));
        System.out.println(convertDollars("ABC", 50.0));
    }

    /*
    	Use the following sample rates for currency conversions
	•	1 USD = 0.93 EUR
	•	1 USD = 142.29 JPY
	•	1 USD = 27.01 TRY (Turkish Lira)
	•	1 USD = 1,320.12 KRW
	•	1 USD = 83.17 INR (Indian Rupee)

	convertDollars("EUR", 100); ->
     */
    public static double convertDollars(String currency, double USDAmount) {
        double convertedAmount = 0.0;

        switch (currency) {
            case "EUR" -> convertedAmount = USDAmount * 0.93;
            case "JPY" -> convertedAmount = USDAmount * 142.29;
            case "TRY" -> convertedAmount = USDAmount * 27.01;
            case "KRW" -> convertedAmount = USDAmount * 1_320.12;
            case "INR" -> convertedAmount = USDAmount * 83.17;
            default -> System.out.println("Conversion not available to " + currency);
        }

        return convertedAmount;
    }

}

/*
double convertedAmount = 0.0;

switch (currency) {
    case "EUR": convertedAmount = USDAmount * 0.93; break;
    case "JPY":
        convertedAmount = USDAmount * 142.29;
        break;
    case "TRY":
        convertedAmount = USDAmount * 27.01;
        break;
    case "KRW":
        convertedAmount = USDAmount * 1_320.12;
        break;
    case "INR":
        convertedAmount = USDAmount * 83.17;
        break;
    default:
        System.out.println("Conversion not available to " + currency);
        break;
}
 */