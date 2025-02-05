package com.internal.Archieved.Java11;

public class finalVsImmutability {

    public static void main(String[] args) {

        final String s = "Hello";
        String s1 = s.concat(" world");
        System.out.println(s);
        System.out.println(s1);

        final StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world");
        System.out.println("String Builder value is: "+ stringBuilder);

    }
}
