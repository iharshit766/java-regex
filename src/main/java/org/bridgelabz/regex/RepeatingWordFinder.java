package org.bridgelabz.regex;

import java.util.regex.*;
import java.util.*;

public class RepeatingWordFinder {
    public static void findRepeatingWords(String text) {
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> wordCount = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group().toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> repeatingWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", repeatingWords));
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        findRepeatingWords(text);
    }
}
