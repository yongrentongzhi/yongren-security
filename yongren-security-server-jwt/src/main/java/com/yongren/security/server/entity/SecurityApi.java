package com.yongren.security.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 受保护的接口
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */

@ApiModel(value="SecurityApi对象", description="受保护的接口")
public class SecurityApi implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "接口名称")
    private String apiName;

    @ApiModelProperty(value = "受保护的url")
    private String apiUrl;

    @ApiModelProperty(value = "父节点标识")
    private Integer parentApiId;

    @ApiModelProperty(value = "是否叶子节点")
    private Boolean leafFlag;

    @ApiModelProperty(value = "节点层级")
    private Integer level;

    @ApiModelProperty(value = "排序权重")
    private Integer sort;

    @ApiModelProperty(value = "权限状态")
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public Integer getParentApiId() {
        return parentApiId;
    }

    public void setParentApiId(Integer parentApiId) {
        this.parentApiId = parentApiId;
    }

    public Boolean getLeafFlag() {
        return leafFlag;
    }

    public void setLeafFlag(Boolean leafFlag) {
        this.leafFlag = leafFlag;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SecurityApi{" +
                "id=" + id +
                ", apiName='" + apiName + '\'' +
                ", apiUrl='" + apiUrl + '\'' +
                ", parentApiId=" + parentApiId +
                ", leafFlag=" + leafFlag +
                ", level=" + level +
                ", sort=" + sort +
                ", status=" + status +
                '}';
    }
}
