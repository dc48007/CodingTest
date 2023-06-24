package Practise;
import java.util.*;

public class ProgramShortestLengthOfSubstring {

        public int shortestUniqueSubstringLength(String S) {
            Map<String, Integer> frequencyMap = new HashMap<>();

            // Count the frequency of each substring in the string
            int length = S.length();
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j <= length; j++) {
                    String substring = S.substring(i, j);
                    frequencyMap.put(substring, frequencyMap.getOrDefault(substring, 0) + 1);
                }
            }

            int shortestLength = Integer.MAX_VALUE;

           // int lengthSEt = frequencyMap.entrySet().stream().filter(f->f.getValue()==1).map(k-> k.getKey()).findFirst().get().length();


            // Find the shortest unique substring
            for (String substring : frequencyMap.keySet()) {
                if (frequencyMap.get(substring) == 1) {
                    System.out.println(substring.length());
                    shortestLength = Math.min(shortestLength, substring.length());
                }
            }
            return shortestLength;
        }


        public static void main(String[] args) {
            String S = "zyzyzyz";
            ProgramShortestLengthOfSubstring solution = new ProgramShortestLengthOfSubstring();
            int shortestLength = solution.shortestUniqueSubstringLength(S);
            System.out.println("Length of the shortest unique substring: " + shortestLength);
        }



    }


