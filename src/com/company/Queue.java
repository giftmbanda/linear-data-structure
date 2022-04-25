package com.company;

public class Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    // works the same as enqueue() method
    public void add(T value) {
        Node<T> current = head;
        Node<T> newNode = new Node<>(value); // Create a new node

        if (head == null) { // if head = null means queue is empty
            head = newNode; // head gets assigned newNode
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode); // current.next gets assigned newNode
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        } else {
            T data = head.getData();
            head = head.getNext();
            return data;
        }
    }

    // check if the size of the Queue
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

}
