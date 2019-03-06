package gr8.d.soundar.algods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Alg17Tree {
    public static class Tree<T> {
        private Node<T> root;

        public void setRoot(Node<T> root) {
            this.root = root;
        }

        public Node<T> getRoot() {
            return root;
        }

        public List<T> traverseBreadthFirst() {
            List<T> tList = new ArrayList<>();

            if (root != null) {
                List<Node<T>> levelNodes = new ArrayList<>();
                levelNodes.add(root);
                performBreadthFirstTraversal(tList, levelNodes);
            }

            return tList;
        }

        private void performBreadthFirstTraversal(List<T> tList, List<Node<T>> levelNodes) {
            levelNodes.forEach(n -> tList.add(n.getData()));
            List<Node<T>> nextLevelNodes = getNextLevelNodes(levelNodes);
            if (nextLevelNodes.size() > 0)
                performBreadthFirstTraversal(tList, nextLevelNodes);
        }

        public List<T> traverseDepthFirst() {
            List<T> tList = new ArrayList<>();

            if (root != null)
                performDepthFirstTraversal(tList, root);

            return tList;
        }

        private void performDepthFirstTraversal(List<T> tList, Node<T> node) {
            tList.add(node.getData());
            node.getChildrenNodes().forEach(c -> performDepthFirstTraversal(tList, c));
        }

        public List<Integer> getLevelWidth() {
            List<Integer> levelWidths = new ArrayList<>();

            if (root == null) {
                levelWidths.add(0);
            } else {
                List<Node<T>> levelNodes = new ArrayList<>();
                levelNodes.add(root);
                findLevelWidths(levelWidths, levelNodes);
            }
            return levelWidths;
        }

        private void findLevelWidths(List<Integer> levelWidths, List<Node<T>> levelNodes) {
            levelWidths.add(levelNodes.size());
            List<Node<T>> nextLevelNodes = getNextLevelNodes(levelNodes);
            if (nextLevelNodes.size() > 0)
                findLevelWidths(levelWidths, nextLevelNodes);
        }

        private List<Node<T>> getNextLevelNodes(List<Node<T>> levelNodes) {
            return levelNodes.stream()
                    .map(n -> n.getChildrenNodes())
                    .flatMap(List::stream)
                    .collect(Collectors.toList());
        }
    }

    public static class Node<T> {
        private T data;
        private List<Node<T>> children = new ArrayList<>();
        
        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }

        public List<Node<T>> getChildrenNodes() {
            return children;
        }

        public void addChild(T childData) {
            children.add(new Node<T>(childData));
        }

        public void removeChild(T childData) {
            for (Node<T> child : children) {
                if (childData.equals(child.getData())) {
                    children.remove(child);
                }
            }
        }
    }
}