package com.hm.util;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;

public class UtilHello {

    public static Boolean isName(String queryName) {

        Segment segment = HanLP.newSegment().enableNameRecognize(true);

        List<Term> termList = segment.seg(queryName);
        System.out.println(termList);

        return null;
    }

    public static void main(String[] args) {
        isName("喝完酒");
        isName("胡文件");
        isName("胡文俭");
        isName("刘晶");
    }



}
