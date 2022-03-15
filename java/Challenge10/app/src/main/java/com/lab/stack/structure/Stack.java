package com.lab.stack.structure;

import com.lab.stack.data.StackNode;
import org.w3c.dom.Node;

import java.util.EmptyStackException;

public class Stack {

    private StackNode top;

    public boolean empty(){
        return top == null;
    }

    public StackNode push(StackNode stackNode){
        //check if stack is empty
        if (!empty()) {
            // make stack node point to what top is pointing to
            stackNode.setNext(top);
        }
        // make top point to stack node
        top = stackNode;
        return stackNode;

    }

    public StackNode pop(){

        if(empty()){
            throw new EmptyStackException();
        }else {
           return top = top.getNext();
        }


    }

    public StackNode peek(){
        if(empty()){
            throw new EmptyStackException();
        }
        return top;
    }

    @Override
    public String toString() {
        StackNode p = this.top;
        StringBuilder r = new StringBuilder();
        if(empty()){
            throw new EmptyStackException();
        }else {
            while (p != null){
                r.append("Stack{").append("top=").append(top).append('}');
                p = p.getNext();
            }
        }

       return r.toString();

    }
}
