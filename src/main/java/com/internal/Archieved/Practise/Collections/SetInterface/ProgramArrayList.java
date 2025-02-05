package com.internal.Archieved.Practise.Collections.SetInterface;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ProgramArrayList {


    public static void main(String[] args) {
        int [] arr = {1,5,6,11};
        ArrayList arrayList = new ArrayList();
        for (int i = 10; i >0; i--) {
            arrayList.add(i);
            Collections.sort(arrayList);
        }
        arrayList.forEach(System.out::println);
    }
}
