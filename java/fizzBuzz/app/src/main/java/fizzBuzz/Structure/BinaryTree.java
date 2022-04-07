package fizzBuzz.Structure;

import fizzBuzz.Data.BinaryNode;
import fizzBuzz.Data.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Type extends Comparable<Type>> {
        Node<Type> root;

        public boolean isEmpty(){
                return root == null;
        }

        public void add(Type data){
                if(isEmpty()){
                        root = new BinaryNode<>(data);

                }else {
                        add(data,root);
                }
        }

        private void add(Type data , Node<Type> root){
                if(data.compareTo(root.getData())< 0){
                        if(root.getLeft()!=null){
                                add(data,root.getLeft());
                        }else {
                                Node<Type> newNode = new BinaryNode<>(data);
                                root.setLeft(newNode);

                        }
                }else if(data.compareTo(root.getData()) >0){
                        if(root.getRight() != null){
                                add(data,root.getRight());
                        }else {
                                Node<Type> newNode = new BinaryNode<>(data);
                                root.setRight(newNode);

                        }
                }
        }


        public void fizzbuzz(){
                if(root == null){
                        System.out.println("no data");
                }else{
                        System.out.println("");
                        fizzbuzz((Node<Integer>) root);
                }
        }

        private void  fizzbuzz(Node<Integer> root){
                if(root == null){
                        return;
                }
                if(root.getData()% 3 == 0 && root.getData()% 5 == 0)
                        System.out.print("fizzbuzz => ");
                else if(root.getData()% 5 == 0)
                        System.out.print("buzz => ");
                else if(root.getData()% 3 == 0)
                        System.out.print("fizz => ");
                else
                        System.out.print(root.getData() + " => ");

                fizzbuzz(root.getLeft());
                fizzbuzz(root.getRight());

        }


        public enum TraversalOrder{
                INORDER,
                PREORDER,
                POSTORDER
        }


        public void traverse(TraversalOrder order){
                if (order == TraversalOrder.PREORDER) {
                        preOrder(root);
                }
        }

        private void preOrder(Node<Type> node){
                if(node == null){
                        return;
                }

                print(node);
                preOrder(node.getLeft());
                preOrder(node.getRight());
        }

        private void print(Node<Type> node){
                System.out.print(node.getData() + " => ");
        }


}
