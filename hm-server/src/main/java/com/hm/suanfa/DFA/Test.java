package com.hm.suanfa.DFA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class Test {

    public static void main(String... args) {
        HashMap hashMap = new HashMap();

        hashMap.put("1", "one");
        hashMap.put("2", "two");
        hashMap.put("3", "three");
        hashMap.put("4", "four");
        hashMap.put("5", "five");

        HashMap hashMapp = hashMap;
        hashMapp.put("6", "six");

        HashMap hashMap3 = hashMapp;

        hashMap3 = new HashMap();
        hashMap3.put("new", "newewew");

        System.out.println(hashMap);
        System.out.println(hashMapp);
        System.out.println(hashMap3);
        System.out.println(hashMap.get("1"));

        Set set = new HashSet();
        set.add("你好");
        set.add("好吗");
        set.add("我是");
        set.add("你爸爸");

        HashMap hashMap1 = (HashMap) new SensitiveWordInit().addSensitiveWordToHashMap(set);
        String s = "你好";
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            System.out.println(word);
            System.out.println(hashMap1.get(word));
        }


    }
}
