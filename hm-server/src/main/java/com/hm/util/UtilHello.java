package com.hm.util;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;

import java.util.List;
import java.util.Objects;

public class UtilHello {

    public static Boolean isNameBoolean(String queryName) {

        Segment segment = HanLP.newSegment().enableNameRecognize(true);

        List<Term> termList = segment.seg(queryName);
        if (termList.size() == 1) {
            String partOfSpeech = termList.get(0).toString().split("/" )[1];
            if (Objects.equals(partOfSpeech, "nr" )) {
                System.out.println(queryName+"是名字");
                return true;
            }
        }
        System.out.println(queryName+"不是名字");
        return false;
    }

    public static void main(String[] args) {
        isNameBoolean("雷军");


    }


}
