package com.internal.Archieved.Practise.Collections.SetInterface;
import java.util.*;

public class ProgramHashSet {



    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1,2,3,6,7);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(null);
        set.add(null);
        set.forEach(System.out::println);
        Set<Integer> linkedhashset = new LinkedHashSet<>();
        System.out.println(linkedhashset.addAll(set));
        linkedhashset.forEach(System.out::println);
        Set<Integer> treeSet = new TreeSet<>();
        set.remove(null);
        System.out.println(treeSet.addAll(set));;

    }
}
