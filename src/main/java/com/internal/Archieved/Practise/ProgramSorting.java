package com.internal.Archieved.Practise;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramSorting {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(array, low, high);
            // Recursively sort the left and right sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];
        // Index of the smaller element
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i+1] and array[high] (pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("T shirt size: "+ printTshirtSize(40));;
        int[] array = {5,6,7,0,4};
        replaceArrayElementsWithLargestRightMostElement(array);
        printArray(array);


        findSmallestAndLargestElement(array);
        printArray(array);

        arrangeArrays(array);
        printArray(array);

        printArray(new int[] {0, 2, 3, 6, 81, 91, 1});
       int[] arrangedArray =  arrangedTheLastElement(new int[] {0, 2, 3, 6, 81, 91, 1});
        printArray(arrangedArray);
    }


    /**
     * place last element of array at right position
     * {1,4,6,7,9,3}
     * @param givenArray
     * @return int[]
     */
    public static int[] arrangedTheLastElement(int[] givenArray) {
        int length = givenArray.length;
        int lastElement = givenArray[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (lastElement < givenArray[i]) {
                givenArray[i + 1] = givenArray[i];
                givenArray[i] = lastElement;
            } else {
                givenArray[i + 1] = lastElement;
                break;
            }
        }
        return givenArray;
    }

    /**
     * {3,7,1,5,9}
     * @param givenarray
     */

    public static void findSmallestAndLargestElement(int[] givenarray) {
        // one way
        int length = givenarray.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> sortedList = Arrays.stream(givenarray).boxed().sorted().collect(Collectors.toList());
        System.out.println("Largest Element : " + sortedList.get(length - 1));
        System.out.println("Smallest Element : " + sortedList.get(0));
        //second way
        for (int i : givenarray) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        System.out.println("Largest Element : " + arrayList.get(length - 1));
        System.out.println("Smallest Element : " + arrayList.get(0));
        // third way
    }



    /**
     * unsorted array: {2,0,8}
     * sorted array: {}
     * @param givenArray
     */
    public static void arrangeArrays(int[] givenArray) {
        int length = givenArray.length;
        for (int j = 0; j < length; j++) {
            for (int i = 0; i < length - 1 - j; i++) {
                if (givenArray[i] > givenArray[i + 1]) {
                    int temp = givenArray[i];
                    givenArray[i] = givenArray[i + 1];
                    givenArray[i + 1] = temp;
                }
            }
        }
    }


    /**
     *  [-1, -3, 3, 2, 8 ,6]
     *
     *  output -  [8, 8, 8, 8, 6, 0].
     * @param givenArray
     */
    public static void replaceArrayElementsWithLargestRightMostElement(int[] givenArray){
        int length = givenArray.length;

        int lefttemp;
        int righttemp = givenArray[length-1];
        for (int i = length-2; i >=0; i--) {
            lefttemp = givenArray [i];
            givenArray[i] = righttemp;
            if(righttemp< lefttemp){
                righttemp = lefttemp;
            }
        }
    }

    private static String printTshirtSize(int number) {
        String size;
        switch (number) {
            case 29:
                return "small";
            case 40:
                return "medium";
            default:
                size = "Size does not exist";
        }
        return size;
    }




}
