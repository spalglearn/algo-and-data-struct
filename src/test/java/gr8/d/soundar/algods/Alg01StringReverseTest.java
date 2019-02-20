package gr8.d.soundar.algods;

import org.junit.Test;
import org.junit.Assert;

public class Alg01StringReverseTest {

    @Test
    public void testReverse() {
        Assert.assertEquals("olleh", new Alg01StringReverse().reverseInbuilt("hello"));
    }

    @Test
    public void testReverseSimple() {
        Assert.assertEquals("olleh", new Alg01StringReverse().reverseSimple("hello"));
    }

    @Test
    public void testReverseComplex() {
        Assert.assertEquals("olleh", new Alg01StringReverse().reverseComplex("hello"));
    }
}