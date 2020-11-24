package com.son.linklist;

import lombok.Data;

@Data
public class LinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;

    public Node<T> add(Node<T> current) {
        if (head == null) {
            head = current;
            tail = head;
        } else {
            current.setPrev(tail);
            tail.setNext(current);
            tail = current;
        }
        return tail;
    }
}
