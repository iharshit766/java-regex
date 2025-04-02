package org.bridgelabz.regex;

import java.util.regex.Pattern;

public class HexColorValidator {
    public static boolean isValidColor(String color) {
        String pattern= "^[#][0-9a-fA-F]{6}$";
        return Pattern.matches(pattern, color);
    }
    public static void main(String[] args) {
        System.out.println(isValidColor("#ff0000"));
        System.out.println(isValidColor("#0fff00"));
        System.out.println(isValidColor("#0000ff"));
        System.out.println(isValidColor("#ff00ff"));
        System.out.println(isValidColor("0000ff#"));
    }
}
