package com.company;

public class Main {

        public static void main(String[] args) {

                Queue<Integer> numQueue = new Queue<>(); // last-in-first-out/LIFO
                Stack<Integer> numStack = new Stack<>(); // first-in-last-out/FILO
                SinglyLinkedList<Integer> numList = new SinglyLinkedList<>();

                // =================== Implementation of Queue =======================
                numQueue.enqueue(1);
                numQueue.enqueue(2);
                numQueue.enqueue(3);
                numQueue.enqueue(4);
                numQueue.enqueue(5);

                System.out.println("Queue length: " + numQueue.size());
                System.out.println("Is the Queue empty: " + numQueue.isEmpty());
                numQueue.print();
                numQueue.dequeue();
                System.out.println("After dequeuing out");
                numQueue.print();

                // =================== Implementation of Stack =======================
                numStack.push(1);
                numStack.push(2);
                numStack.push(3);
                numStack.push(4);
                numStack.push(5);

                System.out.println("Stack length: " + numStack.size());
                System.out.println("Is the stack empty: " + numStack.isEmpty());
                numStack.print();
                numStack.pop();
                System.out.println("After popping out");
                numStack.print();

                // =================== Implementation of LinkedList =======================
                numList.addNode(1);
                numList.addNode(2);
                numList.addNode(3);
                numList.addNode(4);
                numList.addNode(5);
                numList.addNode(5);
                numList.addNodeFirst(0);

                System.out.println("Is list empty: " + numList.isEmpty());
                numList.print();
                System.out.println("List length: " + numList.size());
                numList.removeDuplicates();
                System.out.println("After removing duplicate nodes");
                numList.print();
        }

}
