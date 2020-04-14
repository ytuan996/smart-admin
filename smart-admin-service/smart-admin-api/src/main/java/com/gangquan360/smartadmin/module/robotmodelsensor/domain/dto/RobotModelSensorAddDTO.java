package com.gangquan360.smartadmin.module.robotmodelsensor.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:43
 */
@Data
public class RobotModelSensorAddDTO {
    private List<Long> sensorIdList;

    private Long modelId;

    public RobotModelSensorAddDTO() {
    }

    public RobotModelSensorAddDTO(List<Long> sensorIdList, Long modelId) {
        this.sensorIdList = sensorIdList;
        this.modelId = modelId;
    }
}
