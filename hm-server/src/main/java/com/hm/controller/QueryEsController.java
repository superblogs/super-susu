package com.hm.controller;


import com.hm.dto.HmUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/query")
public class QueryEsController {

    //@todo when query, new HttpConnectionManager

    @GetMapping
    private List<HmUser> getUser(HttpServletRequest request) {

        return null;
    }

}
