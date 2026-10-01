package s6day2;
import java.util.*;

public class weightedgraph {

    // Each edge = destination + weight
    static class Edge {
        String to;
        int weight;

        Edge(String to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        public String toString() {
            return to + "(" + weight + ")";
        }
    }

    Map<String, List<Edge>> graph = new HashMap<>();

    void addEdge(String u, String v, int w) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Edge(v, w));
    }

    public static void main(String[] args) {
        weightedgraph g = new weightedgraph();

        g.addEdge("A", "B", 5);
        g.addEdge("A", "C", 10);
        g.addEdge("B", "D", 2);
        g.addEdge("q","w",3);

        System.out.println(g.graph);
    }
}

