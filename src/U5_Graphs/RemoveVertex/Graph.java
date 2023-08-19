package U5_Graphs.RemoveVertex;

import java.util.ArrayList;
import java.util.HashMap;

//Graph: Remove Vertex
//        Implement the removeVertex method for the Graph class that removes a vertex and all its associated edges from the graph's adjacency list.
//        Return type: boolean
//        The method should perform the following tasks:
//        Check if the vertex is present in the adjList HashMap.
//        If the vertex is not present, return false to indicate that the vertex was not removed.
//        If the vertex is present, iterate through its value list (i.e., its neighbors) in the adjList.
//        For each neighbor, remove the vertex from the neighbor's value list in the adjList.
//        Remove the vertex from the adjList HashMap.
//        Return true to indicate that the vertex was removed successfully.
public class Graph {

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

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    // WRITE REMOVEVERTEX METHOD HERE //
    public boolean removeVertex(String vertex){
        if (adjList.get(vertex) == null){
            return false;
        }
        for (String s : adjList.get(vertex)){
            adjList.get(s).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }


}