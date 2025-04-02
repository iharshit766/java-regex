package org.bridgelabz.regex;

import java.util.regex.Pattern;

public class LicensePlateValidator {
    public static boolean isValidplate(String licensePlate) {
        String pattern = "^[A-Z]{2}[1-9]{4}$";
        return Pattern.matches(pattern, licensePlate);
    }
    public static void main(String[] args) {
        System.out.println(isValidplate("AB1234")); //true
        System.out.println(isValidplate("ABC124")); //false
        System.out.println(isValidplate("AB12345")); //false
        System.out.println(isValidplate("1234AB")); //false
        System.out.println(isValidplate("A1234"));  //false
    }
}
