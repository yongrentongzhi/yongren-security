package com.yongren.security.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yongren.security.common.entity.SecurityRole;
import com.yongren.security.common.mapper.SecurityRoleMapper;
import com.yongren.security.common.service.ISecurityRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityRoleServiceImpl extends ServiceImpl<SecurityRoleMapper, SecurityRole> implements ISecurityRoleService {

}
