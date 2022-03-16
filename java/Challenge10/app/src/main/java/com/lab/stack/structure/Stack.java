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
        if (!empty()) {
            stackNode.setNext(top);

        }
        top=stackNode;
        return stackNode;

    }

    public StackNode pop(){
        StackNode r;

        if(empty()){
            throw new EmptyStackException();
        }else{
            r = top;
            top = top.getNext();
            return r;
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
        StackNode p = top;
        StringBuilder result = new StringBuilder();

        if(empty()){
            throw new EmptyStackException();
        }else {
            while (p != null){
                result.append("Stack{").append("value=").append(p).append('}');
                p= p.getNext();
            }
        }
        return result.toString();
    }
}
