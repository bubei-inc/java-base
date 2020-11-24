package com.sun.juc.threadlocal;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;

public class VirtualRef {
    public static void main(String[] args) {
        // 管理堆外内存
        PhantomReference<M> phantomReference = new PhantomReference<>(new M(), new ReferenceQueue<>());

       // 使用场景： JVM 中会使用。  NIO directByteBuffer 直接内存， 堆外内存。 c++ free, java 中unsafe
    }
}
