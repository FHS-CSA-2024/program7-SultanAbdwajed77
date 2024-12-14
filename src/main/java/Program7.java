package src.main.java;

import java.util.Scanner;

public class Program7{
    // Conversion rates
    public static final int KLEVIN_TO_SCHRUTE = 20;
    public static final int STANLEY_NICKEL_TO_KLEVIN = 12;
    public static final int STANLEY_NICKEL_TO_SCHRUTE = 100; // 100 stanley-nickels to 1 schrute-buck

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // User input for schrute-bucks, klevins, and stanley-nickels
        System.out.print("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();

        System.out.print("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.print("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();

        // Convert and display the result
        Program7 tester = new Program7();
        double result = tester.convertMoney(schruteBucks, stanleyNickels, klevins);
        System.out.printf("Decimal schrute-bucks = $%.2f\n", result);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }

    // Function to convert the old currency format to decimal schrute-bucks
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins) {
        // Convert klevins to schrute-bucks
        double klevinsInSchrute = klevins / (double) KLEVIN_TO_SCHRUTE;

        // Convert stanley-nickels to schrute-bucks
        double stanleyNickelsInSchrute = stanleyNickels / (double) STANLEY_NICKEL_TO_SCHRUTE;

        // Convert the total value
        return schruteBucks + klevinsInSchrute + stanleyNickelsInSchrute;
    }
}
