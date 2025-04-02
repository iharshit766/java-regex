package org.bridgelabz.regex;

public class BadWordExtractor {
    public static void badWord(String text){
        System.out.println(text.replaceAll("(?i)damn|stupid","****"));

    }
    public static void main(String args[]){
        String text="Damn this is a Stupid thing";
        badWord(text);
    }
}

