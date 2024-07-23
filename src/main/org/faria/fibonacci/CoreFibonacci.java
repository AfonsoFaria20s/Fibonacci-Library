package faria.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class CoreFibonacci {
    public int recursiveFib(int n) {
        if(n<2) return n;
        else return recursiveFib(n-1)+recursiveFib(n-2);
    }

    public int getNthNumber(int n) {
        return recursiveFib(n);
    }

    public List<Integer> generateFibonacci(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(recursiveFib(n));
        }
        return list;
    }

    public List<Integer> generateFibonacciToNum(int num) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while(recursiveFib(index)<num) {
            list.add(recursiveFib(index));
        }
        return list;
    }
}
