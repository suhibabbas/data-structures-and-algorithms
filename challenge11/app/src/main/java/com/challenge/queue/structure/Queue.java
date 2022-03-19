package com.challenge.queue.structure;

import com.challenge.stack.data.StackNode;
import com.challenge.stack.structure.Stack;

import java.util.NoSuchElementException;

public class Queue {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

private static final int QUEUE_SIZE = 5;
private int size;

public boolean enQueue(StackNode data){

    if(size<QUEUE_SIZE){
        while (stack1.peek() != null){
            stack2.push(stack1.pop());

        }

        stack1.push(data);

        while (stack2.peek() != null){
            stack1.push(stack2.pop());
        }
        size++;
        return true;
    }
    return false;
}

public StackNode deQueue(){
    StackNode temp;
    if(isEmpty()){
        throw new NoSuchElementException("the queue is empty");
    }else {
        temp = stack1.peek();
        stack1.pop();
        size--;
    }
    return temp;
}
public boolean isEmpty(){
    if (stack1.peek() == null){
        return true;
    }else {
        return false;
    }

    }

    @Override
    public String toString() {
    try {
        if(isEmpty()){
            return "no data";
        }else {
            return
                    "data=" + stack1;
        }

    }catch (Exception e){
        System.err.println(e.getMessage());
    }
   return "";
    }
}
