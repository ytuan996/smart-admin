package com.gangquan360.smartadmin.module.department.domain.dto;

import com.gangquan360.smartadmin.module.employee.domain.dto.EmployeeRegisterDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * comment: 公司注册数据实体
 *
 * @author: ytuan996
 * @Date : 2020/4/7 22:03
 */
@Data
public class DepartmentRegisterDTO {

    // 公司相关信息

    @ApiModelProperty("公司名称")
    @Length(min = 1, max = 50, message = "请输入正确的部门名称(1-50个字符)")
    @NotNull(message = "请输入正确的部门名称(1-50个字符)")
    private String name;

    @ApiModelProperty("公司简称")
    private String shortName;

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

    // 超级用户相关信息

    @ApiModelProperty("超级用户相关信息")
    private EmployeeRegisterDTO employeeRegisterDTO;

}
