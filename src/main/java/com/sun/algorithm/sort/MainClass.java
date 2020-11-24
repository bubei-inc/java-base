package com.sun.algorithm.sort;

import com.sun.algorithm.twoNumSum.TwoNumSum;

public class MainClass {
    public static void main(String[] args) {
//        int[] arr = new int[]{4, 2, 5, 1, 2, 3};
////        arr = SelectSort.sorted(arr);
////        arr = SelectSort.bubboSort(arr);
//        arr = SelectSort.insertSort(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i] + "  ");
//        }
        int[] nums = new int[] {2,7,11,15};
        TwoNumSum twoNumSum = new TwoNumSum();
        System.out.println(twoNumSum.twoSum(nums,6));
        System.out.println("hello");
    }
}
