package com.hm.controller;

import com.hm.dto.HmUser;
import com.hm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    @ResponseBody
    private List<HmUser> getUser(@RequestBody HttpServletRequest request) {
        List<HmUser> users = userRepository.findAll();
        return users;
    }

}
