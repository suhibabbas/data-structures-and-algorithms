package com.lab.queue.structure;

import com.lab.queue.data.QueueNode;

import java.util.NoSuchElementException;

public class Queue {
    private QueueNode back;
    private QueueNode front;

    private static final int QUEUE_SIZE = 10;

    private int size;

    public Queue() {
         size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean add(QueueNode data){
        if(isEmpty()){
            front =data;
            back = data;
            size++;
            return true;
        }else {
            if(size < QUEUE_SIZE){
                data.setNext(back);
                back= data;
                size++;
                return true;
            }
        }
        return false;
    }

    public QueueNode remove(){
        QueueNode frontTemp;

        if(isEmpty()){
            throw new NoSuchElementException("The queue is empty");
        }else {
            frontTemp =front;//stores the first node in the queue
            front = front.getNext();//removes the first node
            size--;
        }
        return frontTemp;
    }

//    public QueueNode poll(){
//        if(isEmpty()){
//            throw new NoSuchElementException("The queue is empty");
//
//        }else {
//            return back = back.getNext();
//        }
//    }

    public QueueNode peek() {
        if (isEmpty()) {
            return null;
        } else{
            return front;
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "back=" + back +
                ", front=" + front +
                ", size=" + size +
                '}';
    }
}
