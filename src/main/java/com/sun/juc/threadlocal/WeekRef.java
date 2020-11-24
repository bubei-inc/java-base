package com.sun.juc.threadlocal;

import java.lang.ref.WeakReference;

public class WeekRef {
    public static void main(String[] args) {

        // 遇到gc就回收,一般用在容器里
        // weakHashMap
        WeakReference<M> m = new WeakReference<M>(new M());
        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());
        ThreadLocal<M> l = new ThreadLocal<>();



        l.set(new M());
        l.remove();
        // tl -> threadlocal (strong ref)
        // memory leak 内存泄露
      // threadlocal中Entry() 为啥使用弱引用, 即使是这样还是要每次使用remove()，不然也会有内存泄露。

    }
}
