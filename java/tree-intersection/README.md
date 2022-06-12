# Challenge Summary

Write a function that takes two binary trees as parameters.
Using your Hashmap implementation as a part of your algorithm, return a set of values found in both trees.

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(25).png)

## Approach & Efficiency

Time => O(n^2)
space => O(Log n)

## Solution

```java
public static HashMap<Integer,Integer> treeIntersection(TreeIntersection<Integer> treeIntersection1, TreeIntersection<Integer> treeIntersection2){
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for (int node1:treeIntersection1.getInOrder()
             ) {
            for (int node2: treeIntersection2.getInOrder()
                 ) {
                if(node1 == node2 ){
                    hashMap.set(node1,node2);
                }
            }
        }

        return hashMap;

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
```
