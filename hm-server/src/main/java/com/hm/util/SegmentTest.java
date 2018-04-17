package com.hm.util;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SegmentTest {
    public static void main(String[] args) {
        String[] testCase = new String[]{
                "我在上海林原科技有限公司兼职工作，",
                "同时在上海外国语大学日本文化经济学院学习经济与外语。",
                "我经常在台川喜宴餐厅吃饭，",
                "偶尔去地中海影城看电影。",
                "北京小米科技有限公司",
        };
        Segment segment = HanLP.newSegment().enableOrganizationRecognize(true);
        for (String sentence : testCase)
        {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }
}
