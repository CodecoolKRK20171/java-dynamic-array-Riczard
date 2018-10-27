package com.codecool.doublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(){}

    public Node(int data){
        this.data = data;
        next = null;
    }

}
