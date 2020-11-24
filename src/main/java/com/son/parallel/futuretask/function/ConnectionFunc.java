package com.son.parallel.futuretask.function;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ConnectionFunc {
    private Map<String, FutureTask<String>> connectionPoolMap = new ConcurrentHashMap<>();
    Callable<String> callable = new Callable<String>() {
        @Override
        public String call() throws Exception {
            return createConnection();
        }
    };

    private String createConnection() {
        System.out.println("create success!");
        return "create success";
    }

    public String getConnection(String key) throws ExecutionException, InterruptedException {
        FutureTask<String> connection = null;
         connection = connectionPoolMap.get(key);
        if (connection != null) {
            return connection.get();
        }
        FutureTask<String> newTask = new FutureTask<String>(callable);
        connection = connectionPoolMap.putIfAbsent(key, newTask);
        if (connection == null) {
            connection = newTask;
            connection.run();
        }
        return connection.get();

    }
}
