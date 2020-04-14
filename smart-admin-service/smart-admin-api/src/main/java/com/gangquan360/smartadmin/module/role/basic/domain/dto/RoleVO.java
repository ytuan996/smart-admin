package com.gangquan360.smartadmin.module.role.basic.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ author ytuan
 * @ date 2020/4/10 22:09
 */
@Data
public class RoleVO {

    @ApiModelProperty("角色ID")
    private Long id;

    @ApiModelProperty("角色名称")
    private String roleName;

    @ApiModelProperty("角色备注")
    private String remark;
}
