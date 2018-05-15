package com.hm.suanfa;


import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 常见算法复杂度分析
 */
public class Fuzadu {

    /**
     * 复杂度为 O(n)
     */
    private static void sum(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += i;
        }
        System.out.println(res);
    }

    /**
     * 复杂度为O(n) 1/2*n
     */
    public static int[] reverse(int[] array) {
        int size = array.length;
        IntStream.range(0, size / 2).forEach(i -> {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        });
        return array;
    }

    /**
     * 选择排序 O(n^2)
     */
    private static void selectionSort() {

    }

    /**
     * 二分查找法 顺序存储结构
     * O(logN)
     */
    private static void binarySearch() {

    }

    /**
     * 主定理
     */


}
