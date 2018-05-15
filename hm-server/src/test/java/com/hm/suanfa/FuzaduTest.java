package com.hm.suanfa;

import org.junit.Test;

import java.util.Date;

public class FuzaduTest{

    @Test
    public  void reverseTest(){
        Date startTime = new Date();
        Fuzadu.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Date endTime = new Date();
        System.out.print("执行程序所需的毫秒数: ");
        System.out.println(endTime.getTime() - startTime.getTime());
    }
}
