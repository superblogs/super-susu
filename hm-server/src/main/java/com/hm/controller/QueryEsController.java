package com.hm.controller;

import com.hm.HttpClient.HttpConnectionManager;
import com.hm.dto.HmUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/query")
public class QueryEsController {

    //@todo when query, new HttpConnectionManager

    @Autowired
    private HttpConnectionManager httpConnectionManager;

    AtomicLong atomicLong = new AtomicLong(1);

    @GetMapping
    private List<HmUser> getUser(HttpServletRequest request) {

        return null;
    }

}
