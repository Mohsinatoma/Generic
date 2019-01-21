package Genericprac.Genericprac;

public class Node<E> {
    public E data;
    Node next;

    public Node(E data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String toString() {
        return data + " ";
    }
}
