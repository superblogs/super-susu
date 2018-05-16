package com.hm.suanfa;

/**
 * 正则
 * DFA 算法屏蔽敏感词
 * NFA 算法
 */
public class DFA {

    public static void main(String[] args) {
        String hello = "你是一个大傻逼";
        boolean h = hello.contains("大傻逼");
        System.out.println(h);

    }
}

