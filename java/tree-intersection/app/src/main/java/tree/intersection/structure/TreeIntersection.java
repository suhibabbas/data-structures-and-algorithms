package tree.intersection.structure;

import tree.intersection.data.BinaryNode;
import tree.intersection.data.Node;

import java.util.HashSet;
import java.util.Set;

public class TreeIntersection<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    public Node<T> getRoot() {
        return root;
    }

    public void add(T data){
        if(isEmpty()){
            root = new BinaryNode<>(data);
            size++;
        }else {
            add(data, root);
        }
    }

    private void add(T data, Node<T> root){
        if(data.compareTo(root.getData())< 0){
            if(root.getLeftNode()!= null){
                add(data,root.getLeftNode());
            }else {
                Node<T> newNode = new BinaryNode<>(data);
                root.setLeftNode(newNode);
                size++;
            }
        } else if (data.compareTo(root.getData())> 0){
            if (root.getRightNode() != null){
                add(data , root.getRightNode());
            }else {
                Node<T> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
    }

    public void traverse(TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            default:
        }
    }

    private void inOrder(Node<T> treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        inOrder(treeNode.getLeftNode()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRightNode()); // right
    }
    public Set<T> getInOrder(){
        Set<T> dataList = new HashSet<>();
        dataList = getInOrder(root,dataList);
        return dataList;
    }

    private Set<T>  getInOrder(Node<T> node, Set<T> dataList){
        if(node ==null){
            return dataList;
        }

        getInOrder(node.getLeftNode(),dataList);
        dataList.add(node.getData());
        getInOrder(node.getRightNode(),dataList);

        return dataList;
    }

    private void preOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeftNode());

        preOrder(treeNode.getRightNode());
    }

    private void postOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeftNode());

        postOrder(treeNode.getRightNode());

        printNode(treeNode);
    }

    private void printNode(Node<T> node) {
        System.out.println(node.getData());
    }

    public boolean contains(T searchTerm) {
        root = containsHelper(searchTerm , root);
        if (root!= null)
            return true;
        else
            return false;
    }

    private Node containsHelper(T searchTerm, Node<T> root) {

        if (root==null || searchTerm.compareTo(root.getData()) == 0)
            return root;
        if (searchTerm.compareTo(root.getData()) <  0 )
            return containsHelper(searchTerm , root.getLeftNode());

        return containsHelper(searchTerm , root.getRightNode());
    }

    public T findMax() {
        if (root == null)
            System.out.println("The node is empty");

        Node<T> current = root;
        while (current.getRightNode() != null)
            current = current.getRightNode();

        return (current.getData());
    }

    public boolean isEmpty(){
        return root == null;
    }

}
