package gr8.d.soundar.algods;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class Alg16LinkedListTest {
    @Test 
    public void testInsertFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        Alg16LinkedList.Node<Integer> node = ll.getFirst();
        Assert.assertEquals(Integer.valueOf(1), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(2), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(3), node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test 
    public void testInsertLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        Alg16LinkedList.Node<Integer> node = ll.getFirst();
        Assert.assertEquals(Integer.valueOf(1), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(2), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(3), node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test 
    public void testInsertAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertAt(1, new Alg16LinkedList.Node<>(Integer.valueOf(5)));
        Alg16LinkedList.Node<Integer> node = ll.getFirst();
        Assert.assertEquals(Integer.valueOf(1), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(5), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(2), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(3), node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testGetFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        Assert.assertNull(ll.getLast());
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        Assert.assertEquals(Integer.valueOf(1), ll.getFirst().getData());
    }

    @Test
    public void testGetLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        Assert.assertNull(ll.getLast());
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        Assert.assertEquals(Integer.valueOf(3), ll.getLast().getData());
    }

    @Test 
    public void testGetAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        Assert.assertEquals(Integer.valueOf(2), ll.getAt(1).getData());
    }

    @Test
    public void testRemoveFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.removeFirst();
        Assert.assertEquals(Integer.valueOf(2), ll.getFirst().getData());
    }

    @Test
    public void testRemoveLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.removeLast();
        Assert.assertEquals(Integer.valueOf(2), ll.getLast().getData());
    }

    @Test 
    public void testRemoveAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertLast(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.removeAt(1);
        Alg16LinkedList.Node<Integer> node = ll.getFirst();
        Assert.assertEquals(Integer.valueOf(1), node.getData());
        node = node.getNext();
        Assert.assertEquals(Integer.valueOf(3), node.getData());
        Assert.assertNull(node.getNext());
    }

    @Test
    public void testSize() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        Assert.assertEquals(3, ll.size());
    }

    @Test
    public void testClear() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.clear();
        Assert.assertEquals(0, ll.size());
    }

    @Test
    public void testIterator() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertFirst(new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));

        for (Integer i : ll) {
            Assert.assertNotNull(i);
            Assert.assertTrue(i.equals(1) || i.equals(2) || i.equals(3));
        }

        Iterator<Integer> lli = ll.iterator();
        while (lli.hasNext()) {
            Integer i = lli.next();
            Assert.assertNotNull(i);
            Assert.assertTrue(i.equals(1) || i.equals(2) || i.equals(3));
        }
    }

    @Test
    public void testMidPoint() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertAt(0, new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertAt(1, new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertAt(2, new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertAt(3, new Alg16LinkedList.Node<Integer>(Integer.valueOf(4)));
        ll.insertAt(4, new Alg16LinkedList.Node<Integer>(Integer.valueOf(5)));
        Assert.assertEquals(Integer.valueOf(3), ll.midPoint().getData());
        ll.clear();
        ll.insertAt(0, new Alg16LinkedList.Node<Integer>(Integer.valueOf(1)));
        ll.insertAt(1, new Alg16LinkedList.Node<Integer>(Integer.valueOf(2)));
        ll.insertAt(2, new Alg16LinkedList.Node<Integer>(Integer.valueOf(3)));
        ll.insertAt(3, new Alg16LinkedList.Node<Integer>(Integer.valueOf(4)));
        ll.insertAt(4, new Alg16LinkedList.Node<Integer>(Integer.valueOf(5)));
        ll.insertAt(4, new Alg16LinkedList.Node<Integer>(Integer.valueOf(6)));
        Assert.assertEquals(Integer.valueOf(3), ll.midPoint().getData());
        ll.clear();
        Assert.assertNull(ll.midPoint());
    }
}