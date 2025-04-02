package org.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
    public static void findDate(String text){
        Pattern pattern= Pattern.compile("([0-2][0-9]|3[01])/([0][0-9]|1[0-2])/[0-9]{4}");
        Matcher matcher= pattern.matcher(text);


        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
    public static void main(String args[]){
        String text="the event is to be on 19/02/2024 instead of 29/01/2025";

        findDate(text);
    }
}
