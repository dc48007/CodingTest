package com.internal.Archieved.functionalInterface;
import java.util.function.UnaryOperator;

public class PractiseUnary {




    public static void main(String[] args) {
        UnaryOperator<String> result = UnaryOperator.identity();
        System.out.println(result.apply("ddeepak"));
    }


}
