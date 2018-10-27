package com.codecool.singlyLinkedList;

public class SinglyLinkedList {
    private Node head;

    public Node getHead() {
        return this.head;
    }

    public boolean isEmpty(){
        return length() == 0;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        tail().next = new Node(data);
    }

    public int length() {
        int length = 0;
        Node current = head;

        while (current != null){
            length ++;
            current = current.next;
        }

        return length;
    }

    public Node tail() {
        Node tail = head;

        while(tail.next != null){
            tail = tail.next;
        }

        return tail;
    }

    public Node findMiddleNode() {

        int loopCount = 0;
        Node current = head;
        Node mid = head;

        while(current !=null){
            loopCount++;
            current = current.next;
        }

        int midCount = 0;
        if(loopCount%2 != 0){
            midCount = loopCount/2 + 1;
        }else{
            midCount = loopCount / 2;
        }
        for(int i = 0; i < midCount - 1; i++){
            mid = mid.next;
        }
        return mid;
    }

    public void deleteWithValue(int data) {
        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = head;
        while (current != null){
            sb.append(" ");
            sb.append(current.data);
            current = current.next;
        }

        return sb.toString();
    }

    public void insertNth(int data, int position) {
        Node newNode = new Node(); //create a new node
        newNode.data = data;
        newNode.next = null;

        if(this.head == null && position != 0) { //if head is null and position is zero skip it.
            return;
        } else if(this.head == null && position == 0) { // if head null and position is zero set at the head.
            this.head = newNode;
        }

        if(position == 0) { // if position is zero then new node set at the head.
            newNode.next = this.head;
            this.head = newNode;
        }

        Node current = this.head;
        Node previous = null;
        int i = 0;

        while(i < position) { //loop until find the given position.
            previous = current;
            current = current.next;
            if(current == null)
                break;
            i++;
        }

        newNode.next = current; //get the new node and linked the remaining nodes in the list.
        previous.next = newNode; //set the looped node to the new node.

    }
}
