package gr8.d.soundar.algods;

public class Alg18BinarySearchTree {
    public static class BinarySearchTree<T extends Comparable<T>> {
        private Node<T> root;

        public BinarySearchTree(Node<T> root) {
            this.root = root;
        }

        public Node<T> search(T data) {
            return root.search(data);
        }

        public boolean validate() {
            return root.validate(null, null);
        }
    }

    public static class Node<T extends Comparable<T>> implements Comparable<T> {
        private Node<T> right;
        private Node<T> left;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> left() {
            return left;
        }

        public Node<T> right() {
            return right;
        }

        public void addData(T data) {
            if (this.compareTo(data) < 0) {
                if (right == null) {
                    right = new Node<>(data);
                } else {
                    right.addData(data);
                }
            } else if (this.compareTo(data) > 0) {
                if (left == null) {
                    left = new Node<>(data);
                } else {
                    left.addData(data);
                }
            } else {
                //Ignore equals case
            }
        }

        public Node<T> search(T data) {
            if (this.compareTo(data) < 0) {
                if (right == null) {
                    return null;
                } else {
                    return right.search(data);
                }
            } else if (this.compareTo(data) > 0) {
                if (left == null) {
                    return null;
                } else {
                    return left.search(data);
                }
            } else {
                return this;
            }
        }

        public boolean validate(T min, T max) {
            //validation
            if ((max != null && this.compareTo(max) > 0) || 
                (min != null && this.compareTo(min) < 0)) {
                return false;
            }

            // validate left node
            if (left != null && !left.validate(min, data)) {
                return false;
            }
                
            // validate right node
            if (right != null && !right.validate(data, max)) {
                return false;
            }
            return true;
        }

        @Override
        public int compareTo(T o) {
            return data.compareTo(o);
        }
    }
}