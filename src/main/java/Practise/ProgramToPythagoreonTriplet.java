package Practise;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramToPythagoreonTriplet {






    public static void main(String[] args) {

        int array[] = {3,4,5, 6,8,9};
        List<int []> givenArray = findTripets(array);
        List<int[]>expectedTriplets = Arrays.asList(new int[]{3,4,5});
        Assert.assertTrue(Arrays.deepEquals(givenArray.toArray(),expectedTriplets.toArray()));
        System.out.println("========================print hoga=================");
    }

    private static List<int[]> findTripets(int[] array) {
        List<int[]> tripletList = new ArrayList<>();
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                for (int k = j+1; k < array.length ; k++) {
                    int a = array[i];
                    int b= array[j];
                    int c= array[k];
                    if(isPythagoreonTriplets(a,b,c)){
                        int triplet[] = {a,b,c};
                        tripletList.add(triplet);
                    }

                }
            }
        }
        return tripletList;
    }

    private static boolean isPythagoreonTriplets(int x, int y,int z) {
        return (x*x) + (y*y) ==z*z;
    }
}
