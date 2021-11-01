package com.yongren.security.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yongren.security.common.mapper")
public class SecurityCommonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityCommonApplication.class,args);
    }
}
