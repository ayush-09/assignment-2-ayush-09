/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue preQueue = new MyQueue();
        MyQueue postQueue = new MyQueue();
        BinarySearchTree binarySearchTree =  new BinarySearchTree(preQueue,postQueue);
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(5);
        binarySearchTree.insert(25);
        binarySearchTree.printPreorder();
        binarySearchTree.printPostorder();
        System.out.println("PreOrder: ");
        preQueue.show();
        System.out.println("PostOrder: ");
        postQueue.show();
    }
}
