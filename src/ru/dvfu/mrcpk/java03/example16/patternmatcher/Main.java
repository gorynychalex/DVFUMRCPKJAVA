package ru.dvfu.mrcpk.java03.example16.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern & Matcher
 * https://javarush.ru/groups/posts/regulyarnye-vyrazheniya-v-java
 */
public class Main {
    public static void main(String[] args) {
        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("matcher.start(): " + matcher.start());
            System.out.println("matcher.end(): " + matcher.end());
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
