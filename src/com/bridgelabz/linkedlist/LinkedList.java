package com.bridgelabz.linkedlist;

public class LinkedList {

    static Node head = null;
    Node tail = null;
    static int size;

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

    public void removeElements(int key) {
        Node current = head;
        Node temp = null;

        if(current != null  && current.data == key) {
            head = current.next;
            return;
        }

        while(current != null  && current.data != key) {
            temp = current;
            current = current.next;
        }
        if(current == null) {
            return;
        }
        temp.next = current.next;
    }

    // sort
    public void sortList() {
        Node current = head;
        Node index = null;
        int temp;

        if(head == null) {
        }
        else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // display size
    public int getSize() {
        return size;
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
