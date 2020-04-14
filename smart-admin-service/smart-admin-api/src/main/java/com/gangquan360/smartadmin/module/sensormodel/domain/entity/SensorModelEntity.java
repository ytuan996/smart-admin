package com.gangquan360.smartadmin.module.sensormodel.domain.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/8 23:59
 */
@Data
@TableName("t_sensor_model")
public class SensorModelEntity extends BaseEntity implements Serializable {

    private String sensorName;

    private String sensorDesc;

    private String sensorParam;

    private Integer isDisable;

    private Integer isDelete;

    private Long createUser;

}
