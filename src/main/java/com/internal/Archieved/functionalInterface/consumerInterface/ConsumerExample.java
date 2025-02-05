package com.internal.Archieved.functionalInterface.consumerInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {






    public static void main(String[] args) {
        Consumer<String> print = message -> System.out.println("Printing :"+ message);
        Consumer<String> log = message-> System.out.println("logging :"+message);

        List<String> names = Arrays.asList("Deepak","Manish","Anurag");
        names.forEach(print);
        names.forEach(print.andThen(log));
    }
}
