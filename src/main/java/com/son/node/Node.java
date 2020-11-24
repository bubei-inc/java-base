package com.son.node;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

@Getter
@Setter
public class Node<K> {

    private Node previous;

    private Node next;

    private K value;


    public Node() {
        this.previous = null;
        this.next = null;
    }

    public Node(K data) {
        this.previous = null;
        this.next = null;
        this.value = data;
    }
}
