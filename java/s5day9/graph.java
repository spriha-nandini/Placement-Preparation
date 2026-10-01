package s5day9;
import java.util.*;
public class graph { // Class names should start with uppercase letter
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency list
    
    public graph(int v) { // Constructor should be public
        V = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    // Additional useful methods for a graph class:
    
    // Get number of vertices
    public int getVertexCount() {
        return V;
    }
    
    // Get neighbors of a vertex
    public List<Integer> getNeighbors(int v) {
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("Vertex index out of bounds");
        }
        return adj[v];
    }
    
    // Print the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    // BFS traversal
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        
        visited[startVertex] = true;
        queue.add(startVertex);
        
        System.out.print("BFS starting from vertex " + startVertex + ": ");
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            
            for (Integer neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    
    // DFS traversal (recursive)
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS starting from vertex " + startVertex + ": ");
        DFSUtil(startVertex, visited);
        System.out.println();
    }
    
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        
        for (Integer neighbor : adj[v]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}

// Example usage class
class GraphExample {
    public static void main(String[] args) {
        graph g = new graph(5);
        
        // Add edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        
        // Print the graph
        g.printGraph();
        
        // Perform traversals
        g.BFS(0);
        g.DFS(0);
    }
}