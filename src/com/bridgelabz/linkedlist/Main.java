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

        if(linkedList.searchNode(30)){
            System.out.println("The node 30 is present, insert 40 now ");
            System.out.println();
            linkedList.insertAtPosition(40, 3);
            linkedList.display();
        }else {
            System.out.println("Node not found");
        }
    }
}
