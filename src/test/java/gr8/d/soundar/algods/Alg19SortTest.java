package gr8.d.soundar.algods;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Alg19SortTest {

    private static final Integer[] UNSORTED = { 10, -30, 97, 0, 5 };
    private static final Integer[] SORTED = { -30, 0, 5, 10, 97 };

    @Test
    public void testBubbleSort() {
        Assert.assertArrayEquals(SORTED, Alg19Sort.bubbleSort(UNSORTED));
    }

    @Test
    public void testSelectionSort() {
        Assert.assertArrayEquals(SORTED, Alg19Sort.selectionSort(UNSORTED));
    }

    @Test
    public void testMergeSort() {
        Assert.assertEquals(Arrays.asList(SORTED), Alg19Sort.mergeSort(Arrays.asList(UNSORTED)));
    }
}