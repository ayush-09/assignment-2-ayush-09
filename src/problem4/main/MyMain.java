/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem4.BinarySearchTree.MySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyQueue myqueue = new MyQueue();
        MySearchTree binarySearchTree = new MySearchTree(myqueue);
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(20);
        binarySearchTree.insert(16);
        binarySearchTree.printPreorder();
        myqueue.show();
    }
}
