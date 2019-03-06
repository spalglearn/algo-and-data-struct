package gr8.d.soundar.algods;

import org.junit.Test;
import org.junit.Assert;

public class Alg18BinarySearchTreeTest {

    @Test
    public void testInsert() {
        Alg18BinarySearchTree.Node<Integer> rootNode = new Alg18BinarySearchTree.Node<Integer>(10);
        Assert.assertNull(rootNode.left());
        Assert.assertNull(rootNode.right());

        rootNode.addData(5);
        Assert.assertNotNull(rootNode.left());
        Assert.assertEquals(Integer.valueOf(5), rootNode.left().getData());
        Assert.assertNull(rootNode.right());

        rootNode.addData(20);
        Assert.assertNotNull(rootNode.left());
        Assert.assertEquals(Integer.valueOf(5), rootNode.left().getData());
        Assert.assertNotNull(rootNode.right());
        Assert.assertEquals(Integer.valueOf(20), rootNode.right().getData());

        rootNode.addData(3);
        rootNode.addData(6);
        Assert.assertNotNull(rootNode.left());
        Assert.assertNotNull(rootNode.left().left());
        Assert.assertEquals(Integer.valueOf(3), rootNode.left().left().getData());
        Assert.assertNotNull(rootNode.left().right());
        Assert.assertEquals(Integer.valueOf(6), rootNode.left().right().getData());
    }
    
    @Test
    public void testSearch() {
        Alg18BinarySearchTree.Node<Integer> rootNode = new Alg18BinarySearchTree.Node<Integer>(10);
        rootNode.addData(5);
        rootNode.addData(20);
        rootNode.addData(3);
        rootNode.addData(6);
        Alg18BinarySearchTree.BinarySearchTree<Integer> tree = new Alg18BinarySearchTree.BinarySearchTree<>(rootNode);
        Assert.assertNull(tree.search(4));
        Assert.assertNotNull(tree.search(3));
        Assert.assertEquals(Integer.valueOf(6), tree.search(6).getData());
    }

    @Test
    public void testValidate() {
        Alg18BinarySearchTree.Node<Integer> rootNode = new Alg18BinarySearchTree.Node<Integer>(10);
        rootNode.addData(5);
        rootNode.addData(20);
        rootNode.addData(3);
        rootNode.addData(6);
        Alg18BinarySearchTree.BinarySearchTree<Integer> tree = new Alg18BinarySearchTree.BinarySearchTree<>(rootNode);
        Assert.assertTrue(tree.validate());

        rootNode.left().left().addData(15); // 10 Left 5 left 3 right 15
        Assert.assertFalse(tree.validate());
    }
}