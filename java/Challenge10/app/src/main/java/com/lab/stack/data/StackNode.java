package com.lab.stack.data;

public class StackNode {
    private final String name;
    private final String number;

    private StackNode next;

    public StackNode(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
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
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
