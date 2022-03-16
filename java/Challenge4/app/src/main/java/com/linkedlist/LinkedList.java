package com.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    public LinkedList(){
        this.head = null;
    }

    public Node<T> getHead() {
        return head;
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

        if(pointer == null){
            Node<T> newNode = new Node<T>(v);
            newNode.next = this.head;
            this.head = newNode;
        }

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
        //https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

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

        public void kth(int num) {
            Node<T> pointer = this.head;

            try {
                for (int i = 0; i < Math.abs(num); i++) {
                    pointer = pointer.next;
                }
                System.out.println(pointer.value);

            }catch (NullPointerException e){
                System.err.println(e.getMessage());
            }

        }

        public void insert(T v){
        Node<T> newNode = new Node<T>(v);
        newNode.next = this.head;
        this.head = newNode;
    }

        public void zip(LinkedList<Integer> list1, LinkedList<Integer> list2){
            Node listOnePointer = list1.head;
            Node listTwoPointer = list2.head;

            if(listOnePointer == null){

                while (listTwoPointer != null){
                    Node<T> newNode = new Node(listTwoPointer.value);
                    newNode.next = this.head;
                    this.head = newNode;
                    listTwoPointer =listTwoPointer.next;
                }
            }else{
                Node<T> newNode = new Node(listOnePointer.value);
                newNode.next = this.head;
                this.head = newNode;
                Node<T> pointer =this.head;

                listOnePointer = listOnePointer.next;

                try {
                    while(listOnePointer != null || listTwoPointer != null){

                        while (true){
                            if(pointer.next == null){
                                if(listTwoPointer ==null){
                                    break;
                                }
                                Node<T> node2 = new Node(listTwoPointer.value);
                                pointer.next =node2;
                                node2.next=null;
                                break;
                            }
                            pointer=pointer.next;
                        }

                        while (true){
                            if(pointer.next == null){
                                if(listOnePointer == null){
                                    break;
                                }
                                Node<T> node1 = new Node(listOnePointer.value);
                                pointer.next =node1;
                                node1.next=null;
                                break;
                            }
                            pointer=pointer.next;
                        }
                        if(listOnePointer!= null){
                            listOnePointer =listOnePointer.next;
                        }
                        if(listTwoPointer != null){
                            listTwoPointer = listTwoPointer.next;
                        }
                    }
                }catch (NullPointerException exception){
                    System.err.println(exception.getMessage());
                }

            }



        }

        public void  reverse(LinkedList<T> list){

        Node listPinter = list.head;

        while (listPinter != null){
            Node<T> newNode = new Node(listPinter.value);
            newNode.next = this.head;
            this.head = newNode;

            listPinter = listPinter.next;
        }

        }
    }

