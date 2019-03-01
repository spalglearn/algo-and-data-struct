package gr8.d.soundar.algods;

import org.junit.Test;
import org.junit.Assert;

public class Alg15StackTest {
    @Test
    public void testStackUsingArray() {
        testQueue(new Alg15Stack.StackUsingArray<>());
    }

    @Test
    public void testStackUsingList() {
        testQueue(new Alg15Stack.StackUsingList<>());
    }

    @Test
    public void testWeave() {
        Alg15Stack.Stack<Integer> q1 = new Alg15Stack.StackUsingArray<>();
        q1.push(1);
        q1.push(2);
        Alg15Stack.Stack<Integer> q2 = new Alg15Stack.StackUsingArray<>();
        q2.push(3);
        q2.push(4);
        q2.push(5);
        Alg15Stack.Stack<Integer> weavedQueue = Alg15Stack.weave(q1, q2);
        Assert.assertEquals(5, weavedQueue.size());
        Assert.assertEquals(Integer.valueOf(2), weavedQueue.pop());
        Assert.assertEquals(Integer.valueOf(5), weavedQueue.pop());
        Assert.assertEquals(Integer.valueOf(1), weavedQueue.pop());
        Assert.assertEquals(Integer.valueOf(4), weavedQueue.pop());
        Assert.assertEquals(Integer.valueOf(3), weavedQueue.pop());
    }

    private void testQueue(Alg15Stack.Stack<Integer> queue) {
        Assert.assertEquals(0, queue.size());
        queue.push(1);
        Assert.assertEquals(1, queue.size());
        Assert.assertEquals(Integer.valueOf(1), queue.peek());
        queue.push(2);
        Assert.assertEquals(Integer.valueOf(2), queue.peek());
        Assert.assertEquals(2, queue.size());
        Assert.assertEquals(Integer.valueOf(2), queue.pop());
        Assert.assertEquals(1, queue.size());
        Assert.assertEquals(Integer.valueOf(1), queue.peek());
        Assert.assertEquals(Integer.valueOf(1), queue.pop());
        Assert.assertEquals(0, queue.size());
    }
}