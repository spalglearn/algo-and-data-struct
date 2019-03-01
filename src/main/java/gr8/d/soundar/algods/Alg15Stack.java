package gr8.d.soundar.algods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg15Stack {

    public static <T> Stack<T> weave (Stack<T> q1, Stack<T> q2) {
        Stack<T> ret = new StackUsingArray<>();
        List<T> temp = new ArrayList<T>();
        while (q1.size() > 0 || q2.size() > 0) {
            if (q1.peek() != null)
                temp.add(q1.pop());
            if (q2.peek() != null)
                temp.add(q2.pop());
        }
        while (temp.size() > 0) {
            ret.push(temp.remove(temp.size() - 1));
        }
        return ret;
    }

    public static interface Stack<T extends Object> {
        public void push(T t);
        public T pop();
        public T peek();
        public int size();
    }

    public static class StackUsingArray<T> implements Stack<T> {
        private Object[] q = {};

        @Override
        public void push(T t) {
            q = Arrays.copyOf(q, q.length + 1);
            q[q.length - 1] = t;
        }

        @Override
        public T pop() {
            try {
                T item = (T) q[q.length - 1];
                q = Arrays.copyOfRange(q, 0, q.length - 1);
                return item;
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                return null;
            }
        }

        @Override
        public int size() {
            return q.length;
        }

        @Override
        public T peek() {
            try {
                return (T) q[q.length - 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                return null;
            }
        }
    }

    public static class StackUsingList<T> implements Stack<T> {

        List<T> q = new ArrayList<>();

        @Override
        public void push(T t) {
            q.add(t);
        }

        @Override
        public T pop() {
            try {
                return q.remove(q.size() - 1);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }

        @Override
        public int size() {
            return q.size();
        }

        @Override
        public T peek() {
            try {
                return q.get(q.size() - 1);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
    }
}