package gr8.d.soundar.algods;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Alg13Fibonacci {
    public int fibonacciLinear(int n) {
        List<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        for (int i = 2; i <= n; i++) {
            fib.add(fib.get(i-2) + fib.get(i-1));
        }
        return fib.get(n);
    }

    public int fibonacciRecursion(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    private static Map<Integer, Integer> cache = new ConcurrentHashMap<>();

    public int fibonacciRecursionMemoization(int n) {
        if (n < 2) {
            return n;
        }
        if (cache.containsKey(n))
            return cache.get(n);
        else
            cache.put(n, fibonacciRecursionMemoization(n - 2) + fibonacciRecursionMemoization(n - 1));
        return cache.get(n);
        // return cache.computeIfAbsent(n, 
        //         x -> fibonacciRecursionMemoization(x - 2) + 
        //              fibonacciRecursionMemoization(x - 1));
    }
}