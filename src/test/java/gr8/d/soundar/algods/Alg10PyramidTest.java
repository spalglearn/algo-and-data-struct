package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg10PyramidTest {
    @Test
    public void testGetPyramid() {
        Assert.assertArrayEquals(new String[] {"#"}, new Alg10Pyramid().getPyramid(1));
        Assert.assertArrayEquals(new String[] {" # ", "###"}, new Alg10Pyramid().getPyramid(2));
        Assert.assertArrayEquals(new String[] {"  #  ", " ### ", "#####"}, new Alg10Pyramid().getPyramid(3));
    }

    @Test
    public void testGetPyramidByRecursion() {
        Assert.assertArrayEquals(new String[] {"#"}, new Alg10Pyramid().getPyramidByRecursion(1));
        Assert.assertArrayEquals(new String[] {" # ", "###"}, new Alg10Pyramid().getPyramidByRecursion(2));
        Assert.assertArrayEquals(new String[] {"  #  ", " ### ", "#####"}, new Alg10Pyramid().getPyramidByRecursion(3));
    }

    @Test
    public void testGetPyramidByRecursion2() {
        Assert.assertArrayEquals(new String[] {"#"}, new Alg10Pyramid().getPyramidByRecursion2(1));
        Assert.assertArrayEquals(new String[] {" # ", "###"}, new Alg10Pyramid().getPyramidByRecursion2(2));
        Assert.assertArrayEquals(new String[] {"  #  ", " ### ", "#####"}, new Alg10Pyramid().getPyramidByRecursion2(3));
    }
}