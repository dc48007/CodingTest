package com.internal.Archieved.Practise;

import java.util.*;

public class ProgramToShiftMatchingElementsTowardsleft {



    public static void main(String[] args) {
        int[] givenArray = new int[] {7, 1, 0, 8, 3, 0, 4, 0, 5, 7, 1, 0};

        ShiftRepeatingElToLeft(givenArray);
        int[] shiftedArray = shiftRepetitiveElementsLeft(givenArray);

        System.out.println("Original Array: " + Arrays.toString(givenArray));
        System.out.println("Shifted Array: " + Arrays.toString(shiftedArray));
    }

    private static void shiftMatchingToLeft(int array[]) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                if (array[j] == 0) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
        public static int[] shiftRepetitiveElementsLeft ( int[] arr){
            List<Integer> nonRepetitive = new ArrayList<>();
            Set<Integer> visited = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (!visited.contains(arr[i])) {
                    nonRepetitive.add(arr[i]);
                    visited.add(arr[i]);
                }
            }
            return nonRepetitive.stream().mapToInt(i -> i).toArray();
        }

        public static void ShiftRepeatingElToLeft(int g[]){
        List<Integer> array =new ArrayList<>();
            for (int i = 0; i < g.length; i++) {
                if(!array.contains(g[i])){
                    array.add(g[i]);
                }else {
                    int index = array.indexOf(g[i]);
                    array.add(index+1, g[i]);
                }
            }
            array.stream().forEach(System.out::println);

        }

    }




