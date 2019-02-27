package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg08CapitalizeTest {
    @Test
    public void testCapitalize() {
        Assert.assertEquals("Am I There Yet", new Alg08Capitalize().capitalize("am i there yet"));
        Assert.assertEquals("Am I There, Yet", new Alg08Capitalize().capitalize("am i there, yet"));
    }

    @Test
    public void testCapitalize2() {
        Assert.assertEquals("Am I There Yet", new Alg08Capitalize().capitalize2("am i there yet"));
        Assert.assertEquals("Am I There, Yet", new Alg08Capitalize().capitalize2("am i there, yet"));
    }
}