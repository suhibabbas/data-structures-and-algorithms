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

Time => BigO(n+2e)
Space =>BigO(n)

## API

1. add node - `addNode()` : this method used to add new data.
2. add edge - `addEdge()` : this method used to link the data.
3. get node - `getNode()` : this method print all the data and its connection.
4. get neighbors - `bfs()`: this method return all the data that connected to a specific node.
