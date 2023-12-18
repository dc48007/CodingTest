package com.internal.Archieved.Practise;
public class ProgramToFindBinaryGap {

    public static String findBinaryGap(int decimal) {
        StringBuilder binaryBuilder = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryBuilder.append(remainder);
            decimal /= 2;
        }
        // Reverse the binary string
        return binaryBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 529;
        String binaryNumber = findBinaryGap(num);
        System.out.println(binaryNumber);
        char[] chars = binaryNumber.toCharArray();
        int lastCounter = 0;
        int initialBinaryGapLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                if (lastCounter != 0) {
                    initialBinaryGapLength = initialBinaryGapLength < lastCounter ? lastCounter : initialBinaryGapLength;
                    lastCounter = 0;
                }
            } else {
                lastCounter++;
            }
        }
        System.out.println(initialBinaryGapLength);
    }
}
