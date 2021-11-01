package com.yongren.security.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 组织架构表
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */

@ApiModel(value="SecurityOrg对象", description="组织架构表")
public class SecurityOrg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "组织标识")
    private String orgId;

    @ApiModelProperty(value = "组织名称")
    private String orgName;

    private Integer parentOrgId;

    @ApiModelProperty(value = "是否叶子节点")
    private Boolean leaf;

    @ApiModelProperty(value = "组织状态")
    private Integer status;

    @ApiModelProperty(value = "节点层级")
    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "SecurityOrg{" +
                "id=" + id +
                ", orgId='" + orgId + '\'' +
                ", orgName='" + orgName + '\'' +
                ", parentOrgId=" + parentOrgId +
                ", leaf=" + leaf +
                ", status=" + status +
                ", level=" + level +
                '}';
    }
}
