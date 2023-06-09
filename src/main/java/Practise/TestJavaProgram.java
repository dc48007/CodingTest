package Practise;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestJavaProgram {

    public  static  int[] mergeArrays(int arr1[], int arr2[]) {
        int resultArray[] = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, resultArray, 0, arr1.length);
        System.arraycopy(arr2, 0, resultArray, arr1.length, arr2.length);
        return resultArray;
    }


    public static void main(String[] args) {
        int mergedArray[] = mergeArrays(new int[] {6, 9, 12, 42, 7, 5}, new int[] {45, 6, 42, 5, 19, 27});
        System.out.println(mergedArray.length);
        Map<Integer, Long> countMap = Arrays.stream(mergedArray).boxed().collect(Collectors.groupingBy(w-> w,Collectors.counting()));
       // HashMap<Integer, Integer> countMap = new HashMap<>();
     /*   for (Integer i : newArray) {
                countMap.put(i, countMap.getOrDefault(i, 0)+1);
        }
     */


        List<Integer> uncommonNumber = countMap.entrySet().stream().filter(f -> f.getValue() == 1).map(m -> m.getKey()).collect(Collectors.toList());
        uncommonNumber.forEach(f -> System.out.print(f + " "));
    }
}
