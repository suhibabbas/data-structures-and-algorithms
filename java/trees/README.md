# Trees

A tree data structure is a non-linear data structure because it does not store in a sequential manner. It is a hierarchical structure as elements in a Tree are arranged in multiple levels.

In the Tree data structure, the topmost node is known as a root node. Each node contains some data, and data can be of any type.

## Challenge

1. **Node:** Create a Node class that has properties for the value stored in the node, the left child node, and the right child node
2. **Binary Tree:** Create a Binary Tree class and Define a method for each of the depth first traversals:
    - pre order
    - in order
    - post order
    Any exceptions or errors that come from your code should be semantic
3. **Binary Search Tree:** must have the following methods:
    - Add
    - Contains

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

**Binary Tree:**

- space => O(1)
- time => O(n)

**Binary Search Tree:**

add Time => O(n)
add Space => O(1)

contain Time => o(log n)
contain Space => o(log n)

## API

### Binary Tree

in order method will print:(```Left - Root - Right```)

```java
    private void inOrder(Node<Type> node){
        if(node == null){
            return;
        }

        inOrder(node.getLeftNode());
         print(node);
        inOrder(node.getRightNode());
    }
```

post order method will print:(```Left - Right - Root```)

```java
    private void postOrder(Node<Type> node){

        if(node == null){
            return;
        }

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        print(node);
    }
```

pre order method will print:(```Root - Left - Right```)

```java
    private void preOrder(Node<Type> node){
        if(node == null){
            return;
        }

        print(node);
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }
```

### Binary Search Tree

to add the data

```java
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
```

to check if the tree contains specific data

```java
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
```
