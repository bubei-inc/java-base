package com.son.node;

import lombok.val;

public class NodeFunction<K> {
    private Node<K> first = null;

    private Node<K> current = null;

    // 尾插法
    public void add(K data) {
        val tempNode = new Node<K>(data);
        if (first == null) {
            first = tempNode;
            current = first;
        } else {
            current.setNext(tempNode);
            tempNode.setPrevious(current);
            current = current.getNext();
        }
    }
}
