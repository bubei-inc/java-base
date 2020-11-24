package com.sun.algorithm.twoNumSum;

import java.util.HashMap;

public class TwoNumSum {
    public TwoNumSum() {
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int[] num = new int[]{i, j};
                if (target == nums[i] + nums[j]) {
                    return num;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println("hello");
    }
}
