package com.yongren.security.common.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yongren.security.common.entity.SecurityDictionary;
import com.yongren.security.common.mapper.SecurityDictionaryMapper;
import com.yongren.security.common.service.ISecurityDictionaryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Service
public class SecurityDictionaryServiceImpl extends ServiceImpl<SecurityDictionaryMapper, SecurityDictionary> implements ISecurityDictionaryService {

}
