package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg03IntReverseTest {
    @Test
    public void testReverse() {
        Assert.assertEquals(51, new Alg03IntReverse().reverse(15));
        Assert.assertEquals(5, new Alg03IntReverse().reverse(500));
        Assert.assertEquals(-51, new Alg03IntReverse().reverse(-15));
        Assert.assertEquals(-5, new Alg03IntReverse().reverse(-50));
        Assert.assertEquals(5, new Alg03IntReverse().reverse(5));
        Assert.assertEquals(0, new Alg03IntReverse().reverse(0));
    }
}