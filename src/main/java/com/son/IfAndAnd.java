package com.son;

public class IfAndAnd {
    public static void main(String[] args) {

        // && 中第一个为false之后不会执行后面&&的操作
        if (get() && get1()) {
            System.out.println("AND AND!");
        }
        /**
         * get false
         */

// 前后都执行
        if (get() || get1()) {
            System.out.println(" true or ");
        }else {
            System.out.println("false or");
        }

        /**
         *  get false
         *  get 1 true
         *  true or
         */

    }
    public static boolean get() {
        System.out.println("get false");
        return false;
    }

    public static boolean get1() {
        System.out.println("get 1 true");
        return true;
    }

}
