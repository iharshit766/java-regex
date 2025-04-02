package org.bridgelabz.regex;

import java.util.regex.*;

public class UserNameValidator {
    public static boolean isValidUsername(String username) {
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(pattern, username);
    }

    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123"));  // true
        System.out.println(isValidUsername("123user"));   // false
        System.out.println(isValidUsername("us"));        // false
        System.out.println(isValidUsername("valid_name"));// true
        System.out.println(isValidUsername("toolongusername123")); // false
    }
}
