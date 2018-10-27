package com.codecool.singlyLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void testSinglyListShouldBeEmpty() {
        SinglyLinkedList singly = new SinglyLinkedList();
        assertTrue(singly.isEmpty());
    }

    @Test
    void testSinglyListShouldHaveLength2() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(2);
        singly.append(2);
        assertEquals(2, singly.length());
    }

    @Test
    void getTail() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(10);
        singly.append(2);
        int tail = singly.tail().data;
        assertEquals(2, tail);
    }

    @Test
    void testGetHead() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(10);
        singly.append(2);
        singly.append(5);

        assertEquals(10, singly.getHead().data);
    }

    @Test
    void testGetMiddleElement() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(10);
        singly.append(2);
        singly.append(5);
        singly.append(3);
        singly.append(20);

        assertEquals(5, singly.findMiddleNode().data);
    }

    @Test
    void testDeleteWithValue() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(10);
        singly.append(5);
        singly.append(7);
        singly.append(3);
        singly.append(20);
        singly.deleteWithValue(5);

        assertEquals(" 10 7 3 20", singly.toString());
    }

    @Test
    void testInsertAtNthPosition() {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.append(10);
        singly.append(5);
        singly.append(7);
        singly.append(3);
        singly.insertNth(3,2);
        assertEquals(" 10 5 3 7 3", singly.toString());
    }
}