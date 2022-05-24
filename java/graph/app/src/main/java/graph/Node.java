package graph;

import java.util.Objects;

public class Node {

    String data;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node vertex = (Node) o;
        return Objects.equals(data, vertex.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
