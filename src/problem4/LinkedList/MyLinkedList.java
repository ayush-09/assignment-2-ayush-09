package problem4.LinkedList;

import problem4.Node.MyNode;

public class MyLinkedList {
    private MyNode first;
    private MyNode last;

    public MyNode getFirst() {
        return first;
    }

    public void setFirst(MyNode first) {
        this.first = first;
    }

    public MyNode getLast() {
        return last;
    }

    public void setLast(MyNode last) {
        this.last = last;
    }

    public void addAfter(int data){
        MyNode newNode =new MyNode(data);
        if(first == null){
            first = last = newNode;
        }
        last.setNext(newNode);
        last = newNode;
    }
    public void deleteFirst(){
        if(first == null){
            first = last = null;
        }
        var after = first.getNext();
        first.setNext(null);
        first = after;
    }
    public void display(){
        var temp = first;
        while (temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
    public MyNode search(int data){
        var current = first;
        while(current != null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }
}
