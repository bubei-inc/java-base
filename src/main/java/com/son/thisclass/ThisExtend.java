package com.son.thisclass;

public class ThisExtend extends ThisClass {
    public void subRun() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(1000);
            run();

            System.out.println("son extend");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
