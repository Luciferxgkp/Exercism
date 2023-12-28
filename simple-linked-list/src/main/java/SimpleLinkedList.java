import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


class SimpleLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    static class Node<N> {
        private N data;
        private Node<N> next;

        public Node(N n) {
            this.data = n;
            this.next = null;
        }
    }

    SimpleLinkedList() {
        head = null;
        size = 0;
    }

    SimpleLinkedList(T[] values) {
        if (values.length > 0) {
            Node<T> next = null;
            for (T element : values) {
                this.head = new Node<T>(element);
                this.head.next = next;
                next = this.head;
            }
            this.size = values.length;
        }

    }

    void push(T value) {
        Node<T> next = head;
        this.head = new Node<>(value);
        this.head.next = next;
        size++;
    }

    T pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node<T> elementToBePopped = head;
        head = head.next;
        size--;
        return elementToBePopped.data;
    }


    void reverse() {
        Node<T> curr = head;
        Node<T> prev = null;
        while (curr != null) {
            Node<T> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    @SuppressWarnings("unchecked")
    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, this.size());

        Node<T> curr = head;
        for (int i = 0; i < this.size(); i++) {
            arr[i] = curr.data;
            curr = curr.next;
        }

        return arr;
    }

    int size() {
        return size;
    }
}
