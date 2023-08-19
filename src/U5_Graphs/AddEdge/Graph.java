package U5_Graphs.AddEdge;

import java.util.ArrayList;
import java.util.HashMap;


public class Graph {

//    Graph: Add Edge
//    Implement the addEdge method for the Graph class that adds an edge between two vertices in the graph's adjacency list.
//    Return type: boolean
//    The method should perform the following tasks:
//    Check if both vertex1 and vertex2 are present in the adjList HashMap.
//    If both vertices are present, add vertex2 to the value list of vertex1 and vertex1 to the value list of vertex2 in the adjList.
//            Return true to indicate that the edge was added successfully.
//    If either vertex1 or vertex2 is not present, return false to indicate that the edge was not added.


    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    // WRITE ADDEDGE METHOD HERE //

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;

    }


}





