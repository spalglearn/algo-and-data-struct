package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg04CharMaxOccTest {

    @Test
    public void testMaxOcc() {
        Assert.assertEquals('l', new Alg04CharMaxOcc("hello world").maxOccStream());
        Assert.assertEquals('l', new Alg04CharMaxOcc("hello world").maxOccCustom());
    }
}