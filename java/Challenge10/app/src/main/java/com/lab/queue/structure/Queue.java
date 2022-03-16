package com.lab.queue.structure;

import com.lab.queue.data.QueueNode;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue {

    private QueueNode front;

    private static final int QUEUE_SIZE = 10;

    private int size;

    public Queue() {
         size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean enqueue(QueueNode data){

        if(isEmpty()){
            front =data;
            size++;
            return true;
        }else {
            if(size < QUEUE_SIZE){
                data.setNext(front);
                front=data;
                size++;
                return true;
            }
        }
        return false;
    }

    public QueueNode dequeue() {
        QueueNode frontTemp;
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        } else {
            frontTemp = front;
            front = front.getNext();
            size--;
        }

        return frontTemp;
    }



    public QueueNode peek() {
        QueueNode p = front;
        if (isEmpty()) {
            return null;
        } else{
            while (p != null){
                if(p.getNext()== null){
                    return p;
                }
                p = p.getNext();
            }
        }
        return p;
    }

    @Override
    public String toString() {
        QueueNode p = front;
        StringBuilder result = new StringBuilder();
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            while (p != null) {
                result.insert(0, "Queue{" +
                        "front=" + p +
                        ", size=" + size +
                        '}');


                p = p.getNext();
            }
        }
        return result.toString();
    }
}
