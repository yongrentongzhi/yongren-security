package com.yongren.security.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yongren.security.common.entity.SecurityApi;
import com.yongren.security.common.mapper.SecurityApiMapper;
import com.yongren.security.common.service.ISecurityApiService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 受保护的接口 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityApiServiceImpl extends ServiceImpl<SecurityApiMapper, SecurityApi> implements ISecurityApiService {

}
