package com.hm.es;

import com.alibaba.fastjson.JSON;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by huwenjian on 2017/9/24.
 */
public class GetEsData {


    public static EsBaseDto getInfoByName(String url, String querySql) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<String> entity = new HttpEntity<>(querySql, headers);
        ResponseEntity out = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
        String returnBody = String.valueOf(out.getBody());
        return JSON.parseObject(returnBody, EsBaseDto.class);
    }
}
