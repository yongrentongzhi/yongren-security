package com.yongren.security.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 余涛
 */
@SpringBootApplication

public class SecurityClientApplication {

    private static final Logger logger = LogManager.getLogger();


    public static void main(String[] args) {

        SpringApplication.run(SecurityClientApplication.class, args);
        String ip = "";
        try {
            InetAddress addr = InetAddress.getLocalHost();
            ip = addr.getHostAddress().toString();
            logger.debug("读取到服务器网络地址{}", ip);
        } catch (UnknownHostException e) {
            logger.atError().withThrowable(e).log("未知的服务器网络地址" );
        }

        ThreadContext.put("serverIp", ip);
    }


    @Bean
    public PasswordEncoder bcryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}