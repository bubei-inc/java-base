package com.son.link;

import lombok.val;

public class LinkTestMain {
    //第一个节点
    Node first;
    //第二个节点
    Node last;
    //节点数
    int size;

    public Object  remove(Object ele) {
        // 先找到这个要被删除的节点
        Node current = this.first;
        for (int i = 0; i <size ; i++) {
            if (!current.ele.equals(ele)) {
                if (current.next == null){
                    return "集合中不存在含有此元素的节点";
                }
                current = current.next;
            }
        }
        //删除的节点
        if (current == first){
            first =current.next ;
            current.next.prev =null;
            size--;
            return "";
        }else if (current == last){
            last =current.prev;
            current.prev.next =null;
            size--;
            return "";
        }else{
            current.next.prev =current.prev;
            current.prev.next = current.next;
            size--;
            return "";
        }
    }


    //使用类来描述 接点这类输入
    class Node{
        //表示上一个节点
        Node  prev;
        //表示下一个节点
        Node next;
        //当前节点中存在的元素
        Object ele;

        public Node(Object ele) {
            this.ele = ele;
        }
    }
    //获取当前的节点数
    public  int getSize(){
        return size;
    }
    //在第一个位置增加一个节点
    public void addFirst(Object ele) {
        Node node = new Node(ele);
        if (size == 0){
            this.first = node;
            this.last = node;
        }else{
            this.first.prev = node;
            node.next =this.first;
            this.first = node;
        }
        size++;
    }

    //在最后添加一个节点
    public void addLast(Object ele) {
        Node node = new Node(ele);
        if (size == 0){
            this.first =node;
            this.last = node;
        }else{
            this.last.next= node;
            node.prev = this.last;
            this.last =node;
        }
        size++;
    }
    //list的toString
    @Override
    public String toString(){
        if (size == 0) {
            return "[]";
        }else{
            Node current = this.first;
            StringBuilder sb = new StringBuilder(size*2-1);
            sb.append("[");
            for (int i = 0; i <size ; i++) {
                sb.append(current.ele);
                if (i!=size-1) {
                    sb.append(",");
                }else {
                    sb.append("]");
                }
                current = current.next;
            }
            return sb.toString();
        }
    }
}
