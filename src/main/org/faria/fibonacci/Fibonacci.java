package faria.fibonacci;
import java.util.List;
/*
    Class used for aggregation of all the
    functions created inside other classes
 */

public class Fibonacci {

    private static final CoreFibonacci coreFibonacci = new CoreFibonacci();

    // Method to get the nth Fibonacci number
    public static int getNthNumber(int n) {
        return coreFibonacci.getNthNumber(n);
    }

    // Method to generate the first n Fibonacci numbers
    public static List<Integer> generateFibonacci(int n) {
        return coreFibonacci.generateFibonacci(n);
    }

    // Method to generate Fibonacci numbers up to a specified number
    public static List<Integer> generateFibonacciToNum(int num) {
        return coreFibonacci.generateFibonacciToNum(num);
    }
}
