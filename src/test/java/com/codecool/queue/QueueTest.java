package com.codecool.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void testEnqueueEspectPass() {
        Queue que = new Queue();
        que.enqueue("first");
        que.enqueue("second");
        assertEquals(" first second", que.toString());
    }

    @Test
    void testDequeueEspectPass() throws Exception{
        Queue que = new Queue();
        que.enqueue("first");
        que.enqueue("second");
        que.enqueue("third");
        que.dequeue();
        assertEquals(" second third", que.toString());

    }

    @Test
    void testPeekExpectNull() {
        Queue queue = new Queue();
        assertEquals(null, queue.peek());
    }

    @Test void testIsEmptyEspectTrue() {
        Queue queue = new Queue();
        assertEquals(true, queue.isEmpty());
    }

    @Test void testIsEmptyEspectFalse() {
        Queue queue = new Queue();
        queue.enqueue("data");
        assertEquals(false, queue.isEmpty());
    }

    @Test void testQueueSizeEspect3() {
        Queue queue = new Queue();
        queue.enqueue("data");
        queue.enqueue("data");
        queue.enqueue("data");
        assertEquals(3, queue.queueSize());
    }
}