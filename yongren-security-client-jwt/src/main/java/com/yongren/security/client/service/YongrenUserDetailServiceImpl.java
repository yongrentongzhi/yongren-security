package com.yongren.security.client.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yongren.security.common.entity.SecurityUser;
import com.yongren.security.common.service.ISecurityUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class YongrenUserDetailServiceImpl implements UserDetailsService {
    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private PasswordEncoder bcryptPasswordEncoder;
    @Resource
    private ISecurityUserService securityUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        QueryWrapper<SecurityUser> securityUserQueryWrapper = new QueryWrapper<>();
        securityUserQueryWrapper.eq("account", s).or().eq("phone", s);
        SecurityUser user = securityUserService.getOne(securityUserQueryWrapper);
        String account = user.getAccount();
        ThreadContext.put("userName",account);


        return null;
    }
}
