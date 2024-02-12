package com.internal.Archieved.Practise;
public class ProgramFibbonacci {
    // 0 1 1 2 3 5 8 13
    // 1 2 3 4 5 6
    public static long[] fibonacciCache;

    public static void main(String[] args) {
        int n = 6;
        fibonacciCache = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print(findFibonacci(i) + " ");
        }
    }

    private static long findFibonacci(int n) {
        long fibonacciCalc;
        if (n <= 1) {
            return n;
        }
        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }
        fibonacciCalc = findFibonacci(n - 1) + findFibonacci(n - 2);
        fibonacciCache[n] = fibonacciCalc;
        return fibonacciCalc;
    }






}
