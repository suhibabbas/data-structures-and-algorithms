package MultiBracket.stucture;


import MultiBracket.data.Node;

import java.util.EmptyStackException;

public class Stack<Type> {

    private Node top;

    public boolean empty() {
        return top == null;
    }

    public void push(char data) {
        Node<Type> node = new Node(data);
        if (!empty()) {
            node.setNext(top);
        }
        top = node;
    }

    public Node<Type> pop(){
        Node<Type> r;

        if(empty()){
            throw new EmptyStackException();
        }else{
            r = top;
            top = top.getNext();
            return r;
        }
    }

    public Node<Type> peek(){
        Node newNode = new Node<>("");
        if(empty()){
            return newNode;
        }
        return top;

    }

    public boolean ValidateBrackets(String input) {
        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);

            if(character == '{' || character == '[' || character == '('){
                push(character);
            }else if (character == '}' && !peek().getData().equals('{') ){
                return false;

            }else if(character == ']' && !peek().getData().equals('[')){
                return false;
            }else if(character == ')' && !peek().getData().equals('(')){
                return false;
            }
        }
        return true;
    }
}
