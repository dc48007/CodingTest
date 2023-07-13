package functionalInterface;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interviewproblem {

/*
[1, 3, 5]


        [2, 4,  5, 6, 1]


    display the common values

    display the uncommon values

*/




    public static void main(String[] args) {

        int x[] = {1,3,5};
        int y[]= {2, 4,  5, 6, 1};

        displayCommonAndUncommonValues(x,y);

    }
//Integer.valueof(int)
    private static void displayCommonAndUncommonValues(int[] arr1, int[] arr2) {
        Set<Integer> firstArray = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> secondArray = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        for (Integer i : firstArray) {
            if (secondArray.add(i)) {
                System.out.println("uncommon element present in second array: " + i);
            } else {
                System.out.println("common element present in second array: " + i);
            }
        }
    }
}
