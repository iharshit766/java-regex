package org.bridgelabz.regex;

import java.util.regex.*;

public class CapitalExtractor {
    public static void isUpper(String text){
    Pattern pattern= Pattern.compile("[A-Z][a-zA-Z]*");
    Matcher matcher= pattern.matcher(text);

    while (matcher.find()){
        System.out.println(matcher.group());
    }
    }
    public static void main(String args[]){
        isUpper("Hi my Name is Harshit");
    }
}
