package com.internal.Archieved.Practise;
import org.codehaus.groovy.ast.stmt.WhileStatement;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ProgramToFindNonChar {

    public static void findNonChar(String inp) {
        isGivenCharValid(inp);
    }

    public static void isGivenCharValid(String string) {
        String regex = "[\\d[\\W]]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void reverseWordsInString(String inputString) {
        String[] words = inputString.split("\\s+");
        String result = Arrays.stream(words).map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));
        System.out.println(result);
    }

    public static void main(String[] args) {
        String input = "dsdj4j3l%";
        String input1 = "This is my bag";
        reverseWordsInString(input1);
        findNonChar(input);
    }
}
