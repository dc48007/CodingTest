package com.internal.Archieved.functionalInterface.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UpdateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> addTenconsumer = number-> System.out.println(number+10);
        numbers.forEach(addTenconsumer);
        numbers.replaceAll(n->n*10);
        System.out.println("updated list: "+numbers);

    }
}
