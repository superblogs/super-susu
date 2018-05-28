package com.hm.studyjdk;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Map_Study_Test {


    @Test
    public void mapInit() {
        Map map = new HashMap<Integer, Integer>();

        //@TODO 测试currentMap
        for (long i = 0; i < 100000000; i++) {
            map.put(i, "焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥焦志军是大帅哥");
            System.out.println(map.size());
            System.out.println(System.currentTimeMillis());
        }


        System.out.println(map.size());
        Object str = map.get("value100000");
        System.out.println(str.toString());

    }
}
