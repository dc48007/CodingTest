package com.internal.Archieved.functionalInterface.BiFunction;

import java.util.function.BiFunction;

public class CombineStrings {

    public static <T, U, R> R performOperation(BiFunction<T,U,R> operation, T t, U u){
       return operation.apply(t, u);
    }

    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (str1, str2)->str1+str2;
        System.out.println(CombineStrings.performOperation(concat, "Hello", "World"));
        System.out.println(CombineStrings.performOperation((Integer i,Integer j)-> i*j, 2, 3));
        System.out.println(CombineStrings.performOperation((Double basePrice, Double tax )->basePrice+(basePrice*tax/100), 100.00, 18.9));
    }
}
