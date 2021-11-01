package com.yongren.security.common.service.impl;

import com.yongren.security.common.entity.SecurityUserRole;
import com.yongren.security.common.mapper.SecurityUserRoleMapper;
import com.yongren.security.common.service.ISecurityUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色关系表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityUserRoleServiceImpl extends ServiceImpl<SecurityUserRoleMapper, SecurityUserRole> implements ISecurityUserRoleService {

}
