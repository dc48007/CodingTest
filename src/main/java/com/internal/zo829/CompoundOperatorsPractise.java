package com.internal.zo829;

public class CompoundOperatorsPractise {

    public static void main(String[] args) {

        long lang = 2;


        //java: incompatible types: possible lossy conversion from double to long
        // Not Compile
       //lang = lang-1.0;

        //compound Operators automatically do the casting
        lang -=1.0;
        System.out.println(lang);



    }
}
