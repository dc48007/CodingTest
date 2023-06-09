package Practise;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgramRepetitiveCharsInString {
    public static void main(String[] args) {
        printRepetitiveCharsInStings();
        printReverseString("this is my pen");
    }

    public static void printReverseString(String given){
        String reverse = Arrays.stream(given.split("\\s+")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverse);






    }

    public static void printRepetitiveCharsInStings(){

        String givenString = "Deepak";
        Map<Character, Long> chars = givenString.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Character::toLowerCase, Collectors.counting()));

        chars.entrySet().forEach(characterLongEntry -> {
            System.out.println(characterLongEntry.getKey() + ":::::" + characterLongEntry.getValue());;
        });



    }
}
