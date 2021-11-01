package com.yongren.security.common.service.impl;

import com.yongren.security.common.entity.SecurityRoleApi;
import com.yongren.security.common.mapper.SecurityRoleApiMapper;
import com.yongren.security.common.service.ISecurityRoleApiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色-api关系表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityRoleApiServiceImpl extends ServiceImpl<SecurityRoleApiMapper, SecurityRoleApi> implements ISecurityRoleApiService {

}
