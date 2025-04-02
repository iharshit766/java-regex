package org.bridgelabz.regex;

import java.util.regex.*;
import java.util.*;

public class LanguageExtractor {
    public static void extractLanguages(String text) {
        Pattern pattern = Pattern.compile("\\b(JavaScript|Java|Python|Go|C\\+\\+|C|Ruby|Swift|Kotlin|PHP)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        System.out.println(String.join(", ", languages));
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        extractLanguages(text);
    }
}
