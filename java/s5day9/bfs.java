package s5day9;
import java.util.*;

public class bfs { // Class name should be uppercase
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        int s = 0; // Starting vertex
        ArrayList<Integer> res = new ArrayList<>();
        
        // Handle empty graph
        if (V == 0) return res;
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        
        visited[s] = true;
        q.add(s);
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);
            
            // Visit all neighbors of current vertex
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return res;
    }
    
    // Alternative BFS implementation that takes starting vertex as parameter
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int startVertex) {
        int V = adj.size();
        ArrayList<Integer> res = new ArrayList<>();
        
        if (V == 0) return res;
        if (startVertex < 0 || startVertex >= V) {
            throw new IllegalArgumentException("Start vertex out of bounds");
        }
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        
        visited[startVertex] = true;
        q.add(startVertex);
        
        while (!q.isEmpty()) {
            int curr = q.poll();
            res.add(curr);
            
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return res;
    }
    
    // Helper method to create and test the graph
    public static void main(String[] args) {
        // Create a graph with 5 vertices
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(4);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(2);
        adj.get(4).add(3);
        
        // Perform BFS
        ArrayList<Integer> result = bfs(adj);
        System.out.println("BFS traversal starting from vertex 0: " + result);
        
        // Test with different starting vertex
        ArrayList<Integer> result2 = bfs(adj, 2);
        System.out.println("BFS traversal starting from vertex 2: " + result2);
    }
}
