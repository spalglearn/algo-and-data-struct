package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg11VowelCountTest {
    @Test
    public void testCount() {
        Assert.assertEquals(0, new Alg11VowelCount().count("Why?"));
        Assert.assertEquals(3, new Alg11VowelCount().count("Hi there!"));
        Assert.assertEquals(4, new Alg11VowelCount().count("Why do you ask?"));
    }

    @Test
    public void testCount2() {
        Assert.assertEquals(0, new Alg11VowelCount().count2("Why?"));
        Assert.assertEquals(3, new Alg11VowelCount().count2("Hi there!"));
        Assert.assertEquals(4, new Alg11VowelCount().count2("Why do you ask?"));
    }

    @Test
    public void testCount3() {
        Assert.assertEquals(0, new Alg11VowelCount().count3("Why?"));
        Assert.assertEquals(3, new Alg11VowelCount().count3("Hi there!"));
        Assert.assertEquals(4, new Alg11VowelCount().count3("Why do you ask?"));
    }
}