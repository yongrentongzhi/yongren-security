package com.yongren.security.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;


/**
 * <p>
 * 角色-api关系表
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */

@ApiModel(value="SecurityRoleApi对象", description="角色-api关系表")
public class SecurityRoleApi implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "api标识")
    private Integer apiId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    @Override
    public String toString() {
        return "SecurityRoleApi{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", apiId=" + apiId +
                '}';
    }
}
