package com.sun.algorithm.sort;


public class IntSelect {
    // 查询数组总大于数组一半的元素
    public static void main(String[] args) {
        int target = 0;
        int count = 0;
        int[] array = new int[]{1, 2, 2, 2, 2,3,4};
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                target = array[0];
                count++;
            }
            if (target != array[i]) {
                count --;
                if (count == 0) {
                    target = array[i];
                }
            }
        }
        System.out.println(target);
    }

}
