package tests;

class Node {

    int data;
    Node left;
    Node right;
}

public class VerifyBtree {

    // verify if given tree is binary search tree: recursive solution
    boolean isBtree(Node node) {
        if (node == null)
            return false;
        else if (node.left == null && node.right == null)
            return true;

        int a = node.data;
        if (node.left != null) {
            int l = node.left.data;
            return (l < a) && isBtree(node.left);
        }
        else {
            int r = node.right.data;
            return (r > a) && isBtree(node.right);
        }
    }
}
