import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int number = scanner.nextInt(); // Input number

        // Check if the number is a probable topper number
        boolean isProbableTopper = isProbableTopperNumber(number);

        // Print the result
        System.out.println(isProbableTopper);

        // Close the scanner
        scanner.close();
    }

    static boolean isProbableTopperNumber(int number) {
        int evenSum = 0;
        int oddSum = 0;

        // Convert the number to a string to process each digit
        String numberStr = Integer.toString(number);

        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        // Check if the sum of odd digits is equal to the sum of even digits
        return oddSum == evenSum;
    }
}
