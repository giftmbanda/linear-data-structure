package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SinglyLinkedList<Integer> numList = new SinglyLinkedList<>();

        numList.addNode(1);
        numList.addNode(2);
        numList.addNode(3);
        numList.addNode(4);
        numList.addNode(5);
        numList.addNode(5);
        numList.addNodeFirst(0);

        //  Displays the nodes present in the list
        System.out.println("Is list empty: " + numList.isEmpty());
        numList.showNodes();
        System.out.println("Length: " + numList.size());
        numList.removeDuplicateNodes();
        numList.showNodes();
        System.out.println("Length: " + numList.size());
    }
}
