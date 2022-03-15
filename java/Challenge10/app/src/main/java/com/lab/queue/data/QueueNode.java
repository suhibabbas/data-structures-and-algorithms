package com.lab.queue.data;

public class QueueNode {
    private String name;

    private QueueNode next;

    public QueueNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
                "name='" + name + '\'' +
                '}';
    }
}
