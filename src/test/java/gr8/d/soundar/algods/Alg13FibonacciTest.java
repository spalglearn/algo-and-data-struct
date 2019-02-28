package gr8.d.soundar.algods;

import org.junit.Test;
import org.junit.Assert;

public class Alg13FibonacciTest {
    @Test
    public void testFibonacciLinear() {
        Assert.assertEquals(3, new Alg13Fibonacci().fibonacciLinear(4));
        Assert.assertEquals(5, new Alg13Fibonacci().fibonacciLinear(5));
        Assert.assertEquals(8, new Alg13Fibonacci().fibonacciLinear(6));
        Assert.assertEquals(13, new Alg13Fibonacci().fibonacciLinear(7));
        Assert.assertEquals(610, new Alg13Fibonacci().fibonacciLinear(15));
        Assert.assertEquals(75025, new Alg13Fibonacci().fibonacciLinear(25));
    }

    @Test
    public void testFibonacciRecursive() {
        Assert.assertEquals(3, new Alg13Fibonacci().fibonacciRecursion(4));
        Assert.assertEquals(5, new Alg13Fibonacci().fibonacciRecursion(5));
        Assert.assertEquals(8, new Alg13Fibonacci().fibonacciRecursion(6));
        Assert.assertEquals(13, new Alg13Fibonacci().fibonacciRecursion(7));
        Assert.assertEquals(610, new Alg13Fibonacci().fibonacciRecursion(15));
        Assert.assertEquals(75025, new Alg13Fibonacci().fibonacciRecursion(25));
    }

    @Test
    public void testFibonacciRecursiveMemoization() {
        Assert.assertEquals(3, new Alg13Fibonacci().fibonacciRecursionMemoization(4));
        Assert.assertEquals(5, new Alg13Fibonacci().fibonacciRecursionMemoization(5));
        Assert.assertEquals(8, new Alg13Fibonacci().fibonacciRecursionMemoization(6));
        Assert.assertEquals(13, new Alg13Fibonacci().fibonacciRecursionMemoization(7));
        Assert.assertEquals(610, new Alg13Fibonacci().fibonacciRecursionMemoization(15));
        Assert.assertEquals(75025, new Alg13Fibonacci().fibonacciRecursionMemoization(25));
    }
}