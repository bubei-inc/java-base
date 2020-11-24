package com.son.design.singlemode;

public class StaticInnerClassSingle {

    /**
     *
     * classLoader 类加载时，只有单独的线程在执行。
     */
    private StaticInnerClassSingle() {
    }

    private static class SingletonInstance {
        private static final StaticInnerClassSingle STATIC_SINGLE_INSTANCE = new StaticInnerClassSingle();
    }

    public static StaticInnerClassSingle getInstance() {
        return SingletonInstance.STATIC_SINGLE_INSTANCE;
    }
}
