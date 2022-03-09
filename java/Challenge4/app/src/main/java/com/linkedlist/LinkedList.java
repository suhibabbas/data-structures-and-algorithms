package com.linkedlist;

public class LinkedList<T> {
    Node head;
    public LinkedList(){
        this.head = null;
    }

    public void insert(T v){
        Node<T> newNode = new Node(v);
        newNode.next = this.head;
        this.head = newNode;
    }

    public Boolean includes(T v){
        Node<T> pointer = this.head;

            while (pointer != null){
                if(pointer.value == v){
                    return true;
                }
                pointer = pointer.next;
            }
        return false;
    }

    public String toString(){

        Node<T> pointer = this.head;
        StringBuilder result = new StringBuilder();
            while (pointer != null){

                result.append("{").append(pointer.value).append("} ->");
                pointer = pointer.next;
            }
            result.append(" null");

        return result.toString();
    }

    public void append(T v){
        Node<T> pointer =this.head;
        while (pointer != null){
            if(pointer.next == null){
                Node<T> newNode = new Node<T>(v);
                pointer.next =newNode;
                newNode.next=null;
                break;
            }
            pointer=pointer.next;
        }
    }

//        public void insertBefore(T ref , T addThis){
//
//        Node pointer = this.head;
//           if(pointer.value == ref){
//               Node newNode = new Node(addThis);
//
//               newNode.next =this.head;
//               this.head = newNode;
//
//           }else{
//               while (pointer != null){
//                   if(pointer.value == ref){
//                       Node newNode = new Node(addThis);
//                       newNode.next = pointer.next;
//                       pointer.next = newNode;
//                       break;
//                   }else {
//                       pointer=pointer.next;
//                   }
//               }
//           }
//        }


        public void insertAfter(T ref, T addThis){

            Node<T> pointer = this.head;

            while (pointer != null){
                if(pointer.value == ref){
                    Node<T> newNode = new Node<T>(addThis);
                    newNode.next = pointer.next;
                    pointer.next = newNode;
                }
                pointer =pointer.next;
            }
        }

        public void test(int num) {
            Node<T> pointer = this.head;

            try {
                for (int i = 0; i < Math.abs(num); i++) {
                    pointer = pointer.next;
                }
                System.out.println(pointer.value);

            }catch (NullPointerException e){
                System.out.println(e.toString());
            }

        }

    }

