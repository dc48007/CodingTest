package com.internal.Archieved.Practise.ArrayProblems;
import java.util.Arrays;

public class ProgramArrayRotation {


    /**
     * Rotate an array arr of size n by d elements to the left:
     * Reverse the elements from index 0 to d-1.
     * Reverse the elements from index d to n-1.
     * Reverse the entire array from index 0 to n-1.
     *
     * Reverse Algorithm for Right Rotation:
     *
     * Rotate an array arr of size n by d elements to the right:
     * Reverse the elements from index n-d to n-1.
     * Reverse the elements from index 0 to n-d-1.
     * Reverse the entire array from index 0 to n-1.
     * @param args
     */

    public static void main(String[] args) {

        int n[] = {1,4,7,8,2};
        rotateLeftArray(n, 2);
        Arrays.stream(n).forEach(System.out::print);
    }

    private static void rotateLeftArray(int[] givenArray, int i) {
        int length = givenArray.length;
        reverseArray(givenArray, 0, i - 1);
        reverseArray(givenArray, i, length - 1);
        reverseArray(givenArray, 0, length-1);
    }

    private static void reverseArray(int[] givenArray, int start, int end) {
        while (start<end){
            int temp = givenArray[start];
            givenArray[start] = givenArray[end];
            givenArray[end] = temp;
            start++;
            end--;
        }
    }
}
