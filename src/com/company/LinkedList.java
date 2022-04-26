package com.company;

public class LinkedList<T>  {

    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    /*
     * this addNode() method is used to add a node at the end of the list
     * works the same as add() method
     */
    public void addNode(T value) {
        Node<T> current = head;
        Node<T> newNode = new Node<>(value); // Create a new node

        if (head == null) { // if head = null means list is empty
            head = newNode; // head gets assigned newNode
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode); // current.next gets assigned newNode
        }
    }

    /*
     * add a node at the start of the linkedList
     * works the same as the addAtStart() method
     */
    public void addNodeFirst(T value) {
        Node<T> newNode = new Node<>(value); // Create a new node
        newNode.setNext(head); // assign the head to newNode.next
        head = newNode; // assign newNode to head
    }

    // delete a node with the given value
    public void delete(T value) {
        Node<T> current = head;
        Node<T> previous = null;

        while (current != null) {
            if (current.getData().equals(value)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
            }
            previous = current;
            current = current.getNext();
        }
    }

    // get the size of the linkedList
    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    // scans the linkedlist and removes duplicate nodes
    public void removeDuplicates() {
        Node<T> current = head;
        while (current != null) {
            Node<T> runner = current;
            while (runner.getNext() != null) {
                if (runner.getNext().getData().equals(current.getData())) {
                    runner.setNext(runner.getNext().getNext());
                } else {
                    runner = runner.getNext();
                }
            }
            current = current.getNext();
        }
    }

    /*
     * this add() method is used to add a node at the end of the list
     * works the same as addNode() method
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /*
     * add a node at the start of the linkedList
     * works the same as the addNodeFirst() method
     */
    public void addAtStart(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }
}
