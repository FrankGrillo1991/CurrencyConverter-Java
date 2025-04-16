import java.util.Scanner;

public class CurrencyConverter {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded exchange rates (example: 1 USD = x in other currencies)
        double usdToEur = 0.91;
        double usdToInr = 83.30;
        double usdToGbp = 0.78;

        System.out.println("Currency Converter");
        System.out.print("Enter amount in USD: ");
        double amount = scanner.nextDouble();

        System.out.println("Convert to: \n1. EUR\n2. INR\n3. GBP");
        int choice = scanner.nextInt();

        double convertedAmount = 0;
        String targetCurrency = "";

        switch (choice) {
            case 1:
                convertedAmount = amount * usdToEur;
                targetCurrency = "EUR";
                break;
            case 2:
                convertedAmount = amount * usdToInr;
                targetCurrency = "INR";
                break;
            case 3:
                convertedAmount = amount * usdToGbp;
                targetCurrency = "GPB";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
        System.out.printf("%.2f USD = %.2f %s\n", amount, convertedAmount, targetCurrency);
    }
}