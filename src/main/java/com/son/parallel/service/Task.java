package com.son.parallel.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.Callable;

@Data
@AllArgsConstructor
public class Task implements Callable<Integer> {
    private Integer first ;
    private Integer second;

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return  this.first + this.second;
    }
}
