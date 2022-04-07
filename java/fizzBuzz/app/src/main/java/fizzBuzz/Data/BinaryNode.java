package fizzBuzz.Data;

public class BinaryNode<Type extends Comparable<Type>>extends Node<Type> {
    public BinaryNode(Type data) {
        super(data);
    }

    @Override
    public int compareTo(Type o) {
        return 0;
    }
}
