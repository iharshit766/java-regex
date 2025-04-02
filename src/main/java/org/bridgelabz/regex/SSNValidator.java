package org.bridgelabz.regex;

import java.util.regex.*;

public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        return ssn.matches("(?!000)\\d{3}-(?!00)\\d{2}-(?!0000)\\d{4}");
    }

    public static void main(String[] args) {
        String[] testSSNs = {
                "123-45-6789",
                "123456789",
                "12-345-6789",
                "123-456-789",
                "000-65-4321"
        };

        for (String ssn : testSSNs) {
            System.out.println(ssn + " -> " + (isValidSSN(ssn) ? "Valid" : "Invalid"));
        }
    }
}
