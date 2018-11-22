package com.codecool.heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinIntHeapTest {

    @Test
    void testPollHeap() {
        MinIntHeap heap = new MinIntHeap();
        heap.add(3);
        heap.add(1);
        assertEquals(1, heap.poll());
    }

}