package com.company;

public class SinglyLinkedList<T> {
    private Node<T> head; // Represent the head and tail of the singly linked list

    public SinglyLinkedList() {
        this.head = null;
    }

    // add a node to the linkedList
    public void addNode(T value) {
        Node<T> current = head; 
        Node<T> newNode = new Node<>(value); // Create a new node 

        if (head == null) { // if head = null means list is empty
            head = newNode; // head gets assigned newNode
        } else {
            while (current.next != null) { 
                current = current.next; 
            }
            current.next = newNode; 
        }
    }

    // add a node at the start of the linkedList
    public void addNodeFirst(T value) {
        Node<T> newNode = new Node<>(value); // Create a new node
        newNode.next = head; // assign the head to newNode.next
        head = newNode; // assign newNode to head
    }

    // display a list of all nodes
    public void showNodes() {
        //Node current will point to head
        Node<T> current = head;  

        if (head == null) {
            System.out.println("List is empty"); 
        } else {
            while (current != null) { //iterate through each node
                //Prints each node by incrementing pointer
                System.out.print(current.value + " "); 
                current = current.next;  //increment pointer
            }
            System.out.println();
        }
    }

    // check is a linkedlist is empty
    public boolean isEmpty() {
        return (size() < 1); // return true when size is less than 1, else return false
    }

    //  return the size of the linkedlist
    public int size() {
        // Node current will point to head
        int counter = 0; 
        Node<T> current = head;  

        if (head == null) { // Checks if the list is empty
            return counter;
        } else {
            while (current != null) { // iterate through each node
                counter++; // increment thr counter
                current = current.next; // shift the current to the next node
            }
        }
        return counter;
    }

    //scans the linkedlist and removes duplicate nodes
    public void removeDuplicateNodes() {
        // Head is the current node
        Node<T> current = head;
        Node<T> index = null;
        Node<T> temp = null;

        // head = null means list is empty
        if (head == null) {
            return;
        }
        // traverse through the list
        else {
            while (current != null) {
                // temp node points to previous node to index.
                temp = current;
                // Index will point to node next to current
                index = current.next;
                while (index != null) {
                    // Check if current node's data is equal to index node's data
                    if (current.value == index.value) {
                        // since node is duplicate skip index and point to next node
                        temp.next = index.next;
                    } else {
                        // Temp will point to previous node of index.
                        temp = index;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

//    /* Inserts a new node after the given prev_node. */
//    public void insertAfter(Node preNode, T value) {
//        /* 1. Check if the given Node is null */
//        if (preNode == null) {
//            System.out.println("The given previous node cannot be null");
//            return;
//        }
//        /* 2 & 3: Allocate the Node & Put in the data*/
//        Node<T> newNode = new Node<>(value); // Create a new node
//        /* 4. Make next of new Node as next of prev_node */
//        newNode.next = preNode.next;
//        /* 5. make next of prev_node as new_node */
//        preNode.next = newNode;
//    }

}

