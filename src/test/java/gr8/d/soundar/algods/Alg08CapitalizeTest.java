package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg08CapitalizeTest {
    @Test
    public void testCapitalize() {
        Assert.assertEquals("Am I There Yet", new Alg08Capitalize().capitalize("am i there yet"));
        Assert.assertEquals("Am I There, Yet", new Alg08Capitalize().capitalize("am i there, yet"));
    }
}