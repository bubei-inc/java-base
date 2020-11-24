package com.son.parallel.futuretask;

import com.son.parallel.futuretask.function.ConnectionFunc;

import java.util.concurrent.ExecutionException;

public class FutureTaskClass {
    // future task 如何保证在高并发的情况下任务只执行一次
    //假设有一个带key的连接池，当key存在时，即直接返回key对应的对象；当key不存在时，则创建连接。对于这样的应用场景，通常采用的方法为使用一个Map对象来存储key和连接池对应的对应关系.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConnectionFunc func = new ConnectionFunc();
        func.getConnection("hello");
    }
}
