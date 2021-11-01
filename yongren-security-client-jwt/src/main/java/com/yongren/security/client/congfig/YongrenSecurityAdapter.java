package com.yongren.security.client.congfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 余涛
 */
@Configuration
public class YongrenSecurityAdapter extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LogManager.getLogger();
    @Autowired
    private UserDetailsService yongrenUserDetailServiceImpl;

    @Autowired
    private PasswordEncoder bcryptPasswordEncoder;


    @Override
    public void configure(WebSecurity web) throws Exception {
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(yongrenUserDetailServiceImpl).passwordEncoder(bcryptPasswordEncoder);
    }
}
