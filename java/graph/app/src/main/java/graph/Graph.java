package graph;

import java.util.*;

public class Graph {

    private Map<Node, List<Node>> adjVertices;


    public Graph(){
        this.adjVertices=new HashMap<>();
    }

    public String addNode(String data){
        Node node = new Node(data);
        adjVertices.putIfAbsent(node,new ArrayList<>());

        return node.toString();
    }

    public void addEdges(String d1,String d2){
        Node v1 = new Node(d1);
        Node v2 = new Node(d2);

        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v2);
    }

    public String  getVertices(){
        StringBuilder stringBuilder= new StringBuilder();
        for(Node v : adjVertices.keySet()){
            stringBuilder.append(v);
            stringBuilder.append(adjVertices.get(v));
        }
        return stringBuilder.toString();
    }

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
    public List<Node> getAdjVertices(String data){
            return adjVertices.get(new Node(data));
    }

    public int size(Graph graph){
        return graph.adjVertices.size();
    }

}
