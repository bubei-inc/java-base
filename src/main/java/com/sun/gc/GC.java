package com.sun.gc;


import com.son.stream.Student;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<byte[]> weakReference = new WeakReference<>( new byte[1024*1028*1024]);
        System.out.println(weakReference.get());
        System.gc();
        System.out.println(weakReference.get());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("gcing ......");
    }
}
