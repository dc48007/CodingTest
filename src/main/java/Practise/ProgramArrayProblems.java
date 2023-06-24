package Practise;
public class ProgramArrayProblems {

    public static int solution(int[] A) {
        int unpairedElement = 0;

        for (int i = 0; i < A.length; i++) {
            unpairedElement ^= A[i];
        }

        return unpairedElement;
    }
    public static void main(String[] args) {
        int [] array = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(array));
    }
}
