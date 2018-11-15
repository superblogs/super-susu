package com.hm.suanfa.DFA;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 敏感词过滤
 *
 * @author dxm
 */
@SuppressWarnings("rawtypes")
public class SensitiveWordFilter {

    private Map sensitiveWordMap;

    // 最小匹配规则
    public static int minMatchTYpe = 1;

    // 最大匹配规则
    public static int maxMatchType = 2;

    // 单例
    private static SensitiveWordFilter inst = null;

    /**
     * 构造函数，初始化敏感词库
     */
    private SensitiveWordFilter() {
        sensitiveWordMap = new SensitiveWordInit().initKeyWord();
    }

    /**
     * 获取单例
     *
     * @return
     */
    public static SensitiveWordFilter getInstance() {
        if (null == inst) {
            inst = new SensitiveWordFilter();
        }
        return inst;
    }

    /**
     * 判断文字是否包含敏感字符
     */
    public boolean isContaintSensitiveWord(String txt, int matchType) {
        boolean flag = false;
        for (int i = 0; i < txt.length(); i++) {

            // 判断是否包含敏感字符
            int matchFlag = this.CheckSensitiveWord(txt, i, matchType);

            // 大于0存在，返回true
            if (matchFlag > 0) {
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 获取文字中的敏感词
     */
    public Set<String> getSensitiveWord(String txt, int matchType) {
        Set<String> sensitiveWordList = new HashSet<>();

        int t = 0;
        for (int i = 0; i < txt.length(); i++) {

            // 判断是否包含敏感字符
            int length = CheckSensitiveWord(txt, i, matchType);

            // 存在,加入list中
            if (length > 0) {
                sensitiveWordList.add(txt.substring(i, i + length));

                // 减1的原因，是因为for会自增
                i = i + length - 1;
            }
            t++;
        }

        System.out.println("txt 的长度为 " + txt.length());
        System.out.println("getSensitiveWord循环循环" + t + "次");

        return sensitiveWordList;
    }

    /**
     * 替换敏感字字符
     */
    public String replaceSensitiveWord(String txt, int matchType, String replaceChar) {

        String resultTxt = txt;

        // 获取所有的敏感词
        Set<String> set = getSensitiveWord(txt, matchType);
        Iterator<String> iterator = set.iterator();
        String word;
        String replaceString;
        while (iterator.hasNext()) {
            word = iterator.next();
            replaceString = getReplaceChars(replaceChar, word.length());
            resultTxt = resultTxt.replaceAll(word, replaceString);
        }

        return resultTxt;
    }

    /**
     * 获取替换字符串
     */
    private String getReplaceChars(String replaceChar, int length) {
        String resultReplace = replaceChar;
        for (int i = 1; i < length; i++) {
            resultReplace += replaceChar;
        }

        return resultReplace;
    }

    /**
     * 检查文字中是否包含敏感字符，检查规则如下：<br>
     * 如果存在，则返回敏感词字符的长度，不存在返回0
     */
    public int CheckSensitiveWord(String txt, int beginIndex, int matchType) {

        // 敏感词结束标识位：用于敏感词只有1位的情况
        boolean isEndFlag = false;

        // 匹配标识数默认为0
        int matchFlag = 0;
        Map nowMap = sensitiveWordMap;
        for (int i = beginIndex; i < txt.length(); i++) {
            char word = txt.charAt(i);

            // 获取指定key
            nowMap = (Map) nowMap.get(word);

            // 存在，则判断是否为最后一个
            if (nowMap != null) {

                // 找到相应key，匹配标识+1
                matchFlag++;

                // 如果为最后一个匹配规则,结束循环，返回匹配标识数
                if ("1".equals(nowMap.get("isEnd"))) {

                    // 结束标志位为true
                    isEndFlag = true;

                    // 最小规则，直接返回,最大规则还需继续查找
                    if (SensitiveWordFilter.minMatchTYpe == matchType) {
                        break;
                    }
                }
            }

            // 不存在，直接返回
            else {
                break;
            }
        }

        // 长度必须大于等于1，为词
        if (matchFlag < 2 || !isEndFlag) {
            matchFlag = 0;
        }
        return matchFlag;
    }

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

        SensitiveWordFilter filter = SensitiveWordFilter.getInstance();
        String txt = "太多的伤感情怀也许只局限于饲养基地 荧幕中的情节，主人公尝试着去用某种方式渐渐的很潇洒地释自杀指南怀那些自己经历的伤感。"
                + "然后法轮功 我们的扮演的角色就是跟随着主人公的喜红客联盟 怒哀乐而过于牵强的把自己的情感也附加于银幕情节中，然后感动就流泪，"
                + "难过就躺在某一个人的怀里尽情的阐述心扉或者手机卡复制器一个人一杯红酒一部电影在夜三级片 深人静的晚上，关上电话静静的发呆着。"
                + "傻逼 王八蛋";
        System.out.println(sdf.format(new Date()));
        String hou = filter.replaceSensitiveWord(txt, 1, "*");
        System.out.println(sdf.format(new Date()));
        System.out.println("替换前的文字为：" + txt);
        System.out.println("替换后的文字为：" + hou);
    }
}
