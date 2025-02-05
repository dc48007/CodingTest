package com.internal.Archieved.Practise.questions;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class lambdaExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,3,4,5,6,12);
        OptionalDouble intStreamDouble = intStream.average();
        System.out.println(intStreamDouble.getAsDouble());
    }
}
