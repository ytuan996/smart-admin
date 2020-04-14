package com.gangquan360.smartadmin.module.sensormodel.domain.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/10 22:33
 */
@Data
public class SensorModelResultVO {

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("传感器模型名称")
    private String sensorName;

    @ApiModelProperty("传感器模型描述")
    private String sensorDesc;

    @ApiModelProperty("传感器模型参数")
    private String sensorParam;

    @ApiModelProperty("传感器模型状态")
    private Integer isDisable;

    @ApiModelProperty("创建者")
    private Long createUser;

    /**
     * 更新时间
     */
    @ApiModelProperty("更新时间")
    private Date updateTime;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    private Date createTime;
}
