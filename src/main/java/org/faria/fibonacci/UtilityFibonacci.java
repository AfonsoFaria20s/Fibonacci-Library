package org.faria.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class UtilityFibonacci {
    private static int isFibIndex = 0;

    public int recursiveFib(int n) {
        if(n<2) return n;
        else return recursiveFib(n-1)+recursiveFib(n-2);
    }

    public boolean isFibonacci(int num) {
        int fibValue;

        while ((fibValue = recursiveFib(isFibIndex)) <= num) {
            if (fibValue == num) {
                return true;
            }
            isFibIndex++;
        }
        return false;
    }

    // Get the position of a Fibonacci number
    public int positionOf(int num) {
        int index = 0;
        int fibValue;

        while ((fibValue = recursiveFib(index)) <= num) {
            if (fibValue == num) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public float getGoldenRatioUntil(long num) {
        List<Long> list = new ArrayList<>();
        int index = 0;
        long currentFib = recursiveFib(index);

        // Generate Fibonacci numbers until the specified number
        while (currentFib < num) {
            list.add(currentFib);
            index++;
            currentFib = recursiveFib(index);
        }

        // Check if the list has at least two elements to avoid IndexOutOfBoundsException
        if (list.size() < 2) {
            throw new IllegalArgumentException("The list does not have enough Fibonacci numbers to calculate the ratio.");
        }

        long last = list.getLast();
        long secToLast = list.get(list.size() - 2);

        return (float) last / secToLast;
    }

    public List<Long> generateCustom(long n1, long n2, int n) {
        List<Long> sequence = new ArrayList<>();

        if (n <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        // Add the first two terms
        if (n >= 1) sequence.add(n1);
        if (n >= 2) sequence.add(n2);

        // Generate the rest of the terms
        for (int i = 2; i < n; i++) {
            long nextTerm = n1 * sequence.get(i - 1) + n2 * sequence.get(i - 2);
            sequence.add(nextTerm);
        }

        return sequence;
    }

    // Public method to start the recursive calculation
    public static int sumOf(int N) {
        return sumFibonacciHelper(N, 0, 0, 1);
    }

    // Recursive method to calculate the sum of the first N Fibonacci numbers
    private static int sumFibonacciHelper(int N, int index, int a, int b) {
        if (index >= N) {
            return 0;
        }
        return a + sumFibonacciHelper(N, index + 1, b, a + b);
    }
}
