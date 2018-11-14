package com.hm.suanfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 正则
 * DFA 算法屏蔽敏感词 敏感词.csv
 * NFA 算法
 */
public class DFA {

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("你好");
        sets.add("你好吗");


        System.out.println(createWordTree(sets));

    }

    static Map createWordTree(Set<String> words) {
        Map<String, String> wordTree = new HashMap(words.size());

        words.forEach(word -> {
            Map nowMap = wordTree;
            for (int i = 0; i < word.length(); i++) {
                // 转换成char型
                char keyChar = word.charAt(i);

                // 获取
                Object tempMap = nowMap.get(keyChar);

                // 如果存在该key，直接赋值
                if (tempMap != null) {
                    nowMap = (Map) tempMap;
                }

                // 不存在则，则构建一个map，同时将isEnd设置为0，因为他不是最后一个
                else {

                    // 设置标志位
                    Map<String, String> newMap = new HashMap<>();
                    newMap.put("isEnd", "0");

                    // 添加到集合
                    nowMap.put(keyChar, newMap);
                    nowMap = newMap;
                }

                // 最后一个
                if (i == word.length() - 1) {
                    nowMap.put("isEnd", "1");
                }
            }
        });
        return wordTree;
    }


}

