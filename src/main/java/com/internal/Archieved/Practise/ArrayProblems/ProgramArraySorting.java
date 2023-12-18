package com.internal.Archieved.Practise.ArrayProblems;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import java.util.Arrays;

public class ProgramArraySorting {

    public static int [] arraySortUsingBubbleSort(@NotNull int [] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i]>inputArray[j]){
                    int temp = inputArray[j];
                    inputArray[j]= inputArray[i];
                    inputArray[i]=temp;
                }
            }
        }
        return inputArray;
    }
    public static void main(String[] args) {
        int [] unsortedArray ={3,7,1,5,2,4} ;
        Arrays.stream(ProgramArraySorting.arraySortUsingBubbleSort(unsortedArray)).boxed().forEach(System.out::println);
    }
}
