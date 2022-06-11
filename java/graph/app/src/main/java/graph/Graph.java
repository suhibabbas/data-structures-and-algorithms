package graph;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;


    public Graph(){
        this.adjVertices=new HashMap<>();
    }

    public String addNode(String data){
        Vertex vertex = new Vertex(data);
        adjVertices.putIfAbsent(vertex,new ArrayList<>());

        return vertex.toString();
    }

    public void addEdges(String d1,String d2 ){
        Vertex v1 = new Vertex(d1);
        Vertex v2 = new Vertex(d2);

        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v2);
    }

    public void addEdges(String data1, String data2, int weight){
      Vertex vertex1 = new Vertex(data1,weight);
      Vertex vertex2 = new Vertex(data2, weight);

      adjVertices.get(vertex1).add(vertex2);
      adjVertices.get(vertex2).add(vertex1);
    }

    public Set getNodes(){
        return adjVertices.keySet();
    }

    public int BusinessTripCost(String[] cities){

        String data = cities[0];
        List<Vertex> list = adjVertices.get(new Vertex(data));
        for (String c :cities
             ) {

        }


    return 0;
    }

//    public String getNode(){
//
//        ArrayList<Object> vertices = new ArrayList<>();
//        if(size() == 0)
//            return null;
//        StringBuilder stringBuilder= new StringBuilder();
//        for(Vertex v : adjVertices.keySet()){
//            stringBuilder.append(v);
//            stringBuilder.append(adjVertices.get(v));
//
////            vertices.add(v);
//            vertices.add(adjVertices.get(v));
//
//
//        }
//        System.out.println(vertices);
//        return stringBuilder.toString();
//    }

    public int getWeight(String vertex , String visited){
    List<Vertex> list = adjVertices.get(new Vertex(vertex));
    int weight =0;
    for(Vertex v : list){
        if(Objects.equals(v.getData(), visited)){
            weight = v.getWeight();
        }
    }
    return weight;
    }

    public List<Vertex> getNeighbors(String data){


            return adjVertices.get(new Vertex(data));
    }

    public Set<String> dfs(Graph graph ,String root){
        Set<String> visited =new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        visited.add(root);

        while (!stack.isEmpty()){
            String n = stack.peek();
            stack.pop();

            for (Vertex vertex: graph.getNeighbors(n)){
                if(!visited.contains(vertex.data)){
                    stack.push(vertex.data);
                    visited.add(vertex.data);
                }
            }
        }
        return visited;
    }

    public Set<String> bfs (Graph graph,String root){
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);

        while (!queue.isEmpty()){
            String poll = queue.poll();
            for (Vertex vertex:graph.getNeighbors(poll)
            ) {
                if(!visited.contains(vertex.data)){
                    queue.add(vertex.data);
                    visited.add(vertex.data);
                }
            }
        }
        return visited;
    }

    public int size(){
        return adjVertices.size();
    }

}
