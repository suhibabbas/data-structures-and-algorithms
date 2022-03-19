package com.challenge.stack.data;

public class StackNode {
    private final int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public StackNode getNext() {
        return next;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return "StackNode{" +
                "data=" + data +
                '}';
    }
}
