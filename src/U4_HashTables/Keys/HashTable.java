package U4_HashTables.Keys;

import java.util.ArrayList;

public class HashTable {
//    Implement the keys method for the HashTable class that retrieves all the keys in the hash table and returns them as an ArrayList.
//    Return type: ArrayList
//    The method should perform the following tasks:
//    Create a new ArrayList<String> called allKeys.
//    Iterate through the dataMap array using a for loop.
//    For each index, create a temporary Node variable and assign it to the current array element.
//    Iterate through the linked list at the current index using a while loop.
//    Add the key of the current node to the allKeys ArrayList.
//    Move on to the next node in the linked list.
//    Return the allKeys ArrayList.

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
        for(int i = 0; i < dataMap.length; i++) {
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

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if (temp.key == key) {
                temp.value += value;
                return;
            }
            while (temp.next != null) {
                temp = temp.next;
                if (temp.key == key) {
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    ///  WRITE KEYS METHOD HERE  ///
    public ArrayList keys (){
        ArrayList allKeys = new ArrayList<>();
        for (int i = 0; i < dataMap.length; i++) {
            if (dataMap[i] == null){

            }else {
                Node temp;
                temp = dataMap[i];
                while (temp != null){
                    allKeys.add(temp.key);
                    temp = temp.next;
                }
            }

        }
return allKeys;


    }


}