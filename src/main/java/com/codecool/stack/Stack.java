package com.codecool.stack;

public class Stack {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    public int getMaxSize() {
        return maxSize;
    }

    public Stack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];
        top = -1;
    }

    public void push(Object data) throws Exception{
        if(top + 1 == maxSize) throw new Exception();
        stackArray[++top] = data;
    }

    public Object pop() throws Exception{
        if(top == 0) throw new Exception();
        return stackArray[top--];
    }

    public Object peek() {
        return stackArray[top];
    }

    public int getLeftStackSpace() {
        return maxSize - top - 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(" ");
            sb.append(stackArray[i]);
        }
        return sb.toString();
    }
}


