package com.bridgelabz.linkedlist;

public class LinkedList {

    Node head = null;
    Node tail = null;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add node
    public void add( int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // display node
    public void display() {
        Node  temp = head;
        while(temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }
}
