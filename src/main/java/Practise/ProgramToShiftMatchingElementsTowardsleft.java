package Practise;

import java.util.Arrays;

public class ProgramToShiftMatchingElementsTowardsleft {



    public static void main(String[] args) {
        int[] givenArray = new int[] {7, 1, 0, 8, 3, 0, 4, 0, 5, 0};
        shiftMatchingToLeft(givenArray);
        Arrays.stream(givenArray).forEach(System.out::print);
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
    }

