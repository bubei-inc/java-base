package com.son.bitoperation;


import lombok.val;

import java.math.BigInteger;

public class BitOperation {
    public static void main(String[] args) {
        String name = "name";
        System.out.println(name.hashCode());
        // 有符号位移
        val bigInt = new BigInteger(String.valueOf(name.hashCode()));
        System.out.println(bigInt.toString(2));
//        System.out.println(name.hashCode() >>> 16);
//        System.out.println(name.hashCode() ^ (name.hashCode() >>> 16));
//        System.out.println(4 >> 1);
//        System.out.println(5 ^ (5 >>> 16));
//        System.out.println(4 ^ 2);
        System.out.println(hash(name));
        System.out.println(15 & name.hashCode());
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
}
