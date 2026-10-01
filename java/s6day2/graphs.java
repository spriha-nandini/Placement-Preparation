//types of graphs are 1.) unweighted graph  2.)weighted graph  3.)directed graph  4.) undirected graph  5.)cyclic
//1.) unweighted:edges dont have weight
//2.)weighted:edges have weight(cost,distance)
//3.)directed graph: edges have direction
//4.)undirected graph:edged do not have direction
//5.)cyclic graph: 
package s6day2;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class graphs {
    Map<String,List<String>> graph = new HashMap<>();
    void addEdge(String u, String v){
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }
    public static void main(String[] args){
        graphs g=new graphs();
        g.addEdge("A","B");
        g.addEdge("B","C");

        System.out.println(g.graph);
    }
}