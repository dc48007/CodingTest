package com.internal.Archieved.functionalInterface;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ComparatorExample {



    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }
}
