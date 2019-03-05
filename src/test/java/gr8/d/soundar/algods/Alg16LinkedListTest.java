package gr8.d.soundar.algods;

import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class Alg16LinkedListTest {
    @Test 
    public void testInsertFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        Assert.assertEquals(Integer.valueOf(1), ll.getAt(0));
        Assert.assertEquals(Integer.valueOf(2), ll.getAt(1));
        Assert.assertEquals(Integer.valueOf(3), ll.getAt(2));
    }

    @Test 
    public void testInsertLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(Integer.valueOf(1));
        ll.insertLast(Integer.valueOf(2));
        ll.insertLast(Integer.valueOf(3));
        Assert.assertEquals(Integer.valueOf(1), ll.getAt(0));
        Assert.assertEquals(Integer.valueOf(2), ll.getAt(1));
        Assert.assertEquals(Integer.valueOf(3), ll.getAt(2));
    }

    @Test 
    public void testInsertAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(Integer.valueOf(1));
        ll.insertLast(Integer.valueOf(2));
        ll.insertLast(Integer.valueOf(3));
        ll.insertAt(1, Integer.valueOf(5));
        Assert.assertEquals(Integer.valueOf(1), ll.getAt(0));
        Assert.assertEquals(Integer.valueOf(5), ll.getAt(1));
        Assert.assertEquals(Integer.valueOf(2), ll.getAt(2));
        Assert.assertEquals(Integer.valueOf(3), ll.getAt(3));
    }

    @Test
    public void testGetFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        Assert.assertNull(ll.getLast());
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        Assert.assertEquals(Integer.valueOf(1), ll.getFirst());
    }

    @Test
    public void testGetLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        Assert.assertNull(ll.getLast());
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        Assert.assertEquals(Integer.valueOf(3), ll.getLast());
    }

    @Test 
    public void testGetAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(Integer.valueOf(1));
        ll.insertLast(Integer.valueOf(2));
        ll.insertLast(Integer.valueOf(3));
        Assert.assertEquals(Integer.valueOf(2), ll.getAt(1));
    }

    @Test
    public void testRemoveFirst() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        ll.removeFirst();
        Assert.assertEquals(Integer.valueOf(2), ll.getFirst());
    }

    @Test
    public void testRemoveLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        ll.removeLast();
        Assert.assertEquals(Integer.valueOf(2), ll.getLast());
    }

    @Test 
    public void testRemoveAt() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertLast(Integer.valueOf(1));
        ll.insertLast(Integer.valueOf(2));
        ll.insertLast(Integer.valueOf(3));
        ll.removeAt(1);
        Assert.assertEquals(Integer.valueOf(1), ll.getAt(0));
        Assert.assertEquals(Integer.valueOf(3), ll.getAt(1));
        Assert.assertNull(ll.getAt(2));
    }

    @Test
    public void testSize() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        Assert.assertEquals(3, ll.size());
    }

    @Test
    public void testClear() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));
        ll.clear();
        Assert.assertEquals(0, ll.size());
    }

    @Test
    public void testIterator() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertFirst(Integer.valueOf(3));
        ll.insertFirst(Integer.valueOf(2));
        ll.insertFirst(Integer.valueOf(1));

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
        ll.insertAt(0, Integer.valueOf(1));
        ll.insertAt(1, Integer.valueOf(2));
        ll.insertAt(2, Integer.valueOf(3));
        ll.insertAt(3, Integer.valueOf(4));
        ll.insertAt(4, Integer.valueOf(5));
        Assert.assertEquals(Integer.valueOf(3), ll.midPoint());
        ll.clear();
        ll.insertAt(0, Integer.valueOf(1));
        ll.insertAt(1, Integer.valueOf(2));
        ll.insertAt(2, Integer.valueOf(3));
        ll.insertAt(3, Integer.valueOf(4));
        ll.insertAt(4, Integer.valueOf(5));
        ll.insertAt(4, Integer.valueOf(6));
        Assert.assertEquals(Integer.valueOf(3), ll.midPoint());
        ll.clear();
        Assert.assertNull(ll.midPoint());
    }

    @Test
    public void testLinkedListLoop() {
        Alg16LinkedList.Node<Integer> node1 = new Alg16LinkedList.Node<>(Integer.valueOf(1));
        Alg16LinkedList.Node<Integer> node2 = new Alg16LinkedList.Node<>(Integer.valueOf(2));
        Alg16LinkedList.Node<Integer> node3 = new Alg16LinkedList.Node<>(Integer.valueOf(3));
        Alg16LinkedList.Node<Integer> node4 = new Alg16LinkedList.Node<>(Integer.valueOf(4));
        Alg16LinkedList.Node<Integer> node5 = new Alg16LinkedList.Node<>(Integer.valueOf(5));
        Alg16LinkedList.Node<Integer> node6 = new Alg16LinkedList.Node<>(Integer.valueOf(6));
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        Assert.assertFalse(Alg16LinkedList.isLinkedListLooping(node1));

        node6.setNext(node4); // circular reference
        Assert.assertTrue(Alg16LinkedList.isLinkedListLooping(node1));

        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertAt(0, Integer.valueOf(1));
        ll.insertAt(1, Integer.valueOf(2));
        ll.insertAt(2, Integer.valueOf(3));
        ll.insertAt(3, Integer.valueOf(4));
        ll.insertAt(4, Integer.valueOf(5));
        Assert.assertFalse(Alg16LinkedList.isLinkedListLooping(ll));
    }

    @Test
    public void testFromLast() {
        Alg16LinkedList.LinkedList<Integer> ll = new Alg16LinkedList.LinkedList<>();
        ll.insertAt(0, Integer.valueOf(1));
        ll.insertAt(1, Integer.valueOf(2));
        ll.insertAt(2, Integer.valueOf(3));
        ll.insertAt(3, Integer.valueOf(4));
        ll.insertAt(4, Integer.valueOf(5));
        Assert.assertEquals(Integer.valueOf(3), ll.fromLast(2));
    }
}