package trees.Data;

public abstract class Node<Type> {

    private final int data;

    private Node<Type> leftNode;
    private Node<Type> rightNode;


    public Node(Type data) {
        this.data = (int) data;
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

    public int getData() {
        return data;
    }

    public abstract int compareTo(Type o);
}
