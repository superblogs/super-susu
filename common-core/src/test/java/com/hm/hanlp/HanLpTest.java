package com.hm.hanlp;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.seg.Segment;
import com.hm.core.hanlp.TermWrapper;
import org.junit.Test;

import java.util.stream.Collectors;

public class HanLpTest {
    @Test
    public void chineseNameTest() {
        String word = "胡文俭胡文件吕丹丹闫蕾";
        Segment segment = HanLP.newSegment().enableCustomDictionary(true).enableOrganizationRecognize(true).enablePlaceRecognize(true);
        segment.seg(word).stream()
                .map(eachWorld -> new TermWrapper(eachWorld.word, eachWorld.nature.toString(), eachWorld.offset))
                .collect(Collectors.toList())
                .forEach(termWrapper -> System.out.println(termWrapper.getWord() + " " + termWrapper.getNature() + " " + termWrapper.getOffset()));
    }

}
