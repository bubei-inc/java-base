package com.sun.algorithm.sort;

public class SelectSort {

    public SelectSort() {
    }

    // 选择排序
    public static int[] sorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    arr = swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    // 冒泡排序
    public static int[] bubboSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr = swap(arr, j, j + 1);
                }
            }

        }
        return arr;
    }


    // 插入排序
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; --j) {
                arr = swap(arr, j ,j-1);
            }
        }
        return arr;
    }

//    快速排序

    //希尔排序
    //归并排序
    //堆排序



    private static int[] swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        return arr;
    }

}
