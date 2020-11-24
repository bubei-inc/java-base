package com.son.design.singlemode;

import com.son.pool.fixedthreadpool.FixedThreadPool;
import com.sun.xml.internal.ws.wsdl.writer.UsingAddressing;

public class LazySingle {

    private static LazySingle LAZY_SINGLE;
    private static LazySingle LAZY_SINGLE_SYNC;
    private static volatile LazySingle LAZY_SINGLE_DCL;

    public LazySingle() {
    }

    public static LazySingle getInstance() {
        // 多线程时， 可能会发生创造多个对象
        if (LAZY_SINGLE == null) {
            LAZY_SINGLE = new LazySingle();
        }
        return LAZY_SINGLE;
    }


    public static LazySingle getSyncInstance() {
        if (LAZY_SINGLE_SYNC == null) {
            // 虽然加了 synchronized 但是在线程还是会进入到 判空这个条件中，还是回执创建对象。 需要在判空之前加上同步标识
            synchronized (LazySingle.class) {
                LAZY_SINGLE_SYNC = new LazySingle();
            }
        }
        return LAZY_SINGLE_SYNC;
    }
    public static LazySingle getDclInstance() {
        if (LAZY_SINGLE_DCL == null) {
            synchronized (LazySingle.class) {
                // 创建对象三个步骤 分配内存空间， 初始化对象， 设置instance指向初始化的对象地址， 但是由于jvm允许java的指令重排序，所以会发生的是就是，在A 线程new 对象时， b获取到的对象已不为null。 返回一个null.
                // 解决方法，给对象加上 volatile， 该关键字的作用不仅仅是保证了对象的原子性，同时还有一个功能就是禁止指令重排序。
                LAZY_SINGLE_DCL = new LazySingle();
            }
        }
        return LAZY_SINGLE_DCL;
    }

}
