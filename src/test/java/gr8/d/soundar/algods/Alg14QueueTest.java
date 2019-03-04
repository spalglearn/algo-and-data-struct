package gr8.d.soundar.algods;

import org.junit.Test;
import org.junit.Assert;

public class Alg14QueueTest {
    @Test
    public void testQueueUsingArray() {
        testQueue(new Alg14Queue.QueueUsingArray<>());
    }

    @Test
    public void testQueueUsingList() {
        testQueue(new Alg14Queue.QueueUsingList<>());
    }

    @Test
    public void testQueueUsingStack() {
        testQueue(new Alg14Queue.QueueUsingStack<>());
    }

    @Test
    public void testWeave() {
        Alg14Queue.Queue<Integer> q1 = new Alg14Queue.QueueUsingArray<>();
        q1.add(1);
        q1.add(2);
        Alg14Queue.Queue<Integer> q2 = new Alg14Queue.QueueUsingArray<>();
        q2.add(3);
        q2.add(4);
        q2.add(5);
        Alg14Queue.Queue<Integer> weavedQueue = Alg14Queue.weave(q1, q2);
        Assert.assertEquals(5, weavedQueue.size());
        Assert.assertEquals(Integer.valueOf(1), weavedQueue.remove());
        Assert.assertEquals(Integer.valueOf(3), weavedQueue.remove());
        Assert.assertEquals(Integer.valueOf(2), weavedQueue.remove());
        Assert.assertEquals(Integer.valueOf(4), weavedQueue.remove());
        Assert.assertEquals(Integer.valueOf(5), weavedQueue.remove());
    }

    private void testQueue(Alg14Queue.Queue<Integer> queue) {
        Assert.assertEquals(0, queue.size());
        queue.add(1);
        Assert.assertEquals(1, queue.size());
        Assert.assertEquals(Integer.valueOf(1), queue.peek());
        queue.add(2);
        Assert.assertEquals(Integer.valueOf(1), queue.peek());
        Assert.assertEquals(2, queue.size());
        Assert.assertEquals(Integer.valueOf(1), queue.remove());
        Assert.assertEquals(1, queue.size());
        Assert.assertEquals(Integer.valueOf(2), queue.peek());
        Assert.assertEquals(Integer.valueOf(2), queue.remove());
        Assert.assertEquals(0, queue.size());
    }
}