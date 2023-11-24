import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter_Q2 {
    private static final HashMap<String, Double> currencyRates = new HashMap<>();

    static {
        currencyRates.put("USD", 1.0); // USD is the default base currency with a rate of 1.0
        currencyRates.put("PKR", 236.0);
        currencyRates.put("Pound", 0.88);
        currencyRates.put("Dirham", 3.67);
        currencyRates.put("INR", 79.0);
        currencyRates.put("BDT", 104.0);
        currencyRates.put("JPY", 142.0);
    }

    public static double convert(String baseCurrency, double amount, String targetCurrency) {
        if (currencyRates.containsKey(baseCurrency) && currencyRates.containsKey(targetCurrency)) {
            double baseRate = currencyRates.get(baseCurrency);
            double targetRate = currencyRates.get(targetCurrency);
            double convertedAmount = (amount / baseRate) * targetRate;
            return convertedAmount;
        } else {
            System.out.println("Invalid currency codes.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the target currency code: ");
        String targetCurrency = scanner.next();

        double convertedAmount = convert("USD", amount, targetCurrency);
        System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}
