package com.sun.juc.threadlocal;

import java.lang.ref.SoftReference;

public class SoftRef {

    public static void main(String[] args) {

        // -Xmx:20 -Xms:20
        SoftReference<byte[]> m = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(m.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.get());
        // 堆中只有 10M, < 20 M 内存够使用
        byte[] b = new byte[1024*1024*15];
        // +15M 堆内存不够使用， 干掉软引用， 重新加入15M
        // 主要用于缓存, 数据库数据，空间不够时可以存在，不够时gc掉;
        System.out.println(m.get());
    }
}
