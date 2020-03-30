package problem4.BinarySearchTree;

import problem4.myqueue.MyQueue;

public class MySearchTree {
    public problem1.node.TreeNode root;
    private MyQueue myqueue;
    public problem1.node.TreeNode getRoot(){
        return root;
    }

    public MySearchTree(MyQueue myqueue) {
        this.myqueue = myqueue;
    }

    public problem4.BinarySearchTree.MySearchTree insert(int value) {
        problem1.node.TreeNode node = new problem1.node.TreeNode(value);
        if (root == null) {
            root = node;
            return this;
        }
        insertRec(root, node);
        return this;
    }

    private void insertRec(problem1.node.TreeNode latestRoot, problem1.node.TreeNode node) {
        if (latestRoot.value > node.value) {
            if (latestRoot.left == null) {
                latestRoot.left = node;
                return;
            } else {
                insertRec(latestRoot.left, node);
            }
        } else {
            if (latestRoot.right == null) {
                latestRoot.right = node;
                return;
            } else {
                insertRec(latestRoot.right, node);
            }
        }
    }

    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    private void printInOrderRec(problem1.node.TreeNode currRoot) {

        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + "  ");
        printInOrderRec(currRoot.right);
    }

    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println(" ");
    }

    private void printPreOrderRec(problem1.node.TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        myqueue.enqueue(currRoot.value);
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    private void printPostOrderRec(problem1.node.TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.value + "  ");
    }

    private int countrr = 0;

    public int getCountrr() {
        return countrr;
    }

    public void setCountrr(int countrr) {
        this.countrr = countrr;
    }
}
