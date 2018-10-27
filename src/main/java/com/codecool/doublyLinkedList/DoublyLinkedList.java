package com.codecool.doublyLinkedList;

public class DoublyLinkedList {

    public Node head;

    public void insertAtFront(int new_data) {

        Node new_Node = new Node(new_data);

        new_Node.next = head;
        new_Node.prev = null;

        if (head != null) head.prev = new_Node;

        head = new_Node;
    }

    public void insertAtEnd(int new_data) {

        Node new_node = new Node(new_data);

        Node last = head; /* used in step 5*/

        new_node.next = null;

        if (head == null) {
            new_node.prev = null;
            head = new_node;
            return;
        }

        while (last.next != null)
            last = last.next;

        last.next = new_node;

        new_node.prev = last;
    }

    /* Given a key, deletes the first occurrence of key in linked list */
    public void deleteNode(int key) {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        prev.next = temp.next;
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
}
