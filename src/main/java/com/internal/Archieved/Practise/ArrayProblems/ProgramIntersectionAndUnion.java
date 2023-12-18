package com.internal.Archieved.Practise.ArrayProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ProgramIntersectionAndUnion {

    public static void findIntersectionOfTwoArrays(int[] array1, int[] array2) {
        ArrayList<Integer> resultant = new ArrayList<>();
        HashSet<Integer> hashSet1;
        HashSet<Integer> hashSet2;
        if (array1.length == 0) {
            System.out.println("array1 does not have ele");
            return;
        }
        if (array2.length == 0) {
            System.out.println("array2 does not have ele");
            return;
        }
        hashSet1 = (HashSet<Integer>) Arrays.stream(array1).boxed().collect(Collectors.toSet());
        hashSet2 = (HashSet<Integer>) Arrays.stream(array2).boxed().collect(Collectors.toSet());
        for (Integer el : hashSet1) {
            if (!hashSet2.add(el)) {
                resultant.add(el);
            }
        }
        if(resultant.isEmpty()){
            System.out.println("No elements found under intersection");
        }else {
            System.out.println("Intersaction of elements: "+resultant);
        }
    }

    public static void main(String[] args) {
        int[] ar = {2};
        int[] ar2 = { 1,3};
        findIntersectionOfTwoArrays(ar, ar2);
    }
}
