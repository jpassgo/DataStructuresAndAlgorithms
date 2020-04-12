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
        System.out.println(bst.root);
    }

    void insert(Node next) {
        recursiveInsert(this.root, next);
    }

    void recursiveInsert(Node current, Node next) {
        if(root == null) {
           root = next;
        } else if(next.lessThan(current)) {
            if(current.left != null) {
                recursiveInsert(current.left, next);
            } else {
                current.left = next;
                next.parent = current;
            }
        } else if(next.greaterThan(current)) {
            if(current.right != null) {
                recursiveInsert(current.right, next);
            } else {
                current.right = next;
                next.parent = current;
            }
        }
    }
}
