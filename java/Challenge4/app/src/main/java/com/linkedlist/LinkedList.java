package com.linkedlist;

public class LinkedList<T> {
    Node head;
    public LinkedList(){
        this.head = null;
    }
    public void insert(T v){
        Node newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Boolean includes(T v){
        Node pointer = this.head;
        Boolean result;
        try {
            while (pointer != null){
                if(pointer.value == v){
                    return true;
                }
                pointer = pointer.next;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    public String tostring(){

        Node pointer = this.head;
        StringBuilder result = new StringBuilder();
        try {
            while (pointer != null){

                result.append("{").append(pointer.value).append("} ->");
                pointer = pointer.next;
            }
            result.append(" null");
        }catch (Exception e){
            System.out.println(e);
        }
        return result.toString();
    }
}
