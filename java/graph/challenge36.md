# Challenge Summary

Write a function that take a node as argument and return a collection of nodes in the order they were visited

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(14).png)

## Approach & Efficiency

- create a method that accepts a string node as input
- create a set of visited and a queue
- add the node to the queue and to the set
- iterate through the queue and create vertex and pull the queue to it
- loop through all the vertices
- check if the visited contains the node if no add it to the queue and visited

## Solution

```java

 public Set<String> bfs (Graph graph,String root){
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()){
            String vertex = queue.poll();
            for (Node node:graph.getAdjVertices(vertex)
                 ) {
                if(!visited.contains(node.data)){
                    queue.add(node.data);
                    visited.add(node.data);
                }
            }
        }
        return visited;
    }
```
