package com.hm.yewu.esdata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EsCompanyController {


    private Logger logger = LoggerFactory.getLogger(EsCompanyController.class);

    @PostMapping
    public List queryByCompanyName(@RequestBody QueryDto queryDto) {
        logger.info("query :" + queryDto.toString());

        return null;
    }

    /**
     * give a q
     * return a Class Q
     */
    public Q analysisString(String str) {


        return new Q();
    }

    public Boolean isChinaName(String str) {

        return true;
    }
}
