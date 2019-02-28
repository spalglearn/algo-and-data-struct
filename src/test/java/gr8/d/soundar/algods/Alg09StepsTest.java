package gr8.d.soundar.algods;

import org.junit.Assert;
import org.junit.Test;

public class Alg09StepsTest {
    @Test
    public void testGetSteps() {
        Assert.assertArrayEquals(new String[] {"# ", "##"}, new Alg09Steps().getSteps(2));
        Assert.assertArrayEquals(new String[] {"#  ", "## ", "###"}, new Alg09Steps().getSteps(3));
        Assert.assertArrayEquals(new String[] {"#   ", "##  ", "### ", "####"}, new Alg09Steps().getSteps(4));
    }

    @Test
    public void testGetStepsRecursion() {
        Assert.assertArrayEquals(new String[] {"# ", "##"}, new Alg09Steps().getStepsRecursion(2));
        Assert.assertArrayEquals(new String[] {"#  ", "## ", "###"}, new Alg09Steps().getStepsRecursion(3));
        Assert.assertArrayEquals(new String[] {"#   ", "##  ", "### ", "####"}, new Alg09Steps().getStepsRecursion(4));
    }
}