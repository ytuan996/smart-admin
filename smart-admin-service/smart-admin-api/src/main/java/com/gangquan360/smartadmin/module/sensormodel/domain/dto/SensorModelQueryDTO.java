package com.gangquan360.smartadmin.module.sensormodel.domain.dto;

import com.gangquan360.smartadmin.common.domain.PageParamDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/10 22:34
 */
@Data
public class SensorModelQueryDTO extends PageParamDTO {

    @ApiModelProperty("传感器名称")
    private String sensorName;
}
