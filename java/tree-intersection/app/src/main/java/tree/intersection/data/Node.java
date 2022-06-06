package tree.intersection.data;

public abstract class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    private final T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node<T> liftNode) {
        this.leftNode = liftNode;
    }

    public Node<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getData() {
        return data;
    }



    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", liftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}
