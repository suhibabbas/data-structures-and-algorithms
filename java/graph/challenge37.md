# Challenge Summary

write a function accept a graph and array to calculate the cost of trip

## Whiteboard Process

![whiteboard](./img/Whiteboard%20(19).png)

## Approach & Efficiency

- create method accepts graph and array
- iterate through the array and get the weight for the node at current index and the next one
- return the cost

get weight method

- create List of vertices
- iterate through the list
- check if vertex data equal the visited then weight equal the vertex weight
- return the weight

## Solution

```java
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

 public static String businessTripCost(Graph graph , ArrayList<String> cities){

       int cost = 0;
       for(int i = 0; i<cities.size() - 1 ; i++){
           cost += graph.getWeight(cities.get(i),cities.get(i+1));
       }
       if(cost == 0 ){
           return null;
       }
       return cost +"$";
    }
```
