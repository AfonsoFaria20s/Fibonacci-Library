package org.faria.fibonacci;
import java.util.List;
/*
    Class used for aggregation of all the
    functions created inside other classes
 */

public class Fibonacci {

    private static final CoreFibonacci coreFibonacci = new CoreFibonacci();
    private static final UtilityFibonacci util = new UtilityFibonacci();

    // Method to get the nth Fibonacci number
    public static int getNthNumber(int n) {
        return coreFibonacci.getNthNumber(n);
    }

    public static int getRecursive(int n ) {return coreFibonacci.recursiveFib(n);}

    // Method to generate the first n Fibonacci numbers
    public static List<Integer> generateFibonacci(int n) {
        return coreFibonacci.generateFibonacci(n);
    }

    // Method to generate Fibonacci numbers up to a specified number
    public static List<Integer> generateFibonacciToNum(int num) {
        return coreFibonacci.generateFibonacciToNum(num);
    }

    public static boolean isFibonacci(int num) {
        return util.isFibonacci(num);
    }

    public static int positionOf(int num) {return util.positionOf(num);}

    public float getGoldenRatioUntil(long num) {return util.getGoldenRatioUntil(num);}

    public List<Long> generateCustom(int n1, int n2, int n) {return util.generateCustom(n1,n2,n);}

    public int sumOf(int n) {return util.sumOf(n);}

    public static void main(String[] args) {}
}
