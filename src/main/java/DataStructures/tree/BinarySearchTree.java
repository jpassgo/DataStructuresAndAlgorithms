package DataStructures.tree;

import java.util.Random;

public class BinarySearchTree {

    Node root = null;

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        new Random().ints(10, 0, 100)
                .boxed()
                .map(Node::new)
                .forEach(bst::insert);
        Node node = new Node(5);
        bst.insert(node);
        System.out.println(bst.root);
        bst.remove(node);
        System.out.println(bst);

    }

    void insert(Node node) {
        recursiveInsert(this.root, node);
    }

    void recursiveInsert(Node current, Node node) {
        if(root == null) {
           root = node;
        } else if(node.isLessThan(current)) {
            if(current.left != null) {
                recursiveInsert(current.left, node);
            } else {
                current.left = node;
                node.parent = current;
            }
        } else if(node.isGreaterThan(current)) {
            if(current.right != null) {
                recursiveInsert(current.right, node);
            } else {
                current.right = node;
                node.parent = current;
            }
        }
    }

    void remove(Node node) { recursiveRemove(this.root, node); }

    void recursiveRemove(Node current, Node node) {
        if(node.isEqualTo(current)) {
            if(current.left != null) {
                current.left.parent = current.parent;
                current.parent.left = current.left;
            }
            if(current.right != null) {
                current.right.parent = current.left;
                current.left.right = current.right;
            }
            if(current.left == null && current.right == null) {
                if(node.isEqualTo(current.parent.left)) {
                    current.parent.left = null;
                } else {
                    current.parent.right = null;
                }
            }
            current = null;
        }
        if(current != null && node.isLessThan(current)) {
            recursiveRemove(current.left, node);
        } else if(current != null && node.isGreaterThan(current)) {
            recursiveRemove(current.right, node);
        }
    }
}
