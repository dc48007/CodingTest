package Practise;
public class ProgramSorting {

    /**
     * [3,2,5,1,9]
     * <p>
     * 2,3,5,1,9
     *
     *
     * @param givenarray
     * @return
     */
    public static int[] bubbleSort(int[] givenarray) {
        int length = givenarray.length;
        boolean swap = false;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (givenarray[j] > givenarray[j + 1]) {
                    int temp = givenarray[j];
                    givenarray[j] = givenarray[j + 1];
                    givenarray[j + 1] = temp;
                    swap = true;
                }
            }
        }
        if (swap == false) {
            System.out.println("-------array is already sorted-----");
        }
        return givenarray;
    }

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
        int[] array = {5, 2, 8, 12, 3};


        printArray(array);
        arrangeArrays(array);
        printArray(array);

        printArray(new int[] {0, 2, 3, 6, 81, 91, 1});
       int[] arrangedArray =  arrangedTheLastElement(new int[] {0, 2, 3, 6, 81, 91, 1});
        printArray(arrangedArray);
    }


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



    public static void arrangeArrays(int[] givenArray) {
        int length = givenArray.length;
        for (int j = 0; j < length - 1; j++) {
            for (int i = 0; i < length - 1 - j; i++) {
                if (givenArray[i] > givenArray[i + 1]) {
                    int temp = givenArray[i];
                    givenArray[i] = givenArray[i + 1];
                    givenArray[i + 1] = temp;
                }
            }
        }
    }


}
