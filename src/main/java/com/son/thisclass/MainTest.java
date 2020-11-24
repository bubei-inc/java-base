package com.son.thisclass;

import lombok.val;

public class MainTest {
    public static void main(String[] args) {
        ThisExtend te = new ThisExtend();
        new Thread(() -> {
            try {
                te.subRun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                te.subRun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
