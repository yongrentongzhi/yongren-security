package com.yongren.security.common.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yongren.security.common.entity.SecurityUser;
import org.springframework.stereotype.Repository;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */
@Repository
public interface SecurityUserMapper extends BaseMapper<SecurityUser> {

}
