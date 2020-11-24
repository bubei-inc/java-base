package com.son.base.DCL;

public class DoubleCheckLock {
    public static DoubleCheckLock INSTANCE;

    public DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        if (INSTANCE == null ) { // douoble check lock
            // if a in first then blocked , then b in and new a instance, but now a is null, if there have no second check, will new two instance.
            // volatile 防止指令重排序。
            synchronized (DoubleCheckLock.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLock();
                }
                return INSTANCE;
            }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
               System.out.println(DoubleCheckLock.getInstance().hashCode());
            }).start();
        }
    }
}
