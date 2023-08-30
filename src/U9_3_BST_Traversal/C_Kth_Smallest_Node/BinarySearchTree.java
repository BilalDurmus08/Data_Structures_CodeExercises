package U9_3_BST_Traversal.C_Kth_Smallest_Node;

import java.util.Stack;

//BST: Kth Smallest Node ( ** Interview Question)
//        The kthSmallest(int k) method should find the kth smallest element in the binary search tree. If such an element exists,
//        the method should return its value. If not, it should return null. The smallest element in the tree is the one with the lowest value,
//        the second smallest element is the one with the second lowest value, and so on.
//
//        The method should use the in-order traversal technique to visit the nodes of the tree, i.e.,
//        it should first visit the left child, then the parent, and finally the right child. To implement this, use a Stack<Node> to store the nodes.
//        Continue with the traversal as long as there are nodes in the stack or the current node is not null.
//
//        While the current node is not null, push it onto the stack and move to its left child. Then, once the current node is null,
//        pop a node from the stack, decrement k by one, and if k is zero, return the value of the popped node. Finally,
//        move to the right child of the popped node.
//
//        Examples
//
//        For example, if the binary search tree contains the elements [5, 3, 7, 2, 4, 6, 8] and k is 1,
//        the method should return 2 as this is the smallest element. If k is 3, it should return 4,
//        the third smallest element. If k is 6, it should return 7, the sixth smallest element. If k is greater than the number of elements in the tree,
//        the method should return null.


public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // WRITE KTHSMALLEST METHOD HERE //
    public int kthSmallest(int k) {
        Stack<Node> myStack = new Stack<>();

        class Traverse {
            Traverse(Node current) {
                if (current.left != null) {
                    new Traverse(current.left);
                }
                myStack.push(current);
                if (current.right != null) {
                    new Traverse(current.right);
                }
            }
        }
        new Traverse(root);
        int length = myStack.size() - k;
        while (length > 0) {
            length--;
            myStack.pop();
        }
        Node temp = myStack.pop();

        return temp.value;
    }


}
