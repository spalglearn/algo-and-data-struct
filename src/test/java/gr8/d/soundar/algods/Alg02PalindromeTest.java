package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg02PalindromeTest {
    @Test
    public void testIsPalindromeStringReverse() {
        Assert.assertTrue(new Alg02Palindrome().isPalindromeUsingStringReverse("malayalam"));
        Assert.assertFalse(new Alg02Palindrome().isPalindromeUsingStringReverse("random"));
    }

    @Test
    public void testIsPalindromeCustomImpl() {
        Assert.assertTrue(new Alg02Palindrome().isPalindromeCustomImplementation("malayalam"));
        Assert.assertFalse(new Alg02Palindrome().isPalindromeCustomImplementation("random"));
    }
}