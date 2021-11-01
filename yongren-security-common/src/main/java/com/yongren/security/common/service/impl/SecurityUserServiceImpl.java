package com.yongren.security.common.service.impl;

import com.yongren.security.common.entity.SecurityUser;
import com.yongren.security.common.mapper.SecurityUserMapper;
import com.yongren.security.common.service.ISecurityUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityUserServiceImpl extends ServiceImpl<SecurityUserMapper, SecurityUser> implements ISecurityUserService {

}
