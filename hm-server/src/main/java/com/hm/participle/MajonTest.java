package com.hm.participle;

import me.yingrui.segment.core.SegmentResult;
import me.yingrui.segment.core.SegmentWorker;
import me.yingrui.segment.core.SegmentWorkerBuilder;

import java.util.HashMap;
import java.util.Map;

public class MajonTest {

    public static void main(String[] args) {

        String sentence = "胡文件";

        Map<String, String> params = new HashMap<>();
        params.put("minimize.word", "true");
        SegmentWorker worker = SegmentWorkerBuilder.build(params);
        SegmentResult result = worker.segment(sentence);
        System.out.println(result);


    }
}
