package com.hm.es;

import com.hm.HttpClient.HttpConnectionManager;
import com.hm.util.UtilHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/query")
public class QueryEsController {

    //@todo when query, new HttpConnectionManager

    @Autowired
    private HttpConnectionManager httpConnectionManager;


    @GetMapping(value = "getEsData")
    private String getEsData(HttpServletRequest request) {
        System.out.println(request);
        UtilHello.isNameBoolean(request.toString());


        return "hahfdjshfjkdsahfjsdhf";
    }

}
