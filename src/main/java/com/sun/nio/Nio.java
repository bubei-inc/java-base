package com.sun.nio;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class Nio {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * capacity: buffer容量
         * limit：初始状态limit == capacity, flip()之后limit为缓冲中数据最大位
         * position: 当前游标指示位置
         *
         */
        ByteBuffer btf = ByteBuffer.allocate(1024);
        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.mark());
        System.out.println(btf.position());
        btf.put("hello".getBytes());
        System.out.println("----------------------");
        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.mark());
        System.out.println(btf.position());
        System.out.println("----------------------");
        btf.flip();
        System.out.println(btf.capacity());
        System.out.println(btf.limit());
        System.out.println(btf.mark());
        System.out.println(btf.position());
        System.out.println("----------------------");

    }
}
