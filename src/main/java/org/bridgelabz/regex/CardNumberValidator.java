package org.bridgelabz.regex;

public class CardNumberValidator {
    public static boolean isValidCard(String cardNumber) {
        return cardNumber.matches("^4[0-9]{15}$") || cardNumber.matches("^5[0-9]{15}$");
    }

    public static void main(String[] args) {
        String[] testCards = {
                "4123456789012345", // Valid Visa
                "5123456789012345", // Valid MasterCard
                "6123456789012345", // Invalid (Does not start with 4 or 5)
                "41234567890123",   // Invalid (Not 16 digits)
                "5123abcd89012345"  // Invalid (Contains non-numeric characters)
        };

        for (String card : testCards) {
            System.out.println(card + " -> " + (isValidCard(card) ? "Valid" : "Invalid"));
        }
    }
}
