package com.bridgelabz.linkedlist;

public class LinkedList {

    Node head = null;
    Node tail = null;

    // add node
    public void add( int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // append nodes
    public void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert to middle of the linked list

    public void insertToMiddle(int data) {
        Node newNode = new Node(data);
        if(head == null) {
        }
        else {
            Node temp = head;
            Node middle = head;
            while (temp.next != null && temp.next.next != null)
            {
                temp = temp.next.next;
                middle = middle.next;
            }
            newNode.next = middle.next;
            middle.next = newNode;
        }
    }

    // delete first element
    public void pop() {
        if(head == null) {
            System.out.print("empty");
        }
        head = head.next;
    }

    //delete last element
    public Node popLast() {
        if(head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // display node
    public void display() {
        Node  temp = head;
        while(temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
}
