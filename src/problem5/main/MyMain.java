/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<>();
        st.add(new Student(1,"ayush",1,0));
        st.add(new Student(2,"akash",1,2));
        st.add(new Student(3,"rohit",3,3));
        st.add(new Student(4,"aman",0,0));
        MyCircularQueue circularQueue = new MyCircularQueue();
        circularQueue.enqueue(st);
        circularQueue.printQueue();
    }
}
