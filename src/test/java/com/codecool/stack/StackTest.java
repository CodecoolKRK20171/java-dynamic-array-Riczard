package com.codecool.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testNewStackWithInitialSize() {
        new Stack(15);
    }

    @Test
    void testPushStack() throws Exception{
        Stack stack = new Stack(10);
        stack.push("hello number");
        stack.push(2);
        assertEquals(" hello number 2", stack.toString());
    }

    @Test
    void testPopStack() throws Exception{
        Stack stack = new Stack(10);
        stack.push("hello number");
        stack.push(2);
        stack.pop();
        assertEquals(" hello number", stack.toString());
    }

    @Test
    void testPeekStack() throws Exception{
        Stack stack = new Stack(10);
        stack.push("hello number");
        stack.push("data");
        String result = (String) stack.peek();
        assertEquals("data", result);
    }

    @Test
    void testGetStackSize() {
        Stack stack = new Stack(10);
        int expected = 10;
        int result = stack.getMaxSize();
        assertEquals(expected, result);
    }

    @Test
    void testStackLeftSpaces() throws Exception{
        Stack stack = new Stack(10);
        stack.push(3);
        stack.push(3);
        int expected = 8;
        int result = stack.getLeftStackSpace();
        assertEquals(expected, result);
    }

    @Test
    void testPushIfMaxItemExpectedException() throws Exception{
        Stack stack = new Stack(1);
        stack.push(2);
        assertThrows(Exception.class, () -> stack.push(2));
    }

    @Test
    void testPopIfNoItemExpectedException() throws Exception{
        Stack stack = new Stack(1);
        assertThrows(Exception.class, () -> stack.pop());
    }

}