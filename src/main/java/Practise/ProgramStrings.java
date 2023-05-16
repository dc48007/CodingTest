package Practise;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramStrings {



    public static void main(String[] args) {
        System.out.println(reverseString("hello world real me"));
        System.out.println(reverseStringUSingStream("hello world deepak here"));
        System.out.println(isPalindrome(123));
        printRepetitiveWordsIntoSentence("my name is name");
    }

    public static String reverseString(String givenString) {
        StringBuilder stringBuilder = new StringBuilder(givenString);
        return stringBuilder.reverse().toString();
    }

    public static String reverseStringUSingStream(String givenString) {
        return Arrays.stream(givenString.split("//s+")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));
    }

    public static int isPalindrome(int givenNumber){
       return Integer.valueOf(Arrays.stream(String.valueOf(givenNumber).split("//s+")).map(m->new StringBuilder(m).reverse().toString()).collect(Collectors.joining("")));
    }

    public static void printRepetitiveWordsIntoSentence(String sentence){
       Map<String, Long> wordCounts = Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
       wordCounts.entrySet().stream().filter(f-> f.getValue()>1).forEach(entry -> System.out.println(entry.getKey()+ " repeats "+ entry.getValue()));

    }




}
