package com.hm.yewu.esdata;

import com.hm.yewu.esdata.dto.Q;
import com.hm.yewu.esdata.dto.QueryDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EsController {


    private Logger logger = LoggerFactory.getLogger(EsController.class);

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

    public Boolean isChineseName(String str) {

        return true;
    }
}
