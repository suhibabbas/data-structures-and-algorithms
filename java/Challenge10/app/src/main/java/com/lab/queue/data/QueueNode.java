package com.lab.queue.data;

public class QueueNode {
    private int data;

    private QueueNode next;

    public QueueNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    @Override
    public String toString() {

        return "QueueNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
