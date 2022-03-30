package trees.structure;

import trees.Data.Node;

public class  BinaryTree <Type extends Comparable<Type>> {

    private Node<Type> root;

    public Node<Type> getRoot() {
        return root;
    }

    public void setRoot(Node<Type> root) {
        this.root = root;
    }

    public boolean isEmpty(){
        return root == null;
    }


    public int findMax(){
        if(isEmpty()){
            return 0;
        }else {
            return findMax(root);
        }
    }

    private int findMax(Node<Type> root){

        if(root == null){
            return 0;
        }

        int max = root.getData();
        int maxLeft = findMax(root.getLeftNode());
        int maxRight = findMax(root.getRightNode());

        if(maxLeft > max){
            max = maxLeft;
        }
        if(maxRight > max){
            max = maxRight;
        }
        return max;
    }
}
