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

    public boolean equalTo(Node<T> node) {
        return compareTo(node) == 0;
    }

    public boolean lessThan(Node<T> node) {
        return compareTo(node) < 0;
    }

    public boolean lessThanOrEqualTo(Node<T> node) {
        return compareTo(node) <= 0;
    }

    public boolean greaterThan(Node<T> node) {
        return compareTo(node) > 0;
    }

    public boolean greaterThanOrEqualTo(Node<T> node) {
        return compareTo(node) >= 0;
    }
}
