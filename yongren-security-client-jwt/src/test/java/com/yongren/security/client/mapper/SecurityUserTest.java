package com.yongren.security.client.mapper;

import com.yongren.security.common.entity.SecurityUser;
import com.yongren.security.common.mapper.SecurityUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@SpringBootTest
public class SecurityUserTest {

    @Resource
    private SecurityUserMapper securityUserMapper;

    @Autowired
    private PasswordEncoder byPasswordEncoder;

    @Test
    public void getSecurityUserMapperTest() {
        System.out.println(securityUserMapper);
    }

    @Test
    public void insertTest() {
        SecurityUser yongren = new SecurityUser();
        yongren.setId(1);
        yongren.setUsername("永仁");
        yongren.setAccount("yongren");
        yongren.setPhone("17695655702");
        yongren.setOrganizationName("管理组");
        yongren.setOrganizationId("admin");
        yongren.setStatus(1);
        LocalDateTime now = LocalDateTime.now();
        yongren.setCreateTime(now);
        securityUserMapper.insert(yongren);
    }

    @Test
    public void updateTest() {
        SecurityUser yongren = new SecurityUser();
        yongren.setId(1);
        yongren.setUsername("永仁");
        yongren.setAccount("yongren");
        yongren.setPassword(byPasswordEncoder.encode("yongren"));
        yongren.setPhone("17695655702");
        yongren.setOrganizationName("管理组");
        yongren.setOrganizationId("admin");
        yongren.setStatus(1);
        securityUserMapper.updateById(yongren);
    }

    @Test
    public void selectTest() {
        SecurityUser securityUser = securityUserMapper.selectById("1");
        System.out.println(securityUser);
    }
}
