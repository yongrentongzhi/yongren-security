package com.yongren.security.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * <p>
 * 字典表
 * </p>
 *
 * @author yongren
 * @since 2021-10-12
 */

@ApiModel(value="SecurityDictionary对象", description="字典表")
public class SecurityDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "字典项值")
    private Integer itemCode;

    @ApiModelProperty(value = "字典项值")
    private String itemValue;

    @ApiModelProperty(value = "字典项描述")
    private String itemDescription;

    @ApiModelProperty(value = "组标识")
    private Integer groupCode;

    @ApiModelProperty(value = "分组名称")
    private String group;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemCode() {
        return itemCode;
    }

    public void setItemCode(Integer itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(Integer groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SecurityDictionary{" +
                "id=" + id +
                ", itemCode=" + itemCode +
                ", itemValue='" + itemValue + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", groupCode=" + groupCode +
                ", group='" + group + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
