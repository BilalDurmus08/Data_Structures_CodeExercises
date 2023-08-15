package U2_Stacks_Queues.QueuseUsingStack2;

import java.util.Stack;

public class MyQueue {

//    Queue Using Stacks: Dequeue ( ** Interview Question)
//    Implement the Dequeue Method for a Queue using Two Stacks
//    Description:
//    In this assignment, you are tasked with implementing the dequeue method
//        for a custom queue class called MyQueue using two stacks, stack1 and stack2.
//
//    A queue is a data structure that follows the First-In-First-Out (FIFO) principle,
//    meaning that the first element added to the queue will be the first one to be removed.
//
//    Your implementation must maintain the FIFO order of elements in the queue using two stacks.






    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // WRITE THE DEQUEUE METHOD HERE //
    public Integer dequeue(){
        if (stack1.isEmpty()){
            return null;
        }
    return stack1.pop();


    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }

}