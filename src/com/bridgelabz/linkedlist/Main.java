package com.bridgelabz.linkedlist;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Welcome to Linked List programs ---");
        LinkedList linkedList = new LinkedList();
        System.out.println("List before insertion");
        linkedList.append(56);
        linkedList.append(70);
        linkedList.display();
        System.out.println("List after insertion");
        linkedList.insertToMiddle(30);
        linkedList.display();
    }
}
