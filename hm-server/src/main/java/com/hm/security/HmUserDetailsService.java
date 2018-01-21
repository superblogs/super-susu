package com.hm.security;

import com.hm.dto.HmUser;
import com.hm.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class HmUserDetailsService implements UserDetailsService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info(String.format("登录用户名：%s", username));

        HmUser user = userRepository.findByUsername(username);

        logger.info(String.format("数据库查询到用户：%s", user));

        return new User(username, user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
