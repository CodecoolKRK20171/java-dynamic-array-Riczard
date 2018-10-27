package com.codecool.doublyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testInsertAtFront() {
        DoublyLinkedList doublyLinked = new DoublyLinkedList();
        doublyLinked.insertAtEnd(3);
        doublyLinked.insertAtFront(5);
        assertEquals(" 5 3", doublyLinked.toString());
    }

    @Test
    void testDeleteNode() {
        DoublyLinkedList doublyLinked = new DoublyLinkedList();
        doublyLinked.insertAtEnd(3);
        doublyLinked.insertAtEnd(5);
        doublyLinked.insertAtEnd(8);
        doublyLinked.deleteNode(3);
        assertEquals(" 5 8", doublyLinked.toString());
    }

    @Test
    void testInsertAtEnd() {
        DoublyLinkedList doublyLinked = new DoublyLinkedList();
        doublyLinked.insertAtEnd(3);
        doublyLinked.insertAtFront(5);
        doublyLinked.insertAtEnd(20);
        assertEquals(" 5 3 20", doublyLinked.toString());
    }

}