package fizzBuzz.Data;

public class Node <Type extends Comparable<Type>> implements Comparable<Type>{

    private Type data;
    private Node<Type> left;
    private Node<Type> right;


    public Node(Type data) {
        this.data = data;
    }

    public Node<Type> getLeft() {
        return left;
    }

    public void setLeft(Node<Type> left) {
        this.left = left;
    }

    public Node<Type> getRight() {
        return right;
    }

    public void setRight(Node<Type> right) {
        this.right = right;
    }

    public Type getData() {
        return data;
    }

    public void setData(Type data) {
        this.data = data;
    }

    @Override
    public int compareTo(Type o) {
        return 0;
    }
}
