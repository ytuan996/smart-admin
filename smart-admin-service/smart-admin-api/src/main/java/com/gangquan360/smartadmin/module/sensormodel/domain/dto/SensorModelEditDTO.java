package com.gangquan360.smartadmin.module.sensormodel.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/14 22:28
 */
@Data
public class SensorModelEditDTO {

    private Long id;

    @ApiModelProperty("传感器名称")
    private String sensorName;

    @ApiModelProperty("传感器描述")
    private String sensorDesc;

    @ApiModelProperty("传感器参数(多个参数使用','分隔，多个参数使用':'分隔)")
    private String sensorParam;
}
