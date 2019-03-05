package gr8.d.soundar.algods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Alg16LinkedList {

    public static class LinkedList<T> implements Iterable<T> {
        private static final int LAST_INDEX = -1;
        private Node<T> headNode;

        public void insertFirst(Node<T> node) {
            insertAt(0, node);
        }

        public void insertLast(Node<T> node) {
            node.setNext(null);
            insertAt(LAST_INDEX, node);
        }

        public void insertAt(int index, Node<T> node) {
            if (node == null) {
                return;
            }

            node.setNext(null);

            if (headNode == null) {
                // Empty linked list
                headNode = node;
            } else if (index == 0) {
                // Insert at head
                node.setNext(headNode);
                headNode = node;
                return;
            } else {
                List<Node<T>> indexedNodes = indexiefy();
                if (index == LAST_INDEX || index >= indexedNodes.size()) {
                    // Insert at last
                    try {
                        indexedNodes.get(indexedNodes.size() - 1).setNext(node);
                    } catch (IndexOutOfBoundsException e) {
                        // If this is the case, current node is head
                        headNode = node;
                    }
                } else {
                    // Insert at any other position
                    Node<T> nextNode = indexedNodes.get(index);
                    node.setNext(nextNode);
                    try {
                        Node<T> prevNode = indexedNodes.get(index - 1);
                        prevNode.setNext(node);
                    } catch (IndexOutOfBoundsException e) {
                        // If this is the case, current node is head
                        headNode = node;
                    }
                }
            }
        }

        public Node<T> getFirst() {
            return getAt(0);
        }

        public Node<T> getLast() {
            return getAt(LAST_INDEX);
        }

        public Node<T> getAt(int index) {
            List<Node<T>> indexedNodes = indexiefy();
            if (index == LAST_INDEX)
                index = indexedNodes.size() - 1;
            try {
                return indexedNodes.get(index);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }

        public void removeFirst() {
            removeAt(0);
        }

        public void removeLast() {
            removeAt(LAST_INDEX);
        }

        public void removeAt(int index) {
            List<Node<T>> indexedNodes = indexiefy();
            if (index == LAST_INDEX)
                index = indexedNodes.size() - 1;
            Node<T> currNode = indexedNodes.get(index);
            Node<T> nextNode = currNode.getNext();
            try {
                Node<T> prevNode = indexedNodes.get(index - 1);
                prevNode.setNext(nextNode);
            } catch (IndexOutOfBoundsException e) {
                // If no previous node, next node is head
                headNode = nextNode;
            }
        }

        public int size() {
            int size = 0;
            Node<T> node = headNode;
            while (node != null) {
                size++;
                node = node.getNext();
            }
            return size;
        }

        public void clear() {
            headNode = null;
        }

        public Node<T> midPoint() {
            Node<T> midPoint = headNode;
            Node<T> farPoint = headNode;

            while (farPoint != null && farPoint.getNext() != null && farPoint.getNext().getNext() != null) {
                midPoint = midPoint.getNext();
                farPoint = farPoint.getNext().getNext();
            }

            return midPoint;
        }

        private List<Node<T>> indexiefy() {
            List<Node<T>> index = new ArrayList<>();

            Node<T> node = headNode;

            while (node != null) {
                index.add(node);
                node = node.getNext();
            }

            return index;
        }

        @Override
        public Iterator<T> iterator() {
            return new LinkedListIterator();
        }

        class LinkedListIterator implements Iterator<T> {

            private Node<T> currNode = headNode;

            @Override
            public boolean hasNext() {
                return (currNode == null) ? false : currNode.getNext() != null;
            }

            @Override
            public T next() {
                currNode = (currNode == null) ? null : currNode.getNext();
                return currNode.getData();
            }
        }
    }

    public static class Node<T> {
        private T data;
        private Node<T> next;
        
        public Node(T data) {
            this(data, null);
        }

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }

    public static <T> boolean isLinkedListLooping(LinkedList<T> linkedList) {
        return isLinkedListLooping(linkedList.getFirst());
    }

    public static <T> boolean isLinkedListLooping(Node<T> node) {
        Node<T> slowNode = node;
        Node<T> fastNode = node;
        while (fastNode != null && fastNode.getNext() != null && fastNode.getNext().getNext() != null) {
            slowNode = slowNode.getNext();
            fastNode = fastNode.getNext().getNext();
            if (slowNode == fastNode)
                return true;
        }
        return false;
    }
}