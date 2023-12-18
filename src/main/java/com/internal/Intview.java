package com.internal;
import java.sql.SQLOutput;
import java.util.*;

public class Intview {

    //find out second largest number in array
    public static void findSecondLargestNumberInArray(int[] givenArray) {
        if (givenArray.length < 2) {
            System.out.println("Array does not Elements more than one");
        } else {
            ArrayList<Integer> arrayList = new ArrayList<>();
            Arrays.sort(givenArray);
            int length = givenArray.length;
            for (int i = 0; i < length; i++) {
                if (!arrayList.contains(givenArray[i])) {
                    arrayList.add(givenArray[i]);
                }
            }
            if (arrayList.size() > 1) {
                System.out.println(arrayList.get(arrayList.size() - 2));
            } else {
                System.out.println("Array contains duplicate Elements: " + Arrays.toString(givenArray));
            }
        }
    }

    public static void main(String[] args) {
        int[] given = {};
        findSecondLargestNumberInArray(given);
    }
}
