package trees.structure;

import trees.Data.Node;

public class  BinaryTree <Type extends Comparable<Type>> {

    private Node<Type> root;


    public enum TraversalOrder{
        INORDER,
        PREORDER,
        POSTORDER
    }

    public Node<Type> getRoot() {
        return root;
    }

    public void setRoot(Node<Type> root) {
        this.root = root;
    }

    public void traverse(TraversalOrder order){
        switch (order) {
            case INORDER -> inOrder(root);
            case PREORDER -> preOrder(root);
            case POSTORDER -> postOrder(root);
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
}
