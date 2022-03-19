package com.challenge.stack.structure;

import com.challenge.stack.data.StackNode;

import java.util.EmptyStackException;

public class Stack {
    private StackNode top;

    public boolean empty(){
        return top == null;
    }

    public StackNode push(StackNode stackNode){
        if (!empty()) {
            stackNode.setNext(top);

        }
        top=stackNode;
        return stackNode;

    }

    public StackNode pop(){
        StackNode r;

        if(empty()){
            return null;
        }else{
            r = top;
            top = top.getNext();
            return r;
        }
    }

    public StackNode peek(){
        if(empty()){
            return null;
        }
        return top;
    }

    @Override
    public String toString() {
        StackNode p = top;
        StringBuilder result = new StringBuilder();

        if(empty()){
            return null;
        }else {
            while (p != null){
                result.append("{").append("value=").append(p).append('}');
                p= p.getNext();
            }
        }
        return result.toString();
    }
}
