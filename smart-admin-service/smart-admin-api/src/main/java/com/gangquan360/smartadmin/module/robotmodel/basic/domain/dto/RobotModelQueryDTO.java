package com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto;

import com.gangquan360.smartadmin.common.domain.PageParamDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 14:07
 */
@Data
public class RobotModelQueryDTO extends PageParamDTO {

    @ApiModelProperty("机器人模型名称")
    private String modelName;

}
