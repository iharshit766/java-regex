package org.bridgelabz.regex;

import java.util.regex.*;
import java.util.*;

public class CurrencyExtractor {
    public static void extractCurrency(String text) {
        Pattern pattern = Pattern.compile("\\$?\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        System.out.println(String.join(", ", currencyValues));
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        extractCurrency(text);
    }
}
