package com.codecool.queue;

public class Queue {

    private Node head;

    public void enqueue(String value) {
        if (isEmpty()) {
            head = new Node(value);
            return;
        }

        tail().setNextNode(new Node(value));
    }

    public void dequeue() throws Exception{
        head = head.getNextNode();
    }

    public int queueSize() {
        int counter = 0;
        Node current = head;
        while(current != null){
            counter ++;
            current = current.getNextNode();
        }

        return counter;
    }

    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    public Node peek() {
        if(isEmpty()){
            return null;
        }
        return head;
    }

    public Node tail() {
        Node tail = head;

        while(tail.getNextNode() != null){
            tail = tail.getNextNode();
        }

        return tail;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node current = head;
        while (current != null){
            sb.append(" ");
            sb.append(current.getValue());
            current = current.getNextNode();
        }

        return sb.toString();
    }
}
