package com.gangquan360.smartadmin.module.employee.domain.dto;

import com.gangquan360.smartadmin.common.domain.PageParamDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 员工列表DTO
 *
 * @ author ytuan
 * @ date 2020/4/10 22:16
 */
@Data
public class EmployeeQueryDTO extends PageParamDTO {

    private String phone;

    private String actualName;

    private String keyword;

    private Long departmentId;

    private Integer isLeave;

    private Integer isDisabled;

    /**
     * 删除状态 0否 1是
     */
    @ApiModelProperty("删除状态 0否 1是 不需要传")
    private Integer isDelete;

    @ApiModelProperty("员工id集合")
    private List<Long> employeeIds;

}
