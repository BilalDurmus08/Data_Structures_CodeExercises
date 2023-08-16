package U4_HashTables.Constructor;

public class HashTable {
    int size = 7;
    private Node dataMap[];
    public HashTable(){
        dataMap = new Node[size];
    }


    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//
    public class Node{
    public String key;
    public int value;
    public Node next;

    public Node(String key, int value){
        this.key = key;
        this.value = value;

    }

    }





    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }

}