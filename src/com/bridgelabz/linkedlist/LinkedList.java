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
            System.out.println("The list is empty");
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

    // Search an element and insert an element next to it
    public boolean searchNode(int node) {
        Node currentNode = head;
        while(currentNode != null) {
            if(currentNode.data == node) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    //insert at a particular position
    public void insertAtPosition(int newElement, int position) {

        Node newNode = new Node(position);
        newNode.data = newElement;
        newNode.next = null;

        if(position < 1) {
            System.out.println("Node 30 is not found");
        } else if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp;
            temp = head;
            for(int i = 1; i < position-1; i++) {
                if(temp != null) {
                    temp = temp.next;
                }
            }
            if(temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Display node
    public void display() {
        Node  temp = head;
        while(temp != null) {
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
}
