package com.son.bigDecimal;

import lombok.val;

import java.math.BigDecimal;

public class TestBigDecaimal {
    public static void main(String[] args) {
        val a = new BigDecimal(130.03213445).setScale(4, BigDecimal.ROUND_HALF_UP);
        val b = new BigDecimal(7);
        val c = a.divide(b, 4, BigDecimal.ROUND_HALF_UP);
        System.out.println(c);
    }
}
