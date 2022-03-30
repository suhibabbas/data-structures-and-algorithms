# Challenge Summary

write a method that find the maximum value in tree.

## Whiteboard Process

![Whiteboard](./img/Whiteboard%20(3).png)

## Approach & Efficiency

1. create a method that return integer
2. create a recursion method that accepts node
3. check if the tree is empty
4. call the recursion method with the current root node 
5. check if the node is empty return 0
6. create three integers (max-left-right)
7. the max equals root value
8. left equals the  recursion method to the root left
9. right equals the  recursion method to the root right
10. check if left more than max  
11. check if right more than max
12. return max

## Solution

```java
public class App {

    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.setRoot(new BinaryNode<>(2));

        tree.getRoot().setLeftNode(new BinaryNode<>(7));
        tree.getRoot().setRightNode(new BinaryNode<>(5));

        tree.getRoot().getLeftNode().setLeftNode(new BinaryNode<>(2));
        tree.getRoot().getLeftNode().setRightNode(new BinaryNode<>(6));
        tree.getRoot().getRightNode().setRightNode(new BinaryNode<>(9));

        tree.getRoot().getLeftNode().getRightNode().setLeftNode(new BinaryNode<>(5));
        tree.getRoot().getLeftNode().getRightNode().setRightNode(new BinaryNode<>(11));
        tree.getRoot().getRightNode().getRightNode().setLeftNode(new BinaryNode<>(4));


        System.out.println(tree.findMax());
    }
}
```

