package org.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebpageExtractor {

    public static void isWebpage(String text){
        Pattern pattern= Pattern.compile("http(s)?://(www\\.)?[A-Za-z]+\\.[A-Za-z]{2,}");
        Matcher matcher= pattern.matcher(text);


        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }

    public static void main(String args[]){
        String text="Visit https://www.google.com and http://example.org for more info.";
        isWebpage(text);
    }
    }

