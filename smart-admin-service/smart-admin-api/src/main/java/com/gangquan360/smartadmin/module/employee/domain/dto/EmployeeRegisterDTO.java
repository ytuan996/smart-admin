package com.gangquan360.smartadmin.module.employee.domain.dto;

import com.gangquan360.smartadmin.util.SmartVerificationUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * comment: 个人开发用户注册数据实体
 *
 * @author: ytuan996
 * @Date : 2020/4/8 0:15
 */
@Data
public class EmployeeRegisterDTO {

    @ApiModelProperty("姓名")
    @NotNull(message = "姓名不能为空")
    private String actualName;

    @ApiModelProperty("登录名")
    @NotNull(message = "姓名不能为空")
    private String loginName;

    @ApiModelProperty("别名")
    private String nickName;

    @ApiModelProperty("部门id")
//    @NotNull(message = "部门id不能为空")
    private Long departmentId;

    @ApiModelProperty("手机号")
    @NotNull(message = "手机号不能为空")
    @Pattern(regexp = SmartVerificationUtil.PHONE_REGEXP, message = "手机号格式不正确")
    private String phone;

    @ApiModelProperty("身份证(可选)")
    private String idCard;

    @ApiModelProperty("生日(可选)")
    private String birthday;

    @ApiModelProperty("密码")
    @NotNull(message = "密码不能为空")
    @Length(min = 6, message = "密码最少为6位字符")
    private String loginPwd;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("岗位ID 集合")
//    @NotEmpty(message = "岗位ID 集合不能为空")
    private List<Long> positionIdList;

/*    @ApiModelProperty("角色ID集合")
    private List<Long> roleList;*/
}
