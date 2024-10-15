package com.internal.Archieved.functionalInterface;

import java.util.HashMap;
import java.util.function.Function;

/**
 *  Demonstration of function type of Functional interface
 */
public class Practisefunction {

private static HashMap<Integer, String> employeeData =new HashMap<>();

public static void add(String name, Integer id){
    if(!employeeData.containsKey(id)){
        employeeData.put(id, name);
    }else {
        System.out.println("empl already registered");
    }
}

    public static void main(String[] args) {
        Function<Integer, String> get = (id)-> employeeData.containsKey(id)?employeeData.get(id):"InvalidId";
        add("Tom Jones",1045);
        add("Nancy Smith", 1065);
        add("Deborah Sprightly", 1029);
        add("Ethan Hardy", 1025);
        System.out.println("ID: 1024, Name="+get.apply(1024));


    }

}
