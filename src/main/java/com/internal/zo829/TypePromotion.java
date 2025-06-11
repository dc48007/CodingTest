package com.internal.zo829;

public class TypePromotion {


    public static void main(String[] args) {
        new TypePromotion().integarArithmaticPromotion();
        new TypePromotion().largeDataTypesPromotion();
    }


    public void largeDataTypesPromotion(){
        int s = 6;
        long y =7;
        //java: incompatible types: possible lossy conversion from long to int
        //int r= s+y;
        long r= s+y;
        System.out.println(r);
    }


    public void integarArithmaticPromotion(){
        short s = 6;
        short y =7;
        //java: incompatible types: possible lossy conversion from int to short
        //short r = s+y;
        int r= s+y;
        System.out.println(r);
    }


}
