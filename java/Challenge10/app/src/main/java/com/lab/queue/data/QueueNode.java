package com.lab.queue.data;

public class QueueNode <Type>{
    Type data;

    QueueNode next;

    public QueueNode(Type data) {
        this.data = data;
    }

    public Type getData() {
        return data;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public void setData(Type data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return "QueueNode{" +
                "data='" + data + '\'' +
                '}';
    }
}
