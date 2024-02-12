package com.internal.Archieved.Practise;
public class ProgramFindLCM {
    public static void main(String[] args) {
        System.out.println(findLCM(16, 4));;

    }

    private static int findLCM(int x, int y) {
        int high =x>y?x:y;
        int low = x>y?y:x;
        int gcd = findGCD(high, low);
        return (x*y)/gcd;
    }

    private static int findGCD(int high, int low) {
        int temp;
        while (low != 0) {
            temp = low;
            low = high % low;
            high =temp;
        }
        return high;

    }
}
