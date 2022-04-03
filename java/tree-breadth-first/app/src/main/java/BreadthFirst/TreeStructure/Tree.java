package BreadthFirst.TreeStructure;

import BreadthFirst.TreeData.BinaryNode;
import BreadthFirst.TreeData.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Tree<Type extends Comparable<Type>> {

    private Node<Type> root;

    private int size;

    public int getSize() {
        return size;
    }

    public Node<Type> getRoot() {
        return root;
    }

    public void setRoot(Node<Type> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }


    public void add(Type data){
        if(isEmpty()){
            root = new BinaryNode<>(data);
            size++;
        }else {
            add(data,root);

        }
    }

    private void add(Type data , Node<Type> root){
        if(data.compareTo(root.getData())< 0){
            if(root.getLeftNode()!=null){
                add(data,root.getLeftNode());

            }else {
                Node<Type> newNode = new BinaryNode<>(data);
                root.setLeftNode(newNode);
//                size++;
            }
        }else if(data.compareTo(root.getData()) >0){
            if(root.getRightNode() != null){
                add(data,root.getRightNode());
            }else {
                Node<Type> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
//                size++;
            }
            size++;
        }

    }

    public enum TraversalOrder{
        INORDER,
        PREORDER,
        POSTORDER,
        BreadthFirst
    }

    public void traverse(TraversalOrder order){
        switch (order) {
            case INORDER -> inOrder(root);
            case PREORDER -> preOrder(root);
            case POSTORDER -> postOrder(root);
            case BreadthFirst -> BreadthFirst(root);
            default -> {
            }

        }
    }

    private void inOrder(Node<Type> node){
        if(node == null){
            return;
        }

        inOrder(node.getLeftNode());
        print(node);
        inOrder(node.getRightNode());
    }

    private void preOrder(Node<Type> node){
        if(node == null){
            return;
        }

        print(node);
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(Node<Type> node){

        if(node == null){
            return;
        }

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        print(node);
    }

    private void print(Node<Type> node){
        System.out.print(node.getData() + " => ");
    }

    private void BreadthFirst(Node<Type> node){
        Queue<Node<Type>> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node<Type> temp = queue.remove();
            System.out.print(temp.getData() + " ");

            if(temp.getLeftNode() !=null)
                queue.add(temp.getLeftNode());
            if (temp.getRightNode() != null)
                queue.add(temp.getRightNode());
        }
    }

    public String BreadthFirst(){
        Queue<Node<Type>> queue = new LinkedList<>();
        String result = "";
        queue.add(root);
        while (!queue.isEmpty()){
            Node<Type> temp = queue.remove();

            result = result + temp.getData() + " ";

            if(temp.getLeftNode() !=null)
                queue.add(temp.getLeftNode());
            if (temp.getRightNode() != null)
                queue.add(temp.getRightNode());
        }
        return result;
    }

}
