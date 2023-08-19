package U5_Graphs.AddVertex;

import java.util.ArrayList;
import java.util.HashMap;

//Implement the addVertex method for the Graph class that adds a vertex to the graph's adjacency list.
//        Return type: boolean
//        The method should perform the following tasks:
//        Check if the vertex is already present in the adjList HashMap.
//        If it is not present, add the vertex to the adjList with an empty ArrayList<String> as its value.
//        Return true to indicate that the vertex was added successfully.
//        If the vertex is already present, return false to indicate that the vertex was not added.

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    // WRITE ADDVERTEX METHOD HERE //

    public boolean addVertex(String string) {
        if (adjList.get(string) == null) {
            adjList.put(string, new ArrayList<String>());
            return true;
        } else {
            return false;
        }


    }


}