package Practise;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProgramStrings {



    public static void main(String[] args) {

        repeativeWords("this is mat rat mat");
        System.out.println(reverseString("this is me"));
        System.out.println(reverseStringUSingStream("this is me"));
        System.out.println("verify Palindrome: " + isPalindrome(111121111));
        printRepetitiveWordsInSentence("my name is nameisName");
        System.out.println(reverseStringusingbaseMethod("this is me"));;
    }

    public static String reverseString(String givenString) {
        StringBuilder stringBuilder = new StringBuilder(givenString);
        return stringBuilder.reverse().toString();
    }



    public static void  repeativeWords(String sentence){
      sentence = sentence.toLowerCase();
      String s[] = sentence.split("\\s+");
      Map<String, Long> wordcont = Arrays.stream(s).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        wordcont.forEach((n,v)-> System.out.println(n+ "==="+ v));


    }

    public static String reverseStringUSingStream(String givenString) {
        return Arrays.stream(givenString.split("//s+")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));
    }


    public static String reverseStringusingbaseMethod(String given){
        String reverseStr ="";
        char[] c = given.toCharArray();
        for (int i =c.length-1 ; i >=0; i--) {
            reverseStr = reverseStr+c[i];
        }
        return reverseStr;
    }

    public static boolean isPalindrome(int givenNumber) {
        return IntStream.iterate(givenNumber, n -> n / 10).limit(String.valueOf(givenNumber).length()).map(n -> n % 10).reduce(0, (a, b) -> a * 10 + b) == givenNumber;
    }

    public static void printRepetitiveWordsInSentence(String sentence) {
        Map<String, Long> wordCount = Arrays.stream(sentence.toLowerCase().split("\\s+")).filter(word -> word.replaceAll("[^a-zA-Z]", "").length() > 0).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        Map<String, Long> duplicates = wordCount.entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        duplicates.forEach((word, count) -> System.out.println("Duplicate word: " + word + ", Count: " + count));
    }



}
