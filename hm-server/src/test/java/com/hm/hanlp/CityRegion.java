package com.hm.hanlp;

import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;

import java.util.List;

public class CityRegion {

    @org.junit.Test
    public void nlpDemo() {
        List<Term> termList = NLPTokenizer.segment("北京市通州区工业开发区云杉南路38号");
        System.out.println(termList);
    }

}
