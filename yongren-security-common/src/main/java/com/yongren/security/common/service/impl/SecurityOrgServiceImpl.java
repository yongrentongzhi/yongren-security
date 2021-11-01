package com.yongren.security.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yongren.security.common.entity.SecurityOrg;
import com.yongren.security.common.mapper.SecurityOrgMapper;
import com.yongren.security.common.service.ISecurityOrgService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织架构表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityOrgServiceImpl extends ServiceImpl<SecurityOrgMapper, SecurityOrg> implements ISecurityOrgService {

}
