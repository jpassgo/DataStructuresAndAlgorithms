package DataStructures.tree;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T value;
    Node parent;
    Node left;
    Node right;

    public Node(T value) {
        this.value = value;
        parent = null;
        left = null;
        right = null;

    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Node<T> node) {
        return this.value.compareTo(node.getValue());
    }

    public boolean isEqualTo(Node<T> node) {
        return compareTo(node) == 0;
    }

    public boolean isLessThan(Node<T> node) {
        return compareTo(node) < 0;
    }

    public boolean isLessThanOrEqualTo(Node<T> node) {
        return compareTo(node) <= 0;
    }

    public boolean isGreaterThan(Node<T> node) {
        return compareTo(node) > 0;
    }

    public boolean isGreaterThanOrEqualTo(Node<T> node) {
        return compareTo(node) >= 0;
    }
}
