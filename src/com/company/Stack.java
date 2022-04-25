package com.company;

public class Stack<T> {
    private Node<T> head;

    public Stack() {
        head = null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public T pop() {
        if (head == null) {
            return null;
        } else {
            T data = head.getData();
            head = head.getNext();
            return data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    // check if the size of the stack
    public int size() {
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
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