package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg06ArrayChunkTest {
    @Test
    public void testChunk() {
        Assert.assertArrayEquals(new int[][]{new int[]{1, 2}, new int[]{3, 4}}, new Alg06ArrayChunk().chunk(new int[]{1,2,3,4}, 2));
        Assert.assertArrayEquals(new int[][]{new int[]{1, 2}, new int[]{3, 4}, new int[]{5}}, new Alg06ArrayChunk().chunk(new int[]{1,2,3,4,5}, 2));
        Assert.assertArrayEquals(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8}}, new Alg06ArrayChunk().chunk(new int[]{1,2,3,4,5,6,7,8}, 3));
        Assert.assertArrayEquals(new int[][]{new int[]{1, 2, 3, 4}, new int[]{5}}, new Alg06ArrayChunk().chunk(new int[]{1,2,3,4,5}, 4));
        Assert.assertArrayEquals(new int[][]{new int[]{1, 2, 3, 4, 5}}, new Alg06ArrayChunk().chunk(new int[]{1,2,3,4,5}, 10));
    }
}