package com.gangquan360.smartadmin.module.sensormodel.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/9 0:18
 */
@Data
public class SensorModelAddDTO {

    @ApiModelProperty("传感器名称")
    private String sensorName;

    @ApiModelProperty("传感器描述")
    private String sensorDesc;

    @ApiModelProperty("传感器参数(多个参数使用','分隔，多个参数使用':'分隔)")
    private String sensorParam;

}
