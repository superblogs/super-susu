

package com.hm.suanfa.DFA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;


/**
 * 初始化敏感词库<br>
 * 将敏感词加入到HashMap中<br>
 * 构建DFA算法模型
 *
 * @author dxm
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SensitiveWordInit {

    // 字符编码
    private String ENCODING = "UTF-8";

    {
        System.out.println("读取敏感词库");
    }
    /**
     * 初始化敏感字库
     *
     * @return
     */
    public Map initKeyWord() {

        // 读取敏感词库
        Set<String> wordSet = readSensitiveWordFile();

        // 将敏感词库加入到HashMap中
        return addSensitiveWordToHashMap(wordSet);
    }

    /**
     * 读取敏感词库，将敏感词放入HashSet中，构建一个DFA算法模型：<br>
     * 中 = { isEnd = 0 国 = { isEnd = 1 人 = {isEnd = 0 民 = {isEnd = 1} } 男 = { isEnd = 0 人 = { isEnd =1 } } } }
     * <p>
     * <p>
     * <p>
     * 五 = { isEnd = 0 星 = { isEnd = 0 红 = { isEnd = 0 旗 = { isEnd = 1 } } } }
     */
    public Map addSensitiveWordToHashMap(Set<String> wordSet) {

        // 初始化敏感词容器，减少扩容操作
        Map wordMap = new HashMap(wordSet.size());

        for (String word : wordSet) {
            Map nowMap = wordMap;
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
        }

        return wordMap;
    }

    /**
     * 读取敏感词库中的内容，将内容添加到set集合中
     *
     */
    private Set<String> readSensitiveWordFile() {

        Set<String> wordSet = null;

        // 读取文件
        File file = new File("D:\\work\\project\\personal\\super-susu\\hm-server\\src\\main\\resources\\test.txt");
        try {

            InputStreamReader read = new InputStreamReader(new FileInputStream(file), ENCODING);

            // 文件流是否存在
            if (file.isFile() && file.exists()) {

                StringBuffer sb = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(read);
                String txt;

                // 读取文件，将文件内容放入到set中
                while ((txt = bufferedReader.readLine()) != null) {
                    sb.append(txt);
                }
                bufferedReader.close();

                String str = sb.toString();
                String[] ss = str.split(",");
                wordSet = new HashSet<>(Arrays.asList(ss));
            }

            // 关闭文件流
            read.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return wordSet;
    }
}
