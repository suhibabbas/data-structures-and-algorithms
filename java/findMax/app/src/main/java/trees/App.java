/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import trees.Data.BinaryNode;
import trees.structure.BinaryTree;

public class App {

    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

//        tree.setRoot(new BinaryNode<>(2));
//
//        tree.getRoot().setLeftNode(new BinaryNode<>(7));
//        tree.getRoot().setRightNode(new BinaryNode<>(5));
//
//        tree.getRoot().getLeftNode().setLeftNode(new BinaryNode<>(2));
//        tree.getRoot().getLeftNode().setRightNode(new BinaryNode<>(6));
//        tree.getRoot().getRightNode().setRightNode(new BinaryNode<>(9));
//
//        tree.getRoot().getLeftNode().getRightNode().setLeftNode(new BinaryNode<>(5));
//        tree.getRoot().getLeftNode().getRightNode().setRightNode(new BinaryNode<>(11));
//        tree.getRoot().getRightNode().getRightNode().setLeftNode(new BinaryNode<>(4));


        System.out.println(tree.findMax());
    }
}
