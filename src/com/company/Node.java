package com.company;

//Class node having Generic data-type <T>
public class Node<T> {
    public T value; //Data to store (could be int, string, Object etc)
    public Node<T> next; //Pointer to next node in list

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}