package trees.structure;

import trees.Data.BinaryNode;
import trees.Data.Node;

public class BinarySearchTree<Type extends Comparable<Type>> {

    private Node<Type> root;
    private int size;

    public int getSize() {
        return size;
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
                size++;
            }
        }else if(data.compareTo(root.getData()) >0){
            if(root.getRightNode() != null){
                add(data,root.getRightNode());
            }else {
                Node<Type> newNode = new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
    }

    public boolean contains(Type data){
        if(isEmpty()){
            return false;
        }else {
            return contains(data,root);
        }
    }

    private boolean contains(Type data, Node<Type> root){

        if(data.compareTo(root.getData()) == 0){
            return true;
        }else if(data.compareTo(root.getData())< 0){
            if(root.getLeftNode() != null){
                return   contains(data,root.getLeftNode());
            }
            return false;
        }else {
            if(root.getRightNode() != null){
                return    contains(data,root.getRightNode());
            }
            return false;
        }

    }

    public boolean isEmpty(){
        return root == null;
    }
}
