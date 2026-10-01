package s6day2;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class graph1 {
    private List<String[]> edges = new ArrayList<>();

    void addEdge(String u, String v) {
        edges.add(new String[]{u, v});
    }

    public static void main(String[] args) {
        graph1 g = new graph1();

        g.addEdge("q", "w");
        g.addEdge("w", "e");
        g.addEdge("e","r");
        g.addEdge("r","t");

        System.out.println(g.edges);
    }
}

