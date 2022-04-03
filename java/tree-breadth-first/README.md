# Challenge Summary

Write a function to list all values in the tree in the order they were encountered

## Whiteboard Process

![Whiteboard](./img/Whiteboard%20(4).png)

## Approach & Efficiency

1. create a method that takes tree node
2. create a queue 
3. add the node to the queue
4. iterate through the queue
5. create new tree node
6. remove data from the queue and save it in the new node
7. check if the node left is not empty add the left node to the queue 
8. check if the node right is not empty add the right node to the queue

## Solution

```java
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();

        tree.add(15);
        tree.add(13);
        tree.add(17);
        tree.add(4);
        tree.add(12);
        tree.add(16);
        tree.add(18);
        tree.add(23);


        tree.traverse(Tree.TraversalOrder.BreadthFirst);


    }
```

```java
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
```