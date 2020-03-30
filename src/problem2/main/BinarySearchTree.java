package problem2.main;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class BinarySearchTree {
    public TreeNode root;
    private MyQueue preQueue;
    private MyQueue postQueue;

    public BinarySearchTree(MyQueue preQueue, MyQueue postQueue) {
        this.preQueue = preQueue;
        this.postQueue = postQueue;
    }

    public MyQueue getPreQueue() {
        return preQueue;
    }

    public void setPreQueue(MyQueue preQueue) {
        this.preQueue = preQueue;
    }

    public MyQueue getPostQueue() {
        return postQueue;
    }

    public void setPostQueue(MyQueue postQueue) {
        this.postQueue = postQueue;
    }

    public problem2.main.BinarySearchTree insert(int value) {
        TreeNode node = new TreeNode(value);
        if (root == null) {
            root = node;
            return this;
        }
        insertRec(root, node);
        return this;
    }

    private void insertRec(TreeNode latestRoot, TreeNode node) {
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

    private void printInOrderRec(TreeNode currRoot) {

        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + "  ");
        printInOrderRec(currRoot.right);
    }

    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    private void printPreOrderRec(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        preQueue.enqueue(currRoot.value);
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    private void printPostOrderRec(TreeNode currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        postQueue.enqueue(currRoot.value);
    }

    private int countrr = 0;

    public int getCountrr() {
        return countrr;
    }

    public void setCountrr(int countrr) {
        this.countrr = countrr;
    }

}
