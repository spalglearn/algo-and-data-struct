package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg05FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        String[] fizzBuzzs = new Alg05FizzBuzz().fizzBuzz(15);
        Assert.assertEquals(15, fizzBuzzs.length);
        Assert.assertEquals("fizz", fizzBuzzs[2]);
        Assert.assertEquals("fizz", fizzBuzzs[5]);
        Assert.assertEquals("fizz", fizzBuzzs[8]);
        Assert.assertEquals("fizz", fizzBuzzs[11]);
        Assert.assertEquals("buzz", fizzBuzzs[4]);
        Assert.assertEquals("buzz", fizzBuzzs[9]);
        Assert.assertEquals("fizzbuzz", fizzBuzzs[14]);
    }
}
