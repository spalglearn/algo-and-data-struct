package gr8.d.soundar.algods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alg14Queue {

    public static <T> Queue<T> weave (Queue<T> q1, Queue<T> q2) {
        Queue<T> ret = new QueueUsingArray<>();
        while (q1.size() > 0 || q2.size() > 0) {
            if (q1.peek() != null)
                ret.add(q1.remove());
            if (q2.peek() != null)
                ret.add(q2.remove());
        }
        return ret;
    }

    public static interface Queue<T extends Object> {
        public void add(T t);
        public T remove();
        public T peek();
        public int size();
    }

    public static class QueueUsingArray<T> implements Queue<T> {
        private Object[] q = {};

        @Override
        public void add(T t) {
            q = Arrays.copyOf(q, q.length + 1);
            q[q.length - 1] = t;
        }

        @Override
        @SuppressWarnings("unchecked")
        public T remove() {
            try {
                T item = (T) q[0];
                q = Arrays.copyOfRange(q, 1, q.length);
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
        @SuppressWarnings("unchecked")
        public T peek() {
            try {
                return (T) q[0];
            } catch (ArrayIndexOutOfBoundsException e) {
                return null;
            }
        }
    }

    public static class QueueUsingList<T> implements Queue<T> {

        List<T> q = new ArrayList<>();

        @Override
        public void add(T t) {
            q.add(t);
        }

        @Override
        public T remove() {
            try {
                return q.remove(0);
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
                return q.get(0);
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        }
    }

    public static class QueueUsingStack<T> implements Queue<T> {

        Alg15Stack.Stack<T> stack = new Alg15Stack.StackUsingArray<>();

        @Override
        public void add(T t) {
            Alg15Stack.Stack<T> tempStack = new Alg15Stack.StackUsingArray<>();
            while(stack.peek() != null)
                tempStack.push(stack.pop());
            tempStack.push(t);
            while(tempStack.peek() != null)
                stack.push(tempStack.pop());
        }

        @Override
        public T remove() {
            return stack.pop();
        }

        @Override
        public T peek() {
            return stack.peek();
        }

        @Override
        public int size() {
            return stack.size();
        }
    }
}