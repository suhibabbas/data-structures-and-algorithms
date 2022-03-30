package trees.Data;

public abstract class Node<Type extends Comparable<Type>> implements Comparable<Type> {

    private final Type data;

    private Node<Type> leftNode;
    private Node<Type> rightNode;


    public Node(Type data) {
        this.data = data;
    }

    public Node<Type> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<Type> leftNode) {
        this.leftNode = leftNode;
    }

    public Node<Type> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<Type> rightNode) {
        this.rightNode = rightNode;
    }

    public Type getData() {
        return data;
    }
}
