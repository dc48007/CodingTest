package com.internal.Archieved.Practise.ArrayProblems;
import java.util.Arrays;

public class ProgramToEnsureStringHaveAlphabets {


    public static void ensureStringHaveAlphabets(String givenString) {
        if (givenString.isEmpty()) {
            System.out.println("Given string is empty");
        }
        String[] s = givenString.split("[a-zA-Z]+");
        Arrays.stream(s).forEach(System.out::println);
    }
    public static void main(String[] args) {
        ensureStringHaveAlphabets("deepak1");
    }
}
