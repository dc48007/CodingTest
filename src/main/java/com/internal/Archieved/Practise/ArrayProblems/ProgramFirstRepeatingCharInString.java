package com.internal.Archieved.Practise.ArrayProblems;
import java.util.ArrayList;
import java.util.HashSet;

public class ProgramFirstRepeatingCharInString {

    public static void findFirstRepeatingCharInString(String givenString, int n){
        ArrayList<Character> resultant = new ArrayList<>();
        HashSet<Character> hashSet = new HashSet<>();
        if(givenString==null){
            System.out.println("Given string does have null value");
            return;
        }if(givenString.length() < 2 || givenString.isEmpty()){
            System.out.println("Given string should have char more than one or given string is empty");
            return;
        }
        char[] chars = givenString.toCharArray();
        for (char c:chars) {
            if(!hashSet.add(c)){
                if(!resultant.contains(c)){
                resultant.add(c);
                }
            }
        }
        if(resultant.isEmpty()){
            System.out.println("There is no repetition chars in given string");
        }else if(resultant.size()==n||resultant.size()>n){
            System.out.println("The "+n+" repeating char "+ resultant.get(n-1));
        }else {
            System.out.println("There is no "+n+" repetition char in given string");
        }
    }
    public static void main(String[] args) {
        String s= "";
        String s1 = null;
        String s2 = "easy";
        String s4= "DeepakChaudhary";
        findFirstRepeatingCharInString(s4, 1);
    }
}
