package U4_HashTables.Set;

public class HashTable {
//    Implement the set method for the HashTable class that stores a key-value pair in the hash table.
//    If the key already exists, update the associated value (this part is different than what was shown in the video).
//    Return type: void
//    The method should perform the following tasks:
//    Accept a string key and an integer value as arguments.
//    Calculate the index for the given key using the hash function.
//    Create a new Node with the given key and value.
//            Check if the dataMap array at the calculated index is empty (null).
//    If it is empty, assign the new node to the array at the calculated index.
//    If the array at the calculated index is not empty, iterate through the linked list at the index.
//            Check if the key of the current node is the same as the given key.
//    If it is the same, update the value of the current node by adding the new value.
//    If it is not the same and the current node is the last node in the linked list, add the new node to the list.
//


    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    ///  WRITE SET METHOD HERE  ///

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }


}

















