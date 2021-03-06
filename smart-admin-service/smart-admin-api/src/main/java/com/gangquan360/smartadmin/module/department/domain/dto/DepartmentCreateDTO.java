package com.gangquan360.smartadmin.module.department.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 部门添加数据实体
 *
 * @ author
 * @ date 2020/4/7 0:36
 */
@Data
public class DepartmentCreateDTO {


    @ApiModelProperty("公司名称")
    @Length(min = 1, max = 50, message = "请输入正确的部门名称(1-50个字符)")
    @NotNull(message = "请输入正确的部门名称(1-50个字符)")
    private String name;

    @ApiModelProperty("公司简称")
    private String shortName;

    @ApiModelProperty("负责人id")
    private Long managerId;

    @ApiModelProperty("上级部门id (可选)")
    private Long parentId;

    /**
     * 公司类型
     */
    @ApiModelProperty("公司类型")
    private String type;

    /**
     * 公司地址
     */
    @ApiModelProperty("公司地址")
    private String addr;
    /**
     * 公司简介
     */
    @ApiModelProperty("公司介绍")
    private String desc;
    /**
     * 信用代码
     */
    @ApiModelProperty("信用代码")
    private String code;

    /**
     * 负责人电话
     */
    @ApiModelProperty("负责人电话")
    private String phone;

    /**
     * 负责人邮箱
     */
    @ApiModelProperty("负责人邮箱")
    private String mail;


}
