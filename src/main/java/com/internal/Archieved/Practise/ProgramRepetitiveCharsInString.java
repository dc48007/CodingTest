package com.internal.Archieved.Practise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgramRepetitiveCharsInString {

    //this is pen

    //siht si nep

    public static void reverseWordsOfString(){
        String s = "this is pen";
        String result= "";
        String [] stringArray =  s.split("\\s+");
        for (String el: stringArray) {
           result+=new StringBuilder(el).reverse().append(" ");
        }
        System.out.println(result.trim());
    }

    //problem: this is my penmy
    //word my

    public static void findDuplicateWord(String wordToBeSearch, String givenString) {

        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while ((index = givenString.indexOf(wordToBeSearch, index))!=-1) {
            result.add(index);
            index++;
        }
        if(result.size()!=0){
            System.out.println("no of occurances: "+ result.size());
        }else
            System.out.println("No occurances of word in given string");

    }

    public static void main(String[] args) {
        findDuplicateWord("le", "this is mypenmy");
        reverseWordsOfString();
        printFirstRepeatitiveCharsInStrings("inndigo");
        printRepetitiveCharsInStings();
        printReverseString("this is my pen");
    }

    public static void printReverseString(String given){
        String reverse = Arrays.stream(given.split("\\s+")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }

    public static void printRepetitiveCharsInStings() {
        String givenString = "Deepak";
        Map<Character, Long> chars = givenString.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Character::toLowerCase, Collectors.counting()));
        chars.entrySet().forEach(characterLongEntry -> {
            System.out.println(characterLongEntry.getKey() + ":::::" + characterLongEntry.getValue());
            ;
        });
    }

    public static void printFirstRepeatitiveCharsInStrings(String givenString){
        HashSet<Character>c = new HashSet<>();
        char repc = givenString.chars().mapToObj(ch->(char)ch).filter(ch->!c.add(ch)).findFirst().get();
        System.out.println(repc);
    }


}
