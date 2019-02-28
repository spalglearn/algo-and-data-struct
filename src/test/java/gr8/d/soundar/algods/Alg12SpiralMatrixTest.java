package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg12SpiralMatrixTest {
    @Test
    public void testGetMatrix() {
        Assert.assertArrayEquals(new int[][]{ new int[] {1, 2}, 
                                              new int[] {4, 3}}, 
                                 new Alg12SpiralMatrix().getMatrix(2));
        Assert.assertArrayEquals(new int[][]{ new int[] {1,   2,  3, 4}, 
                                              new int[] {12, 13, 14, 5}, 
                                              new int[] {11, 16, 15, 6}, 
                                              new int[] {10,  9,  8, 7}}, 
                                 new Alg12SpiralMatrix().getMatrix(4));
        Assert.assertArrayEquals(new int[][]{ new int[] {1,   2,  3,  4, 5}, 
                                              new int[] {16, 17, 18, 19, 6}, 
                                              new int[] {15, 24, 25, 20, 7}, 
                                              new int[] {14, 23, 22, 21, 8}, 
                                              new int[] {13, 12, 11, 10, 9}}, 
                                 new Alg12SpiralMatrix().getMatrix(5));
    }

    @Test
    public void testGetMatrix2() {
        Assert.assertArrayEquals(new int[][]{ new int[] {1, 2}, 
                                              new int[] {4, 3}}, 
                                 new Alg12SpiralMatrix().getMatrix2(2));
        Assert.assertArrayEquals(new int[][]{ new int[] {1,   2,  3, 4}, 
                                              new int[] {12, 13, 14, 5}, 
                                              new int[] {11, 16, 15, 6}, 
                                              new int[] {10,  9,  8, 7}}, 
                                 new Alg12SpiralMatrix().getMatrix2(4));
        Assert.assertArrayEquals(new int[][]{ new int[] {1,   2,  3,  4, 5}, 
                                              new int[] {16, 17, 18, 19, 6}, 
                                              new int[] {15, 24, 25, 20, 7}, 
                                              new int[] {14, 23, 22, 21, 8}, 
                                              new int[] {13, 12, 11, 10, 9}}, 
                                 new Alg12SpiralMatrix().getMatrix2(5));
    }
}