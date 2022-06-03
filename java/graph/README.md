# Graphs

The most popular method for pagination in GraphQL are GraphQL connections.

connections use opaque vocabulary like "cursor", "connection", amd "edge".

## Challenge

Implement a Graph and it should include the following methods:

1. add node
2. add edge
3. get node
4. get neighbors
5. size

## Approach & Efficiency

1. add node \
    Time => BigO(1) \
    Space =>BigO(1)
2. add edge\
    Time => BigO(1)\
    Space =>BigO(1)
3. get node\
    Time => BigO(n)\
    Space =>BigO(n)
4. get neighbors\
    Time => BigO(1)\
    Space =>BigO(1)
5. get size\
    Time => BigO(1)\
    Space =>BigO(1)

## API

1. add node - `addNode()` : this method used to add new data.
2. add edge - `addEdge()` : this method used to link the data.
3. get node - `getNode()` : this method print all the data and its connection.
4. get neighbors - `bfs()`: this method return all the data that connected to a specific node.

## Depth First Search

The DFS algorithm is a recursive algorithm that uses the idea of backtracking. It involves exhaustive searches of all the nodes by going ahead, if possible, else by backtracking.
This recursive nature of DFS can be implemented using stacks.

``` java
DFS-iterative (G, s):                                   //Where G is graph and s is source vertex
      let S be stack
      S.push( s )            //Inserting s in stack 
      mark s as visited.
      while ( S is not empty):
          //Pop a vertex from stack to visit next
          v  =  S.top( )
         S.pop( )
         //Push all the neighbours of v in stack that are not visited   
        for all neighbours w of v in Graph G:
            if w is not visited :
                     S.push( w )         
                    mark w as visited


    DFS-recursive(G, s):
        mark s as visited
        for all neighbours w of s in Graph G:
            if w is not visited:
                DFS-recursive(G, w)
```