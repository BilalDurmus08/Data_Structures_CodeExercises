package U4_HashTables.Get;

public class HashTable {
//    mplement the get method for the HashTable class that retrieves the value associated with a given key in the hash table. If the key is not found, return 0.
//    Return type: int
//    The method should perform the following tasks:
//    Accept a string key as an argument.
//    Calculate the index for the given key using the hash function.
//    Retrieve the Node at the calculated index in the dataMap array.
//    Iterate through the linked list at the index, checking each node for a matching key.
//    If a matching key is found, return the value associated with that key.
//    If the end of the linked list is reached and no matching key is found, return 0.
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

    ///  WRITE GET METHOD HERE  ///
    public int get(String key){
        int index = hash(key);
        if (dataMap[index] == null){
            return 0;
        }
        Node temp = dataMap[index];
        while (temp != null){
            if (temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;



        }
        return 0;





    }





}