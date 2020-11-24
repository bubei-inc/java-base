package com.sun.juc.threadlocal;

import java.io.IOException;

public class StrongRef {

    public static void main(String[] args) throws IOException {
        // 强引用，
        M m = new M();
        m = null;
        System.gc();

        // gc 在A其他线程， 当前线程需要阻塞
        System.in.read();
    }
}
