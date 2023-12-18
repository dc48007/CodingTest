package com.internal.Archieved.Practise.ArrayProblems;
import java.util.Arrays;

public class ProgramShiftingOfArrays {


    // 1 3  5   7 9 2
    public static void shiftElementToRightPosition(int[] arr) {
        int length = arr.length;
        if (length == 0 || length < 2) {
            System.out.println("Array does not have any enough eles to shift or doesn't have enough eles");
            return;
        }
        int lastElement = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (arr[i] > lastElement) {
                int temp = arr[i];
                arr[i] = lastElement;
                arr[i + 1] = temp;
            }
        }
        System.out.println("Elements: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2};
        shiftElementToRightPosition(arr);
    }
}
