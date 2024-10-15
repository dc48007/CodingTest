package com.internal.Archieved.Practise;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramToFindMaxAndMin {


    public static void main(String[] args) {

        int [] givenArray = new int[] {-37483374, 4848, 763, 93832, 0};

        int max = givenArray[0];
        int min = givenArray[0];
        for (int i = 1; i < givenArray.length; i++) {
            if(givenArray[i]>max){
                max = givenArray[i];
            }
            if (givenArray[i]<min){
                min =givenArray[i];
            }
        }
        System.out.println("max number: "+ max + "  ---  min number: "+min);
        System.out.println("====================================second way===================================================");
        List<Integer> list = Arrays.stream(givenArray).boxed().collect(Collectors.toList());
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


    }


}
