package Practise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        int binarygapLength =0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                if (lastCounter != 0) {
                    if(binarygapLength<lastCounter){
                        binarygapLength =lastCounter;
                        lastCounter=0;
                    }
                }
            } else {
                lastCounter++;
            }
        }
        System.out.println(binarygapLength);
    }
}
