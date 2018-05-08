package com.hm.suanfa;


/**
 * 二分法
 * 当数据量很大适宜采用该方法。采用二分法查找时，数据需是排好序的。
 * 主要思想是：（设查找的数组区间为array[low, high]）
 * <p>
 * 确定该区间的中间位置K（2）将查找的值T与array[k]比较。若相等，查找成功返回此位置；否则确定新的查找区域，
 * 继续二分查找。区域确定如下：a.array[k]>T 由数组的有序性可知array[k,k+1,……,high]>T;故新的区间为array[low,……，K-1]b.array[k]<T
 * 类似上面查找区间为array[k+1,……，high]。
 * 每一次查找与中间值比较，可以确定是否查找成功，不成功当前查找区间缩小一半，递归找，即可。
 * 时间复杂度:O(log2n)。
 * 时间复杂度
 * 1.最坏情况查找最后一个元素（或者第一个元素）Master定理T(n)=T(n/2)+O(1)所以T(n)=O(log2n)
 * 2.最好情况查找中间元素O(1)查找的元素即为中间元素（奇数长度数列的正中间，偶数长度数列的中间靠左的元素）
 * 空间复杂度 S(n)=n
 */
public class Dialectical {


    private static int erfenfa(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (value == array[middle]) {
                return middle;
            }
            if (value > array[middle]) {
                low = middle + 1;
            }
            if (value < array[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int value = erfenfa(a, 8);
        System.out.println(value);
    }
}
