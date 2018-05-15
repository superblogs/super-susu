package com.hm.suanfa;

import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

public class FuZaduTest {

    @Test
    public  void reverseTest(){
        Date startTime = new Date();
        int array[]=Fuzadu.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int[] resultArray = new int[]{9,8,7,6,5,4,3,2,1};
        Date endTime = new Date();
        System.out.print("执行程序所需的毫秒数: ");
        System.out.println(endTime.getTime() - startTime.getTime());
        if(Arrays.equals(array,resultArray))
            System.out.println("两个array相同 reverse success!");
        else
            System.out.println("reverse filed");

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,1));
    }
}
