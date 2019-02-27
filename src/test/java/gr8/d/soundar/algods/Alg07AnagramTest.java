package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg07AnagramTest {
    @Test
    public void testIsAnagram() {
        Assert.assertTrue(new Alg07Anagram().isAnagram("rail safety", "fairy tales"));
        Assert.assertTrue(new Alg07Anagram().isAnagram("RAIL! SAFETY!", "fairy tales"));
        Assert.assertFalse(new Alg07Anagram().isAnagram("hi there", "bye there"));
    }

    @Test
    public void testIsAnagramBySort() {
        Assert.assertTrue(new Alg07Anagram().isAnagramBySort("rail safety", "fairy tales"));
        Assert.assertTrue(new Alg07Anagram().isAnagramBySort("RAIL! SAFETY!", "fairy tales"));
        Assert.assertFalse(new Alg07Anagram().isAnagramBySort("hi there", "bye there"));
    }
}