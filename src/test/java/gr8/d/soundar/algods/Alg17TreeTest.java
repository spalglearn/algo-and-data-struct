package gr8.d.soundar.algods;

import java.util.List;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Alg17TreeTest {

    @Test
    public void testNode() {
        Alg17Tree.Node<Integer> node = new Alg17Tree.Node<>(1);
        Assert.assertEquals(Integer.valueOf(1), node.getData());

        node.addChild(11);
        node.addChild(12);
        node.addChild(13);
        Assert.assertEquals(3, node.getChildrenNodes().size());
        node.getChildrenNodes().stream()
                .map(i -> i.getData())
                .forEach(i -> Assert.assertTrue(i == 11 || i == 12 || i == 13));

        node.removeChild(12);
        Assert.assertEquals(2, node.getChildrenNodes().size());
        node.getChildrenNodes().stream()
                .map(i -> i.getData())
                .forEach(i -> Assert.assertTrue(i != 12));
    }

    @Test
    public void testTree() {
        Alg17Tree.Tree<Integer> tree = new Alg17Tree.Tree<>();
        Assert.assertNull(tree.getRoot());
        tree.setRoot(new Alg17Tree.Node<>(1));
        Assert.assertNotNull(tree.getRoot());
        Assert.assertEquals(Integer.valueOf(1), tree.getRoot().getData());
    }

    @Test
    public void testTreeTraverseBrethFirst() {
        List<String> brethFirstList = new ArrayList<>();
        brethFirstList.add("CEO");
        brethFirstList.add("CTO");
        brethFirstList.add("CFO");
        brethFirstList.add("COO");
        brethFirstList.add("VP-Engineering");
        brethFirstList.add("VP-Infra");
        brethFirstList.add("VP-Design");
        brethFirstList.add("VP-Finance");
        brethFirstList.add("VP-Product Mgmt");
        brethFirstList.add("VP-Process Mgmt");

        Assert.assertEquals(brethFirstList, getTraverseTestTree().traverseBreadthFirst());
    }

    @Test
    public void testTreeTraverseDepthFirst() {
        List<String> depthFirstList = new ArrayList<>();
        depthFirstList.add("CEO");
        depthFirstList.add("CTO");
        depthFirstList.add("VP-Engineering");
        depthFirstList.add("VP-Infra");
        depthFirstList.add("VP-Design");
        depthFirstList.add("CFO");
        depthFirstList.add("VP-Finance");
        depthFirstList.add("COO");
        depthFirstList.add("VP-Product Mgmt");
        depthFirstList.add("VP-Process Mgmt");

        Assert.assertEquals(depthFirstList, getTraverseTestTree().traverseDepthFirst());
    }

    @Test
    public void testTreeLevelWidths() {
        List<Integer> levelWidths = new ArrayList<>();
        levelWidths.add(1);
        levelWidths.add(3);
        levelWidths.add(6);

        Assert.assertEquals(levelWidths, getTraverseTestTree().getLevelWidth());
    }

    private Alg17Tree.Tree<String> getTraverseTestTree() {
        Alg17Tree.Tree<String> tree = new Alg17Tree.Tree<>();
        tree.setRoot(new Alg17Tree.Node<>("CEO"));
        tree.getRoot().addChild("CTO");
        tree.getRoot().addChild("CFO");
        tree.getRoot().addChild("COO");
        tree.getRoot().getChildrenNodes().forEach(c -> {
            if ("CTO".equals(c.getData())) {
                c.addChild("VP-Engineering");
                c.addChild("VP-Infra");
                c.addChild("VP-Design");
            } 
            if ("CFO".equals(c.getData())) {
                c.addChild("VP-Finance");
            }
            if ("COO".equals(c.getData())) {
                c.addChild("VP-Product Mgmt");
                c.addChild("VP-Process Mgmt");
            }
        });
        return tree;
    }
    
}