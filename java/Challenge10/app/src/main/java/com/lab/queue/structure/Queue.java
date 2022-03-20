package com.lab.queue.structure;



import com.lab.queue.data.QueueNode;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Queue<Type> {

    private QueueNode<Type> front;
    private QueueNode<Type> back;

    private static final int QUEUE_SIZE = 10;

    private int size;

    public Queue() {
         size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public boolean enqueue(Type data){
        QueueNode<Type> queueNode = new QueueNode<>(data);
        if (isEmpty()){
            front = queueNode;
            back = queueNode;
            size++;
            return true;
        }else {
            if (size < QUEUE_SIZE){
                queueNode.setNext(back);
                back = queueNode;
                size++;
                return true;
            }
        }
        return false;
    }

    public QueueNode<Type> dequeue() {
        QueueNode<Type> frontTemp;
        QueueNode<Type> backNode;
        if (isEmpty()) {
            throw new NoSuchElementException("The queue is empty");
        } else {
            frontTemp = front;
            backNode =back;
            front = front.getNext();

            while (backNode != frontTemp){
                front = backNode;

                backNode =backNode.getNext();
            }
            size--;
        }

        return frontTemp;
    }



    public QueueNode<Type> peek() {
       if(isEmpty()){
           return null;
       }else {
           return front;
       }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                ", size=" + size +
                '}';
    }
}
