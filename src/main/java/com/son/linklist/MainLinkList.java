package com.son.linklist;

public class MainLinkList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Node<Integer> node = new Node<>();
            node.setData(i);
            linkedList.add(node);
        }
        System.out.println(linkedList.getHead().getData());
        System.out.println(linkedList.getHead().getNext().getData());
        System.out.println(linkedList.getHead().getNext().getNext().getData());
    }
}
